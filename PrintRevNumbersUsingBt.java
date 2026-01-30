
import java.util.Scanner;

class PrintRevNumbersUsingBt{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till when you want to print : ");
        int n = input.nextInt();
        int i = 1;
        printRevNumber(i,n);
    }

    static void printRevNumber(int i , int n){
        if (i > n) return;
        printRevNumber(i+1 , n);
        System.out.println(i);
    }
}