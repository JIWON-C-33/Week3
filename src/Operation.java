public class Operation {
    public static void main(String[] args) {

        int result = (5 + 3) * 2; //16

        int x = 5;
        int y = ++x;  // x는 먼저 증가하고, y에 6이 저장됨
        boolean flag = false;
        boolean notFlag = !flag;  // flag가 false일 때, notFlag는 true가 됨

        int a = 10;
        int b = 3;
        int product = a * b;   // 곱셈, 결과: 30
        int quotient = a / b;  // 나눗셈, 결과: 3
        int remainder = a % b; // 나머지, 결과: 1

        int sum = 5 + 3;   // 덧셈, 결과: 8
        int diff = 10 - 7; // 뺄셈, 결과: 3

        int result = 4 << 2;  // 왼쪽으로 2비트 이동, 결과: 16
        int result = 16 >> 2; // 오른쪽으로 2비트 이동, 결과: 4

        boolean isLess = (5 < 10);  // 결과: true
        boolean isGreaterOrEqual = (10 >= 10);  // 결과: true

        boolean isEqual = (5 == 5);  // 결과: true
        boolean isNotEqual = (5 != 3);  // 결과: true

        int result = 5 & 3;  // 비트 AND 연산, 결과: 1
        int result = 5 | 3;  // 비트 OR 연산, 결과: 7
        int result = 5 ^ 3;  // 비트 XOR 연산, 결과: 6
        int result = ~5;     // 비트 반전, 결과: -6

        boolean result = (true && false);  // AND 연산, 결과: false
        boolean result = (true || false);  // OR 연산, 결과: true
        boolean notResult = !true;  // NOT 연산, 결과: false

        int x = 5;
        x += 3;  // x에 3을 더한 후 저장 x = x + 3, 결과: 8
        x *= 2;  // x에 2를 곱한 후 저장x = x + 2, 결과: 16
        x <<= 1; // x를 왼쪽으로 1비트 이동 후 저장 x = x << 3, 결과: 32
    }
}
