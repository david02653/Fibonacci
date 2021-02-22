public class Fibonacci {

    // simple Fibonacci function
    public static int getFibonacci(int n){
        int n1 = 0, n2 = 1;
        if(n == 0) return 0;
        if(n == 1) return 1;

        for(int i=1; i<n; i++){
            int temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        return n2;
    }
}
