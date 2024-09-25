import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("키: ");
        double cm = sc.nextDouble();
        System.out.print("몸무게: ");
        double kg = sc.nextDouble();
        double m = cm / 100;
        double BMI = kg / (m * m);

        System.out.println(BMI);

        if (BMI < 18.5) {
            System.out.println("저체중");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("정상");
        } else if (BMI >= 25 && BMI <= 29.9) {
            System.out.println("과체중");
        } else if (BMI >= 30) {
            System.out.println("비만");
        } else {
            System.out.println("다시해");
        }
    }
}