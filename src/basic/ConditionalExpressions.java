package basic;

public class ConditionalExpressions {
    public static void main(String[] args) {

        boolean a1 = (5 > 6) || (4 < 6); // false  || true -> true
        System.out.println(a1);

        boolean a2 = (5 > 6) || (4 > 6); // false || false -> false
        System.out.println(a2);

        boolean a3 = (5 > 6) && (4 < 6); // false && true -> false
        System.out.println(a3);

        boolean a4 = (50 > 6) && (4 / 2 < 3); // true && true -> true
        System.out.println(a4);

        boolean a5 = (5 < 6) ^ (4 > 6); // true ^ false -> true
        System.out.println(a5);

        boolean a6 = (50 > 6) ^ (4 / 2 < 3); // true ^ true -> false
        System.out.println(a6);
    }
}
