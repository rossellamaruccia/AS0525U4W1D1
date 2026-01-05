import java.util.Scanner;

public class SecondEx  {
    public static String print(String a, String b, String c) {
        return a + " " + b + " " + c;
    }

    public static String printReverse(String a, String b, String c) {
        return c + " " + b + " " + a;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word you want to insert: ");
        String a = input.nextLine();
        System.out.println("Enter the second word you want to insert: ");
        String b = input.nextLine();
        System.out.println("Enter the third word you want to insert: ");
        String c = input.nextLine();
        System.out.println(print(a, b, c));
        System.out.println(printReverse(a, b, c));
    }
}