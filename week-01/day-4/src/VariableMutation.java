public class VariableMutation {

    public static void main(String[] args) {

        int a = 3;
        a += 10;

        System.out.println("a: " + a);

        int b = 100;
        b -= 7;

        System.out.println("b: " + b);

        int c = 44;
        c *= 2;

        System.out.println("c: " + c);

        int d = 125;
        d /= 5;

        System.out.println("d: " + d);

        int e = 8;
        e = (int)Math.pow(e, 3);

        System.out.println("e: " + e);

        int f1 = 123;
        int f2 = 345;
        System.out.print("f: ");
        System.out.println(f1 > f2);

        int g1 = 350;
        int g2 = 200;
        System.out.print("g: ");
        System.out.println(g2 * 2 > g1);
        // tell if the double of g2 is bigger than g1 (print as a boolean)

        int h = 135798745;
        System.out.print("h: ");
        System.out.println(h % 11 == 0);
        // tell if it has 11 as a divisor (print as a boolean)

        int i1 = 10;
        int i2 = 3;
        System.out.print("i: ");
        System.out.println((i1 > Math.pow(i2, 2)) && (i1 < Math.pow(i2, 3)));
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)

        int j = 1521;
        System.out.print("j: ");
        System.out.println((j % 3 == 0) || (j % 5 == 0));
        // tell if j is dividable by 3 or 5 (print as a boolean)

    }
}
