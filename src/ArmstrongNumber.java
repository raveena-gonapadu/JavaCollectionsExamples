
/*write a program to find out whether a number is ARMSTRONG NUMBER
123  = (1*1*1) + (2*2*2) + (3*3*3)
        153 = (1*1*1) + (5*5*5) + (3*3*3)  = 1 + 125 + 27 = 153*/


public class ArmstrongNumber {

    public void checkArmstrong(int num)
    {
        String s = Integer.toString(num);
        int size = s.length();
        int n = 1;
        int sum = 0;

        for(int i = 0;i<size;i++)
        {
            for(int j = 0;j<size;j++)
            {
                n = Integer.parseInt(s.substring(i,i+1)) * n;
            }
            sum = sum + n;
            n = 1;
        }
        if(sum == num)
            System.out.println("Number "+num+" is ARMSTRONG number");
        else
            System.out.println("Number "+num+" is NOT ARMSTRONG number");
    }

    public static void main(String[] args) {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        armstrongNumber.checkArmstrong(153);
    }

}
