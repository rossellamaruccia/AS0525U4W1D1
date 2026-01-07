import java.util.Arrays;

public class FirstEx {
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static String concat(int a, String b) {
        return Integer.toString(a) + b;
    }

    public static String[] insertInArray(String[] a, String b){
        String[] newArray = new String[a.length+1];
        newArray[0]= a[0];
        newArray[1] = a[1];
        newArray[2] = a[2];
        newArray[3] = b;
        newArray[4] = a[3];
        newArray[5] = a[4];
        return newArray;
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
        System.out.println(Arrays.toString(insertInArray(words, insert)));
    }
}