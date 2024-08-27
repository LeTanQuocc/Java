package lecture4.pkg5;

import java.util.Random;
import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int Point = 0;
        int sai = 0;
        System.out.println("---TRO CHOI TINH TOAN TONG--- ");
        while (sai < 3) {
            int soLuong = random.nextInt(4) + 2;
            int answer = 0;
            for (int i = 0; i < soLuong; i++) {
                int rd = random.nextInt(10) + 1;
                answer += rd;
                System.out.print(rd);
                if (i < soLuong - 1) {
                    System.out.print(" + ");
                }
            }
            System.out.print(" = ");

            int userAnswer = scanner.nextInt();
            if (userAnswer == answer) {
                System.out.println("Cau tra loi chinh xac!");
                Point++;
            } else {
                System.out.println("Cau tra loi sai . Dap dung la: " + answer);
                sai++;
            }
        }
        System.out.println(" Diem so cua ban la: " + Point);
    }
}

