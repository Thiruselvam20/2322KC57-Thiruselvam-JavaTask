public class Task3_MethodOverloading {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Task3_MethodOverloading obj = new Task3_MethodOverloading();

        int result1 = obj.sum(10, 20);
        double result2 = obj.sum(10.5, 20.7);

        System.out.println("Sum of integers: " + result1);
        System.out.println("Sum of doubles: " + result2);
    }
}
