package basic;

public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        int result = b * 3 + 20 / 2 * a--;  // 15 + 10 * 2 = 15 + 20 = 35
        System.out.println(result);

        int num1 = 4, num2 = 5, num3 = 15, num4 = 10, num5 = 5, result2 = 12;

        result2 += num1 * num2 + num3 % num4 / num5; // 12 += 4 * 5 + 15 % 10 / 5 = 12 += 20 + 5 / 5 = 12 += 21 = 33
        System.out.println(result2);

        int x = 8;
        int y = 9;
        int z = x++ + ++y; // 8 + 10 = 18
        System.out.println(z);

        double d1 = 8.8;
        double d2 = 1.5;
        double d3 = d1 - d2; // 8.8 - 1.5 = 7.3000000000001
        System.out.println(d3);


    }
}
