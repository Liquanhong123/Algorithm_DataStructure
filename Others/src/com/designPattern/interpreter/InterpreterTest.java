package com.designPattern.interpreter;

public class InterpreterTest {
    public static void main(String[] args) {

        Context context = new Context(5,4);
        Expression expression1 = new Plus();
        System.out.println(expression1.interpret(context));
        Expression expression2 = new Multiply();
        System.out.println(expression2.interpret(context));
    }
}
