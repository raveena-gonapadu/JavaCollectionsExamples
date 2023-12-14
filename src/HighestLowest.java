
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*Write a program to find the highest and lowest for a given list of numbers
input: {1, 15, -1, 23, 45, 70, 99, -13, -5}
output:
HIGHEST NUMBER: 99
LOWEST NUMBER: -13*/


/*2. Continue with the above example and find out the difference between highest and lowest numbers
        Output:
        Difference between highest and lowest is: 112*/


import java.util.ArrayList;
import java.util.List;

public class HighestLowest {

    public int highestValues(List<Integer> list)
    {
        int highest = -9999;
        for (Integer integer : list) {
            if (highest < integer)
                highest = integer;
        }
        return highest;

    }

    public int leastValues(List<Integer> list)
    {
        int least = 9999;
        for(Integer integer : list)
        {
            if(least > integer)
                least = integer;
        }
        return least;
    }

    public static void main(String[] args) {
        HighestLowest hl = new HighestLowest();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(15);
        list.add(-1);
        list.add(23);
        list.add(45);
        list.add(70);
        list.add(99);
        list.add(-13);
        list.add(-5);

        int high = hl.highestValues(list);
        int low = hl.leastValues(list);

        System.out.println("Highest number of given list: "+high);
        System.out.println("Least number of given list: "+low);

        System.out.println("Difference between highest and lowest number: "+(high-low));

        }
    }