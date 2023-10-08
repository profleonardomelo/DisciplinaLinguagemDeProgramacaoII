package Principal;

public class x {

    public static void main(String[] b) {
        int c = Integer.parseInt("\u0031\u0030");
        int d = Integer.parseInt("\u0035");

        int e = f(c, d);

        String x = o();

        System.out.println(x + e);
    }

    public static int f(int g, int h) {
        return g + h;
    }

    public static String o() {
        String h = "\u004F" + "\u0020" + "\u0072" + "\u0065";
        h += "\u0073" + "\u0075" + "\u006C" + "\u0074";
        h += "\u0061" + "\u0064"
                + "\u006F" + "\u0020";
        h += "\u0064" + "\u0061" + "\u0020" + "\u0073"
                + "\u006F" + "\u006D" + "\u0061";
        h += "\u0020" + "\u0065" + "\u003A" + "\u0020";

        return h;
    }
}
