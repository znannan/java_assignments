public class Fibonacci {
    // 递归
    /*
    private int calc1(int n) {
        
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }else if(n == 1 || n ==2){
            return 1;
        }else{
            return calc1(n - 1) + calc1(n - 2);
        }
    }
    */
    //循环
    private long calc2(long n) {
        if(n < 0){
            return -1;
        }else if(n == 0){
            return 0;
        }else if(n == 1 || n ==2){
            return 1;
        }else{
            long j=0, k=1, i=2;
            //k = j+1;
            //i = k+1;
            long val_j=0, val_k=1, val_i=1;
            for(i = 2; i <= n; i++){  
                val_i = val_j+val_k;
                val_j = val_k;
                val_k = val_i;
            }  
            return val_i; 
        }
    }
    public static void main(long[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.calc2(args[0]));
    }

}