
import java.util.Scanner;

class PrintNumbersUsingBackTrack{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till when you want to print : ");
        int n = input.nextInt();
        printNumbersUsingBt(n,n);
    }

    static void printNumbersUsingBt(int i , int n){
        if (i < 1) return;
        printNumbersUsingBt(i-1 , n);
        System.out.println(i);
    }
}