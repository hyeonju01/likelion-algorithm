package com.likelion.Nov_30th;

/*
핵심 로직: 부모 노드가 동일할 때 지금까지 왔던 거리를 합하여 출력함
 */

public class CodeUp_1936 {

    public static int goUp(int a, int b) {
        if (a > b) {
            return goUp(a / 2, b) + 1; //a를 부모 쪽으로 올려!
        } else if (a < b) {
            return goUp(a, b / 2) + 1; //b를 부모 쪽으로 올려!
        } else
            return 0;
    }

    public static void main(String[] args) {
        System.out.println(goUp(3, 4));
    }

}