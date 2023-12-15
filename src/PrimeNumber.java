
//Write a program to find whether a given number is PRIME or NOT

public class PrimeNumber {

    public void primeNumberIdentification(int num)
    {
        if(num%2 == 0 || num%3 == 0 || num%5 == 0 || num%7 == 0 || num%11 == 0)
            System.out.println("Given number "+num+" is NOT prime number");
        else
            System.out.println("Given number "+num+" is prime number");
    }

    public void listPrime(int start, int end)
    {
        if(start==1 && end>11)
            System.out.print("1  3  5  7  11  ");
        for(int i = start+1; i<=end;i++)
        {
            if(!(i%2 == 0 || i%3 == 0 || i%5 == 0 || i%7 == 0 || i%11 == 0))
                System.out.print(i+"  ");
        }
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        primeNumber.listPrime(1,100);
        primeNumber.primeNumberIdentification(87);
    }

}
