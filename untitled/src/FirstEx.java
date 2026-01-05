import java.util.Arrays;

public class FirstEx {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String concat(int a, String b) {
        return Integer.toString(a) + b;
    }

    public static String insertInArray(String[] a, String b){
        return a[0] + a[1] + a[2] + b + a[3] + a[4];
    }


    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int res = multiply(a, b);
        System.out.println(res);

        int x = 5;
        String y = " is a number";
        String result = concat(x, y);
        System.out.println(result);

        String[] words = new String[5];
        words[0] = "From ";
        words[1] = "the ";
        words[2] = "River ";
        words[3] = "the ";
        words[4] = "Sea ";
        String insert = "to ";
        System.out.println(insertInArray(words, insert));
    }
}