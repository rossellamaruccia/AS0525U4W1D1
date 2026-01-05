import java.util.Scanner;

public class ThirdEx {
    public static double rectanglePerimeter(double a, double b) {
        return (a + b) * 2;
    }

    public static int evenOrOdd(int a) {
        if(a%2 == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static double trianglePerimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double area = p * (p-a) * (p-b) * (p-c);
        return Math.sqrt(area);
    }
    public static void main(String[] args) {
        Scanner firstInput = new Scanner(System.in);
        System.out.println("Enter the first rectangle side length: ");
        double a = firstInput.nextDouble();
        System.out.println("Enter the second rectangle side length: ");
        double b = firstInput.nextDouble();
        System.out.println(rectanglePerimeter(a, b));

        Scanner secondInput = new Scanner(System.in);
        System.out.println("Enter one number to see if it is even or odd: ");
        int c = secondInput.nextInt();
        System.out.println(evenOrOdd(c));

        Scanner thirdInput = new Scanner(System.in);
        System.out.println("Enter the first triangle side length: ");
        double c1 = thirdInput.nextDouble();
        System.out.println("Enter the second triangle side length: ");
        double c2 = thirdInput.nextDouble();
        System.out.println("Enter the third triangle side length: ");
        double c3 = thirdInput.nextDouble();
        System.out.println(trianglePerimeter(c1, c2, c3));
    }
}