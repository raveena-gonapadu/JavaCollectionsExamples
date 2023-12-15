

/*Write a program to find the number of digits in a given integer
input: 4536
output: 4*/


/*Write a program to find the sum of digits of a number
input: 4356
output: 4+3+5+6 = 18*/

public class DigitNumbers {

    public void noDigits(long num)
    {
        String s = Long.toString(num);
        System.out.println("no.of digits in given integer: " + s.length());
    }

    public void sumofDigits(long num)
    {
        String s = Long.toString(num);
        long total = 0;
        for(int i = 0;i<s.length();i++)
        {
            total = total + Integer.parseInt(s.substring(i,i+1));
        }
        System.out.println("Sum of individual digits: "+total);
    }

    public static void main(String[] args) {
        DigitNumbers digit = new DigitNumbers();
        digit.noDigits(4567);
        digit.sumofDigits(4567);
    }

}
