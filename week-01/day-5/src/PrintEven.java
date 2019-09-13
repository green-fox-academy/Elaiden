public class PrintEven {

    public static void main(String[] args) {

        for (int i = 0; i <= 500; i++) {
            if (i == 0) {
                System.out.println("0");
            } else if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        
    }
}
