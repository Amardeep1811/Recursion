
import java.util.Scanner;

class PrintNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till when you want to print : ");
        int n = input.nextInt();
        int i = 1 ;
        printNumber(i , n);
    }

    static void printNumber(int i , int n){
        if (i > n ) return;
        System.out.println(i);
        printNumber(i+1, n);
    }
}