package com.afterclasswork;

import com.stack.LinkStack;
import com.stack.SqStack;

public class Demo {

    //编写一个函数，要求借助一个栈把一个数组中的元素逆置
    public void reverse(Object[] a) throws Exception {
        SqStack sqStack = new SqStack(a.length);
        for (int i = 0; i < a.length; i++) {
            sqStack.push(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = sqStack.pop();
        }
    }

    //编写一个函数判断一个字符序列是否是回文序列，例如abba和abdba都属于回文序列，要求只使用栈来实现
    //判断字符序列是否是回文序列，是返回true,不是返回false
    public boolean isPalindSeq(String str) throws Exception {
        LinkStack linkStack = new LinkStack();
        int i = 0;
        for (; i < str.length(); i++) {
            linkStack.push(str.charAt(i));
        }
        for (i = 0; i < str.length(); i++) {
            char c = ((Character) linkStack.pop()).charValue();
            if (c != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

