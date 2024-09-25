import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int fnumber = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int snumber = sc.nextInt();
        System.out.print("Enter a operator (+ - * /): ");
        String operator = sc.next();

        switch (operator) {
            case "+":
                System.out.println(fnumber + snumber);
                break;
            case "-":
                System.out.println(fnumber - snumber);
                break;
            case "*":
                System.out.println(fnumber * snumber);
                break;
            case "/":
                System.out.println(fnumber / snumber);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
