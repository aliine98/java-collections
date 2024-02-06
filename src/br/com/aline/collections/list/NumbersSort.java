package br.com.aline.collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NumbersSort {
    List<Integer> integerList = new ArrayList<>();

    void addNumber(int num) {
        this.integerList.add(num);
    }

    public List<Integer> getIntegerList() {
        return integerList;
    }

    @Override
    public String toString() {
        return "NumbersSort{" +
                "integerList=" + integerList +
                '}';
    }

    List<Integer> sortAscending() {
        List<Integer> sortedList = new ArrayList<>(integerList);
        Collections.sort(sortedList);
        return sortedList;
    }

    List<Integer> sortDescending() {
        List<Integer> sortedList = new ArrayList<>(integerList);
        //              pega o oposto da ordem natural(que neste caso é crescente, logo o oposto é decrescente)
        sortedList.sort(Collections.reverseOrder());
/*
                                método do Comparator para crescente e depois reverte
      ou => sortedList.sort(Comparator.comparingInt((Integer n) -> n).reversed());

                                lambda
      ou =>  sortedList.sort((Integer n1, Integer n2) -> {
        implementação do compare para descending
            if(n1 > n2) {
                return -1;
            } else if (n1 < n2) {
                return  1;
            } else {
                return  0;
            }
        });
*/


        return sortedList;
    }
}
