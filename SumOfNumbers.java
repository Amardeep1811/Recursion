
import java.util.Scanner;

class SumOfNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till you want sum : ");
        int n = input.nextInt();
        printRevNumber(n , 0);
    }

    static void printRevNumber(int i , int sum){
        if (i < 1){
            System.out.println(sum);
            return; 
        } 
        printRevNumber(i-1, sum+i);
    }
}