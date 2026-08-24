public class Fibonacci {
    static int count=0;
    static int fib(int n){
        count++;
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    static void main() {
        System.out.println(fib(10)); // 55
        System.out.println("count:" + count); // count :177

        System.out.println(fib(20)); //6765
        System.out.println("count:" + count); // count :22068
    }
}
