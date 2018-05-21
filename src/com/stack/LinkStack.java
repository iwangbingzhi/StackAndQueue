package com.stack;

public class LinkStack implements IStack {
    private Node top;

    @Override
    public void clear() {
        top = null;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int length() {
        Node p = top;
        int length = 0;
        while (p!=null){
            p = p.next;
            ++length;
        }
        return length;
    }


    //取栈顶并且返回其值
    @Override
    public Object peek() {
        if (!isEmpty()){
            return top.data; //返回栈顶元素的值
        }else {
            return null;
        }
    }

    @Override
    public void push(Object x) throws Exception {
        Node p = new Node(x); //构造一个新的结点
        p.next = top;
        top = p;   //新结点成为当前的栈顶结点
    }

    @Override
    public Object pop() {
        if(isEmpty()){
            return null;

        }else {
            Node p = top;
            top = top.next;
            return p.data;
        }
    }

    @Override
    public void display() {
        Node p = top;
        while(p!=null){  //输出所有非空结点的数据元素值
            System.out.println((p.data.toString()+" "));
            p = p.next;
        }
    }
}
