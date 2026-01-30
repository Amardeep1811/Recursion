
import java.util.Scanner;

class PrintReverseNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till when you want to print : ");
        int n = input.nextInt();
        printRevNumber(n);
    }

    static void printRevNumber(int n){
        if (n == 0) return;
        System.out.println(n);
        printRevNumber(n-1);
    }
}