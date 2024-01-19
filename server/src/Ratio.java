// public, privateというキーワードについては，とりあえず無視して考えてよい．
class Ratio { // 分数を表すクラス（「レシオ」と読むよ）
  private long num; // 分子 (numerator)
  private long denom; // 分母 (denominator)
  public Ratio(long num, long denom) {
  long g = gcd(num, denom); // 約分するために最大公約数を求める．
    this.num = num / g;
    this.denom = denom / g; // 分母が負にならないようにする
    if (this.denom < 0) {
      this.num *= -1;
      this.denom *= -1;
    }
  }
  private static long gcd(long p, long q) { // 最大公約数を計算する．
    if (q == 0) {
      return p;
    } else {
      return gcd(q, p % q);
    }
  }
  // 公開するメソッド
  @Override
  public String toString() { // 文字列への変換の定義
    if (denom == 1) {
      return Long.toString(num);
    } else {
      return num + "/" + denom;
    }
  }
  @Override
  public boolean equals(Object obj) {
    // 「等しさ」の定義: objがthisと「等しい」ならtrue，さもなければfalse
    if (obj instanceof Ratio) { // 相手もRatio?
      Ratio r = (Ratio)obj;
      return denom == r.denom && num == r.num; // 分母，分子がそれぞれ等しい
    } else {
      return false;
    }
  }
  // 内部的に利用するメソッド
  private Ratio multiply(long num, long denom) {
    long n = this.num * num;
    long d = this.denom * denom;
    return new Ratio(n, d);
  }
  private Ratio add(long num, long denom) {
    long n = this.num * denom + num * this.denom;
    long d = this.denom * denom;
    return new Ratio(n, d);
  }
  // 分数どうしの加減乗除
  public Ratio multiply(Ratio r) {
    // thisとrをかけた結果のRatioを作って返す
    return multiply(r.num, r.denom);
  }
  public Ratio add(Ratio r) {
    // thisとrを足した結果のRatioを作って返す
    return add(r.num, r.denom);
  }
  public Ratio subtract(Ratio r) {
    // thisからrを引いた結果のRatioを作って返す
    return add(-r.num, r.denom);
  }
  public Ratio divide(Ratio r) {
    // thisをrで割った結果のRatioを作って返す
    return multiply(r.denom, r.num);
  }
  // 整数との加減乗除
  public Ratio add(long i) {
    return add(i, 1); 
  }
  public Ratio subtract(long i) {
    return add(-i) ; 
  }
  public Ratio multiply(long i) { 
    return multiply(i, 1); 
  }
  public Ratio divide(long i) { 
    return multiply(1, i); 
  }
  public static void main(String[] args) {
    Ratio one = new Ratio(1, 1);
    System.out.println("one = " + one);
    Ratio r1 = one.divide(2); // 1/2
    Ratio r2 = one.divide(3); // 1/3
    Ratio r3 = r2.multiply(2); // 2/3
    System.out.println("r1 = " + r1);
    System.out.println("r2 = " + r2);
    System.out.println("r3 = " + r3);
    // RatioとRatioの演算のテスト
    System.out.printf("%s + %s = %s\n", r1, r2, r1.add(r2));
    System.out.printf("%s - %s = %s\n", r1, r2, r1.subtract(r2));
    System.out.printf("%s * %s = %s\n", r1, r2, r1.multiply(r2));
    System.out.printf("%s / %s = %s\n", r1, r2, r1.divide(r2));
    // Ratioとlongの演算のテスト
    System.out.printf("%s + %d = %s\n", r3, 2, r3.add(2));
    System.out.printf("%s - %d = %s\n", r3, 2, r3.subtract(2));
    System.out.printf("%s * %d = %s\n", r3, 2, r3.multiply(2));
    System.out.printf("%s / %d = %s\n", r3, 2, r3.divide(2));
    Ratio r4 = r2.multiply(4).divide(5).add(1).multiply(2).subtract(1);
    // r4 = ((1/3) * 4 / 5 + 1) * 2 - 1
    System.out.println(r4);
  }
}
