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
        System.out.println(rectanglePerimeter(4.7, 5));
        System.out.println(evenOrOdd(26));
        System.out.println(trianglePerimeter(4.6, 5.8, 2.2));
    }
}