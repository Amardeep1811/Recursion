import java.util.Scanner;

class StringPalindrome{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String to check if it is palindrome : ");
        String name = input.nextLine();
        
        boolean i = checkPalindrome(name , 0);
        if(i == false ){
            System.out.println("String is not palindrome");
        } else System.out.println("The String is palindrome");
    }

    
    static boolean  checkPalindrome(String s , int i){
        if(i >= s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length() - i -1)) return false;
        return checkPalindrome(s, i+1);

    }
}