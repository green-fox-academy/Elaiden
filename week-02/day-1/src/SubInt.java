import java.util.Arrays;
import java.util.Scanner;

public class SubInt {

  public static void main(String[] args) {

    //  Create a function that takes a number and an array of integers as a parameter
    //  Returns the indices of the integers in the array of which the first number is a part of
    //  Or returns an empty array if the number is not part of any of the integers in the array

    //  Example:
    //  System.out.println(subInt(1, new int[] {1, 11, 34, 52, 61}));
    //  should print: `[0, 1, 4]`
    //  System.out.println(subInt(9, new int[] {1, 11, 34, 52, 61}));
    //  should print: '[]'

    Scanner scanner = new Scanner(System.in);
    System.out.print("Give me a number to look for in the array: ");
    int number = scanner.nextInt();
    System.out.print("Type in the array size: ");
    int size = scanner.nextInt();
    int[] arrayToPlay = new int[size];
    System.out.println("Now add the numbers in the array:");

    for (int i = 0; i < arrayToPlay.length; i++) {
      arrayToPlay[i] = scanner.nextInt();
    }
    System.out.println(Arrays.toString(subInt(number, arrayToPlay)));

  }

  public static int[] subInt(int num, int[] array) {
    int[] numberFound = new int[array.length];
    String checkNum;
    String numToString = "" + num;
    int db = 0;
    for (int i = 0; i < array.length; i++) {
      checkNum = "" + array[i];
      if (checkNum.contains(numToString)) {
        numberFound[db] = i;
        db++;
      }
    }
    int[] finalArray = new int[db];
    for (int i = 0; i < db; i++) {
      finalArray[i] = numberFound[i];
    }
    return finalArray;
  }
}



