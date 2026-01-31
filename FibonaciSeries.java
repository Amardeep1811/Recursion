
import java.util.Scanner;

class FibonaciSeries{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the ith index to find its fibonaci number : ");
        int n = input.nextInt();

        System.out.println("The fibonaci number of index "+ n + " is : " + fibonaci(n));
    }

    static int fibonaci(int n){
        if(n <= 1) return n;
        return fibonaci(n-1) + fibonaci(n-2);
    }
}