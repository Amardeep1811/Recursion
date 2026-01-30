
import java.util.Scanner;

class PrintName{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of times you want to print the name : ");
        int n = input.nextInt();
        int i = 1 ;
        printName(i , n);
    }

    static void printName(int i , int n){
        if (i > n ) return;
        System.out.println("Amardeep");
        printName(i+1, n);
    }
}