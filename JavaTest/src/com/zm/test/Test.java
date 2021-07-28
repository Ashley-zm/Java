package com.zm.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author ZhuMei
 * @Date 2021/7/28 9:02
 * @Version 1.0
 */
public class Test {

    String name;

    /**
     *<p>这是一个测试方法</p>
     * @return
     */
    public static void test() {
        int sum=0;
        int index=0;
        System.out.println("请输入数字：");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextDouble()){
           int num=scanner.nextInt();
           sum +=num;
           ++index;
           double avg=sum/index;
            System.out.println("第"+index+"个数的总和为："+sum);
            System.out.println("平均数："+avg);
        }
        scanner.close();
    }
    public static void main(String[] args) {
       // test();
        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("胖胖");
        stringArrayList.add("重重");
        stringArrayList.add("瘦瘦");
        for (String a:stringArrayList) {
            System.out.println(a);
        }
        System.out.println(stringArrayList.size());
        String str1="abcd";
        String str2=str1.replace("ab", "**");
        System.out.println(str2);
    }
}
