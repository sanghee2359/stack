package com.likelion;

import com.likelion.Stack01;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

class Stack01Test {
    @Test
    @DisplayName("push가 잘 되는지 pop이 잘 되는지")
    void pushAndpopTest(){
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        stack01.push(20);

        Assertions.assertEquals(20, stack01.pop());
        Assertions.assertEquals(10, stack01.pop());
    }
}