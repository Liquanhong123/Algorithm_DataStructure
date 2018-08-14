package com.alg4.fundamental;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

/**
 * @Description:Dijkstra的雙棧表達式求值算法
 * 將操作數壓入操作數棧
 * 將操作符壓入運算符棧
 * 忽略左括號
 * 在遇到右括號時,彈出一個運算符,彈出所需數量的操作數,並將運算符和操作數的運算結果壓入操作數棧
 * @Author:Lixiaohong_666
 * @Date:Created in 12:42 PM 2/6/2018
 */
public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<>();

        while (!StdIn.isEmpty()){//讀取字符,如果是運算符則壓入棧
            String s = StdIn.readString();
            if(s.equals("("));//不處理
            else if(s.equals("+")) ops.push(s);
            else if(s.equals("-")) ops.push(s);
            else if(s.equals("*")) ops.push(s);
            else if(s.equals("/")) ops.push(s);
            else if(s.equals("sqrt")) ops.push(s);
            else if(s.equals(")")){
                //彈出運算符和操作數,並計算結果入棧
                String op = ops.pop();
                double v = vals.pop();
                if(op.equals("+"))      v = vals.pop()+v;
                else if(op.equals("-")) v = vals.pop()-v;
                else if(op.equals("*")) v = vals.pop()*v;
                else if(op.equals("/")) v = vals.pop()/v;
                else if(op.equals("sqrt")) v = Math.sqrt(v);
                vals.push(v);
            }
            else vals.push(Double.parseDouble(s));
        }
        StdOut.println(vals.pop());
    }
}
