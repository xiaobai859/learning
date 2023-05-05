package com.swlain.string;


/**
 * 字符串测试
 *
 * @author 小白
 * @date 2023/05/05
 */
public class StringTest {


    public static void main(String[] args) {
        compareString();
    }



    private static void compareString() {
        // s1 和 s2 采用 new String() 的方式新建了两个不同对象，而 s3 是通过 s1.intern() 方法取得一个对象引用
        String s1 = new String("aaa");
        String s2 = new String("aaa");
        System.out.println(s1== s2);           // false
        // intern() 首先把 s1 引用的对象放到 String Pool(字符串常量池)中，然后返回这个对象引用
        String s3 = s1.intern();
        System.out.println(s1.intern().equals(s3));  // true


        String s4 = "bbb";
        String s5 = "bbb";
        System.out.println(s4.equals(s5));  // true

    }





}