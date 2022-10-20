package com.likelion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    @Test
    @DisplayName("push가 잘 되는지")
    void push(){
        Stack02 st = new Stack02();
        st.push(10);
        st.push(20);
        Integer arr[] = st.getArr();
        assertEquals(20, arr[1]);
        assertEquals(10, arr[0]);
    }

    @Test
    @DisplayName("push와 pop이 작동 되는지")
    void pushAndPop(){
        Stack02 st = new Stack02();
        st.push(20);
        st.push(30);
        assertEquals(30, st.pop());
        assertEquals(20, st.pop());
    }

    @Test
    @DisplayName("isEmpty가 스택이 비었을 때 true를 출력하는지")
    void isEmpty(){
        Stack02 st = new Stack02();
        assertTrue(st.isEmpty());
        st.push(20);
        assertFalse(st.isEmpty());
        st.pop();
        assertTrue(st.isEmpty());
    }

    @Test
    @DisplayName("스택 가장 위의 값이 출력되는지")
    void peek() {
        Stack02 st = new Stack02();
        assertThrows(EmptyStackException.class, ()->{
            st.peek();
        });
        st.push(10);
        int peeked = st.peek();
        assertEquals(10, peeked);
    }

    @Test
    @DisplayName("진짜 스택에서 검사")
    void  realStack(){
        Stack<Integer> st = new Stack<>();  // 스택이 비어있지 않으면 pop
        assertThrows(EmptyStackException.class, ()->{
            st.pop();
        });
    }

}