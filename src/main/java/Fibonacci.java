public class Fibonacci {

    public static int getFibonacci(int n){
        int n1 = 0, n2 = 1, temp = 0;
        if(n == 0) return 0;
        if(n == 1) return 1;

        for(int i=0; i<n; i++){
            temp = n1 + n2;
            n1 = n2;
            n2 = temp;
        }
        return n1 + n2;
    }
}
