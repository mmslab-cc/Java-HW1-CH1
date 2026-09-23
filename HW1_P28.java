import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HW1_P28 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("請輸入一個整數：");

        String str1 = br.readLine();
        int num = Integer.parseInt(str1);

        System.out.println("你輸入的數字是：" + num);

        System.out.print("請輸入一句話：");

        String str2 = br.readLine();

        System.out.println("你剛剛輸入的是：" + str2);
    }
}
