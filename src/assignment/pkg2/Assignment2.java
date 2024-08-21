package assignment.pkg2;

import java.util.Scanner;

public class Assignment2 {

    public static void main(String[] args) {
        Scanner Tinh = new Scanner(System.in);
        System.out.println("nhap so thu nhat: ");
        int a = Tinh.nextInt();
        System.out.println("nhap so thu hai: ");
        int b = Tinh.nextInt();
        int c = a + b;
        int d = a - b;
        int f = a * b;
        int g = a / b;
        float h = a % b;
        System.out.println("Cong la " +c);
        System.out.println("Tru la " + d);
        System.out.println("Nhan la " + f);
        System.out.println("Chia la " + g);
        System.out.println("Chia lay du la " + h);
    }
    
}
