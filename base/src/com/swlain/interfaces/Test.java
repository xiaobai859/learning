package com.swlain.interfaces;

/**
 * 测试
 *
 * @author 小白
 * @date 2023/05/05
 */
public interface Test {

    void func1();

    default void func2() {
        System.out.println("Test.func2");
    }

}
