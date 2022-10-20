package com.likelion;

import java.util.EmptyStackException;

public class Stack02 {

    //push, pop, peek, get
    private Integer arr[];  // 스택 배열
    private int top = 0;    // 스택 포인터

    public Stack02() {
        this.arr = new Integer[10000];
    }
    public Stack02(int size) {
        this.arr = new Integer[size];
    }
    public Integer [] getArr() {
        return this.arr;
    }

    // item 하나를 스택의 가장 윗 부분에 추가한다.
    public void push(int value){
        this.arr[top] = value;
        top++;
    }

    // 스택에서 가장 위에 있는 항복을 제거한다.
    public int pop(){
        if(this.isEmpty()){
            throw new EmptyStackException();
        }
        int value = this.arr[top-1];
        top --;
        return value;
    }

    // 스택이 비어있을 때 true를 반환한다.
    public boolean isEmpty(){
        boolean isEmpty = (this.top == 0);
        return isEmpty;
    }

    // 가장 위에 있는 항목을 반환한다.
    public int peek(){
        if(isEmpty()) throw new EmptyStackException();
        return this.arr[top-1];
    }
}
