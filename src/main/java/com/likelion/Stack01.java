package com.likelion;

public class Stack01 {
    //push, pop, peek, get
    private int arr[];  // 스택 배열
    private int top = 0;    // 스택 포인터

    public Stack01() {
        this.arr = new int[10000];
    }
    public Stack01(int size) {
        this.arr = new int[size];
    }
    public int [] getArr() {

        return this.arr;
    }

    public void push(int value){
        this.arr[top] = value;
        top++;
    }
    public int pop(){
        int value = this.arr[top-1];
        top --;
        return value;
    }
}
