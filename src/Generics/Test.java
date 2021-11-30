package Generics;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(5);
        nums.add(4);
        nums.add(2);
        nums.add(3);
        OddCondition oddCondition = new OddCondition();
        System.out.println("===================================================");
        System.out.println(Algorithms.countIf(nums, oddCondition));

        Integer[] vals = {1,2,3,4};
        Algorithms.switchNums(vals, 1, 2);
        System.out.println("===================================================");
        for(Integer i : vals) {
            System.out.println(i);
        }   

    }
}
