
package test;

import java.util.Scanner;


public class nextnextline {
    public static void main(String[] args){
        Scanner keybord = new Scanner(System.in);
        System.out.println("nhap ho va ten: ");
        String sentence = keybord.nextLine();
        
        
        System.out.println("tuoi: ");
        int tuoi = keybord.nextInt();
        
        System.out.println("nam sinh: ");
        int namsinh = keybord.nextInt();
        
        System.out.println("gioi tinh: ");
        String gioitinh = keybord.next();
        
        System.out.println("chuyen nganh: ");
        String chuyennganh = keybord.next();
        keybord.nextLine();
        
        System.out.println("GPA: ");
        float GPA = keybord.nextFloat();
        keybord.nextLine();
        
        System.out.println("Que quan: ");
        String quequan = keybord.nextLine();
        
        
        System.out.println("ten la "+sentence);
        System.out.println("tuoi la "+tuoi);
        System.out.println("nam sinh la "+namsinh);
        System.out.println("gioi tinh la "+gioitinh);
        System.out.println("chuyen nganh la "+chuyennganh);
        System.out.println("GPA la"+GPA);
        System.out.println("que quan la "+quequan);
        
    }
}
