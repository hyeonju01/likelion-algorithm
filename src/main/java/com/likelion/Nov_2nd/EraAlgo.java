package com.likelion.Nov_2nd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EraAlgo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 2; i < 51; i++) {
            list.add(i);
        }

//        for (int num : list ) {
//            if ((num != 2) && (num % 2 == 0)) {
//                list.remove(num);
//            }
//        }

        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) % 2 ==0) && (list.get(i)!= 2)) {
                list.remove(i);
            }
        }

        System.out.println(list.size());

        for (int i=0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
