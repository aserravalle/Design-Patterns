package Generics;

import java.util.Collection;

public class Algorithms {
    public static <T> int countIf(Collection<T> nums, Condition<T> cond) {
        int count = 0;
        for(T t : nums) {
            if(cond.eval(t)) {
                count ++;
            }
        }
        return count;
    }

    public static <T> void switchNums(T[] vals, int pos1, int pos2) {
        T tmp = vals[pos1];
        vals[pos1] = vals[pos2];
        vals[pos2] = tmp;
    }

    


}
