package assignment7;

import java.util.Scanner;

public class Assignment7 {

    public static float[] Nhapmang(float[] mang) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < mang.length; i++) {
            System.out.print("nhap phan tu mang thu " + (i + 1) + " :");
            mang[i] = scanner.nextFloat();
        }
        return mang;
    }

    public static void Xuatmang(float[] mang) {
        System.out.println("--------------------------");
        for (int i = 0; i < mang.length; i++) {
            System.out.println("phan tu mang " + (i + 1)+" :" + mang[i]);
        }
        System.out.println("");
    }

    public static float finalMax(float[] mang) {
        float max1, max2;
        if (mang[0] > mang[1]) {
            max1 = mang[0];
            max2 = mang[1];
        } else {
            max1 = mang[1];
            max2 = mang[0];
        }
        for (int i = 2; i < mang.length; i++) {
            if (mang[i] > max1) {
                max2 = max1;
                max1 = mang[i];
            } else if (mang[i] > max2 && mang[i] < max1) {
                max2 = mang[i];
            }
        }

        return max2;
    }

    public static void Xoa(float[] mang) {
        int index = 0;
        for (int i = 0; i < mang.length; i++) {
            if (mang[i] % 2 == 0) {
                mang[index] = mang[i];
                index++;
            }
        }
        for (int i = index; i < mang.length; i++) {
            mang[i] = 0;
        }
        System.out.println("so chan trong mang : ");
        for (int i = 0; i < index; i++) {
            System.out.println(mang[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("nhap so phan tu: ");
        int number = scan.nextInt();

        float[] mang = new float[number];
        Nhapmang(mang);
        Xuatmang(mang);
        float max2 = finalMax(mang);
        System.out.println("Gia tri lon thu 2 la : " + max2);
        Xoa(mang);

    }

}
