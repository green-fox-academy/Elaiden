public class Swap {

    public static void main(String[] args) {

        int a = 123;
        int aOriginal = a;
        int b = 526;

        a = b;
        b = aOriginal;

        System.out.println(a);
        System.out.println(b);

    }
}
