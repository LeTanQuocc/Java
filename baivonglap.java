
package lecture4.pkg5;

import java.util.Random;
import java.util.Scanner;

public class baivonglap {

    public static void main(String[] args) {
        System.out.println("homer say");
        for (int i =1 ; i<= 4;i++)
        {
            System.out.println("I am so smart");
        }System.out.println("S-M-R-T....I mean S-M-A-R-T");
        for(int i = 1 ; i<= 4 ; i++ )
        {
            System.out.println(i+"squared = "+(i*i));
        }System.out.println("Whoo ! ");
        System.out.println("T-Minus");
        for (int i = 10 ; i>= 1 ;i--)
        {
            System.out.print( i+",");
        }
        System.out.println("Blastoff ");
        System.out.println(" The End ");
        for ( int i = 1 ; i <= 5 ;i++)
        {
            for ( int j = 1 ; j <= 10 ; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }   
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int number = 1;
        while ( number != 0 )
        {
            System.out.println("Enter a Number ( 0 to quit ): ");
            number = scan.nextInt();
            sum = number + sum;
        }
        System.out.println("The total is " + sum);
        Random rdom = new Random();
        int rd = rdom.nextInt(3);
        if ( rd == 0 )
        {
            System.out.println("Rock");
        }
        else if( rd == 1)
        {
            System.out.println("Paper");
        }
        else{
            System.out.println("scissors");
        }
    }
    
}
