
import java.util.Scanner;

class SumOfNumberUsingFunction{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till you want sum : ");
        int n = input.nextInt();
        System.out.println(sum(n));
    }

    static int sum(int i){
        if (i == 0) return 0 ; 
        return i+sum(i-1);
    }
}