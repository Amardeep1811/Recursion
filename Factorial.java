
import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number till you want factorial : ");
        int n = input.nextInt();
        System.out.println(fact(n));
    }

    static int fact(int i){
        if (i == 1) return 1;  // if (i == 0) return 1;
        return i * fact(i-1);
    }
}