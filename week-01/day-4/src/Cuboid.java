public class Cuboid {

    public static void main(String[] args) {

        double a = 10;
        double b = 8;
        double c = 15;

        double surfaceArea = 2 * (a * b + a * c + b * c);
        double volume = a * b * c;

        System.out.println("Surface Area: " + Math.round(surfaceArea));
        System.out.println("Volume: " + Math.round(volume));

    }
}
