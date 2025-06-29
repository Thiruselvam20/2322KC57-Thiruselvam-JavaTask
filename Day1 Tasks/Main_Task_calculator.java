import java.util.Scanner;

public class Main_Task_calculator {

    public static int add(int a , int b){
        return a + b;
    }

    public static int sub(int a , int b){
        return a - b;
    }

    public static int mul(int a , int b){
        return a * b;
    }

    public static int div(int a , int b){
        if(b == 0) {
            System.out.println("Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");

        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        int result = 0;

        switch(choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        System.out.println("Result: " + result);
    }
}
