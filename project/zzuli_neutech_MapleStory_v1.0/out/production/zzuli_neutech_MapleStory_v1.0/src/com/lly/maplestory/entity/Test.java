package com.lly.maplestory.entity;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author hp 第四组（刘丰旺、刘力源、张哲、张克强、张世钰、郭子航）
 * @version: 1.0
 * #Date: 2020/12/7 21:49
 */
public class Test {
    public static void main(String[] args){
        int[] arr1 = {1,2,3,4,5,6,7,0};
        int[] arr2;


        arr2 = Arrays.copyOf(arr1,arr1.length - 1);
        System.out.println(Arrays.toString(arr2));
        ArrayList<Integer> its = new ArrayList<>();
        its.add(1);

    }
}
