
/*Write a program to swap two numbers
        a =10 and b =20
        a =20 and b =10*/

public class SwapNumbers {

    public void swap(int a,int b)
    {
        System.out.println("----------Numbers before swapping--------");
        System.out.println("a = "+a+" b = "+b);
        int c = 0;
        c = a;
        a = b;
        b = c;
        System.out.println("----------Numbers after swapping--------");
        System.out.println("a = "+a+" b = "+b);
    }

    public static void main(String[] args) {
        SwapNumbers swapNumbers = new SwapNumbers();
        swapNumbers.swap(10,20);
    }

}
