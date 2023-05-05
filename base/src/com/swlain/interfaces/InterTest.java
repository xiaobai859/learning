package com.swlain.interfaces;


import com.swlain.interfaces.impl.TestImpl;

/**
 * 国际测试
 *
 * @author 小白
 * @date 2023/05/06
 */
public class InterTest {


    /**
     * 主要
     *
     * @param args arg游戏
     */
    public static void main(String[] args) {
        Test test = new TestImpl();
        test.func1();
        test.func2();


    }


}