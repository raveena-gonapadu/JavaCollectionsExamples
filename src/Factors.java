
//Write a program to print all the factors of a given number

public class Factors {

    public void printFactors(int number)
    {
        System.out.print("Factors of number "+number+" are: ");
        for(int i=1;i<=number;i++)
        {
            if(number%i==0)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Factors factors = new Factors();
        factors.printFactors(54);
    }

}
