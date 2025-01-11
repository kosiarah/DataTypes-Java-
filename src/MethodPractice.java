public class MethodPractice {

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! How are you doing today?");
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
    // i did employ the help of chatgpt for this one, and i tried getting it to explain it to me but it couldn't so maybe you could explain math.pow to me later on please.

    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int findLargest(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {

        greetUser("Kosi");

        MethodPractice mp = new MethodPractice();

        double radius = 5.9;
        double area = mp.calculateCircleArea(radius);
        System.out.println("The area of a circle with radius " + radius + " is " + area);

        System.out.println("Multiplication of two integers 3 and 4 = " + mp.multiply(3, 4));
        System.out.println("Multiplication of two doubles 2.5 * 4.5 = " + mp.multiply(2.5, 4.5));

        int largest = mp.findLargest(10, 20, 44);
        System.out.println("The largest number among 10, 20, and 44 is " + largest);
    }
}
