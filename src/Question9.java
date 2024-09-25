import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 숫자: ");
        int a = sc.nextInt();
        System.out.print("두번째 숫자: ");
        int b = sc.nextInt();
        System.out.print("연산자 (+, -, *, /): ");
        String c = sc.next();

        if (c.equals("+")) {
            System.out.println(a + b);
        } else if (c.equals("-")) {
            System.out.println(a - b);
        } else if (c.equals("*")) {
            System.out.println(a * b);
        } else if (c.equals("/")) {
            if (b == 0) {
                System.out.println("0으로 나눌 수 없습니다.");
            } else {
                System.out.println(a/b);
            }
        } else {
            System.out.println("잘못된 연산자");
        }

    }
}
