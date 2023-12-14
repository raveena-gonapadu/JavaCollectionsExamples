
/*Given an array of numbers, write a program to find the average of the numbers in that array
input: {1,2,3,4,5,6}
output: AVERAGE IS: 3.5*/

import java.util.ArrayList;
import java.util.List;

public class AverageNumbers {
    public float average(List<Integer> list)
    {
        int size = list.size();
        int sum = 0;
        for(Integer integer : list)
            sum = sum + integer;

        return ((float) sum /size);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        AverageNumbers averageNumbers = new AverageNumbers();
        System.out.println("Average of given numbers: "+averageNumbers.average(list));
    }
}
