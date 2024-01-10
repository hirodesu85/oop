public class Number {
    public static void main(String[] args) {
        int d1 = 0,
            d2 = 0,
            d3 = 1,
            d4 = 2,
            d5 = 0,
            d6 = 2,
            d7 = 2,
            d8 = 1,
            d9 = 0,
            da = 0,
            db = 2,
            dc = 6,
            dd = 2;
        int v1 = d1 + d3 + d5 + d7 + d9 + db,
            v3 = d2 + d4 + d6 + d8 + da + dc,
            vv = (3*v3 + v1 + dd) % 10;
        System.out.println(vv);
    }
}
