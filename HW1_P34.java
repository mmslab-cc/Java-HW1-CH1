public class HW1_P34 {

    public static void main(String[] args) {

        int num1 = 12;
        int num2 = 4;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));
        System.out.println("num1 / num2 = " + (num1 / num2));
        System.out.println("num1 % num2 = " + (num1 % num2));

        int a = 0;
        int b;
        int c;

        b = a++;
        c = ++a;

        System.out.println("執行 b = a++ 後，b = " + b);
        System.out.println("執行 c = ++a 後，c = " + c);
        System.out.println("最後 a = " + a);
    }
}
