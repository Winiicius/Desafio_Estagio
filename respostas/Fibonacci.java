package respostas;

public class Fibonacci {
    
    public static int fibonacci(int x){
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        return fibonacci(x-1) + fibonacci(x-2);
        
    }

    public static boolean isFibonacci(int x){

        for (int i = 0; i<=x+2; i++) {
            int fib = fibonacci(i);
            if(fib == x) return true;
            if(fib > x) return false;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isFibonacci(0));
        System.out.println(isFibonacci(1));
        System.out.println(isFibonacci(2));
        System.out.println(isFibonacci(3));
        System.out.println(isFibonacci(4));
        System.out.println(isFibonacci(5));
        System.out.println(isFibonacci(6));
        System.out.println(isFibonacci(7));
        System.out.println(isFibonacci(8));
        System.out.println(isFibonacci(34));
        System.out.println(isFibonacci(55));
    }

    // Saída
    // true
    // true
    // true
    // true
    // false
    // true
    // false
    // false
    // true
    // true
    // true
}
