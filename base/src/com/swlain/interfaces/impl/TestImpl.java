package com.swlain.interfaces.impl;

import com.swlain.interfaces.Test;


/**
 * 测试impl
 *
 * @author 小白
 * @date 2023/05/05
 */
public class TestImpl implements Test {


    @Override
    public void func1() {
        Test.super.func2();
    }

    @Override
    public void func2() {

        System.out.println("TestImpl.func2");
    }
}