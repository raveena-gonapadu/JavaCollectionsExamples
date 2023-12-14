import java.util.ArrayList;
import java.util.List;

public class ReversePrinting {


    /*Write a program to print the given list of numbers in reverse order
    input: {12, 64, 23, 35,2, 67, 9, 11}
    output: {11, 9, 67, 2, 35, 23, 64, 12}*/

    public List<Integer> reverse(List<Integer> list)
    {
        List<Integer> reverse = new ArrayList<>();
        for(int i = list.size()-1;i>=0;i--)
        {
            reverse.add(list.get(i));
        }
        return reverse;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(64);
        list.add(23);
        list.add(35);
        list.add(2);
        list.add(67);
        list.add(9);
        list.add(11);

        ReversePrinting reversePrinting = new ReversePrinting();
        System.out.println("Reverse list: "+reversePrinting.reverse(list));
    }
}
