package com.likelion.Nov_8th;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        //중간값 찾기
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;

        int target = 7;
        int answer = 0;
        while (start <= end) {
            if(nums[mid] == target) {
                answer = mid;
                break;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid -1;
            }
        }
        System.out.println(answer);
    }
}
