public class DefineBasicInfo {

    public static void main(String[] args) {

        String name = "Gabor";
        int age = 35;
        double height = 1.79;
        boolean married = false;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + "m");

        if (married) {
            System.out.println("Married: yes");
        } else {
            System.out.println("Married: no");
        }

    }
}
