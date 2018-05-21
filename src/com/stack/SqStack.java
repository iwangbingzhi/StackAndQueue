package com.stack;

public class SqStack implements IStack {
    private Object[] stackElem;
    private int top;

    public SqStack(int maxSize) {
        top = 0;  //初始化top为0
        stackElem = new Object[maxSize];   //为栈分配maxSize个存储单元
    }

    //栈置空
    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public boolean isEmpty() {
        return top == 0  ;
    }

    @Override
    public int length() {
        return top;
    }

    //取栈顶元素
    @Override
    public Object peek() {
        if (!isEmpty()){
            return stackElem[top-1];
        }else {
            return null;
        }
    }

    //入栈
    @Override
    public void push(Object x) throws Exception {
        if(top == length()){
            throw new Exception("栈已经满了");
        }else {
            stackElem[top++]=x;  //将新的元素x压入栈顶，再top增加1
        }
    }


    //出栈
    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        }else {
            return stackElem[--top];
        }
    }


    //输出栈中的所有元素
    @Override
    public void display() {
        for (int i = top-1; i >=0 ; i--) {
            System.out.println(stackElem[i].toString()+" ");
        }
    }
}
