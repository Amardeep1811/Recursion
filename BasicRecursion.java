class BasicRecursion{
    public static void main(String[] args){
        int count = 0 ;
        function(count);
    }

    static void function(int n){
        if (n == 3) return;
        n++;
        System.out.println(n);
        function(n);
    }
}