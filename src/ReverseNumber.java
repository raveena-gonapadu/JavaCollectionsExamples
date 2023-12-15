
/*Write a program to reverse a number
input: 1234
output: 4321*/


public class ReverseNumber {

    public void reverse(long number)
    {
        String s = Long.toString(number);
        String s1 = "";
        int size = s.length();
        for(int i = size-1;i>=0;i--)
        {
            s1 = s1+s.charAt(i);
        }
        System.out.println("Reverse Number: "+Integer.parseInt(s1));
    }

    public static void main(String[] args) {
        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.reverse(1234);
    }

}
