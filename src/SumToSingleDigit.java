

/*Write a program to add the digits of the number until it is a single digit
input: 765
output: 7+6+5 = 18
        18 is not a single digit
			1+8 = 9
                    9 is single digit, so final output should be 9*/

public class SumToSingleDigit {

    public void sum(long number)
    {
        String s = Long.toString(number);
        int size = s.length();
        String numS = s;
        int sum = 0;

        while (size>1)
        {
            sum = 0;
            for(int i=0;i<size;i++)
            {
                sum = sum + Integer.parseInt(numS.substring(i,i+1));
            }
            numS = Integer.toString(sum);
            size = numS.length();
        }
        System.out.println("Sum: "+sum);
    }

    public static void main(String[] args) {
        SumToSingleDigit singleDigit = new SumToSingleDigit();
        singleDigit.sum(765);
    }

}
