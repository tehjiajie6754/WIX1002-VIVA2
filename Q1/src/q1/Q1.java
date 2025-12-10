/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = input.nextInt();
        while(n<=0){
            System.out.print("Enter number(>0): ");
            n = input.nextInt();
        }
        while(n>=10){
            int sum = 0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n = sum;
        }
        System.out.print("Digital root: "+n);
    }
    
}
