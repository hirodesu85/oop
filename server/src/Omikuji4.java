class Omikuji4 extends Omikuji2 {
  void print() {
    System.out.println(second() + last() + first());
  }
  public static void main(String[] args) {
    (new Omikuji4()).print();
  }
}