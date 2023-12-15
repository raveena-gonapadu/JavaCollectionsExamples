

/*Write a program to generate a fibonacci series
1,2,3,5,8,13,21,34,55,89.........*/

public class FibonacciSeries {

    public void createFibonacci(int last)
    {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 2;
        int sum = 0;
        System.out.print(a+" "+b+" "+c+" "+d+" ");
        while(sum<last)
        {
            sum = c + d;
            c = d;
            d = sum;
            System.out.print(sum+" ");
        }
    }

    public static void main(String[] args) {
        FibonacciSeries fib = new FibonacciSeries();
        fib.createFibonacci(100);
    }

}
