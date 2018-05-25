package com.util;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Test t = new Test();
        t.celiang();
    }
    public void maopaosort() {
        int arr[] = {6, 5, 9, 3, 1, 46,89,99,100,2000,300,301};
        System.out.println("排序前的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        for (int i = 0; i < arr.length - 1; i++) { //外层循环控制排序执行几趟
            for (int j = 0; j < arr.length - 1 - i; j++) { //内层循环控制每趟排序多少次
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的数组为：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
        public void twonumscompare(){
            Scanner scanner = new Scanner(System.in);
            int a,b,max;
            System.out.println("请输入a:");
            a = scanner.nextInt();
            System.out.println("请输入b:");
            b = scanner.nextInt();
            max = a>b?a:b;
            System.out.println("最大值是："+max);

    }
    public void threenumscompare(){
        Scanner scanner = new Scanner(System.in);
        int a,b,c,d;

        System.out.println("请输入a:");
        a = scanner.nextInt();
        System.out.println("请输入b:");
        b = scanner.nextInt();
        System.out.println("请输入c:");
        c = scanner.nextInt();

        d = a>b?a:b;
        int max = d>c?d:c;

        System.out.println(max);
    }

    public void sortcompare3(){
     int[] array = {2,1,4};
        Arrays.sort(array);
        /*
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }*/
        for (int num: array) {
            System.out.println(num);
        }
    }
    public void charAtDemo(){
        String s = "hello world";
        for (int i = 0; i <s.length() ; i++) {
            char c = s.charAt(i);
            System.out.println("第"+i+"个是："+c);
        }
    }
    //除了3的倍数以外的数的和
    public void chusanbeishu(){
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if (i%3 != 0){
                sum+=i;
               /* System.out.println(i);*/
            }
        }
        System.out.println(sum);
    }
}
