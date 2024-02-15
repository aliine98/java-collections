package br.com.aline.collections.list.number_list;

import java.util.ArrayList;
import java.util.List;

public class NumberList {
    private final List<Integer> integerList = new ArrayList<>();

    public void addNumber(int number) {
        integerList.add(number);
    }

    public int sumList() {
        int sum = 0;
        for (int num : integerList) {
            sum += num;
        }
        return sum;
    }

    public int findMax() {
        int max = Integer.MIN_VALUE;

        for (int num : integerList) {
            if(max < num) {
                max = num;
            }
        }
        return max;
    }

    public int findMin() {
        int min = Integer.MAX_VALUE;

        for (int num : integerList) {
            if(min > num) {
                min = num;
            }
        }
        return min;
    }

    public List<Integer> showNumbers() {
        return this.integerList;
    }
}
