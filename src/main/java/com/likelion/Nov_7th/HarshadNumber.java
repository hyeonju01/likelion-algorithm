package com.likelion.Nov_7th;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HarshadNumber {


    public static void main(String[] args) {
        int x = 0;
        List<Integer> arrList = new ArrayList<>();
        Scanner sc =new Scanner(System.in);
        x = sc.nextInt();
        /*
        10000 / 10 = 1000 (나머지 = 0)
        1000 / 10 = 100 (나머지 = 0)
        100 / 10 = 10 (나머지 = 0)
        10 / 10 = 1 (나머지 = 0)
        1 / 10 = 0 (나머지 = 1)
        */

        while (x / 10 == 0) {
            arrList.add(x % 10);
            x = x / 10;
        }

        int num = arrList.size(); //자릿수


    }


}
