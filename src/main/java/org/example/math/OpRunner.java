package org.example.math;

public class OpRunner {
   public int doOp(int a, String op, int b) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: throw new RuntimeException("Unknown operation");
        }
   }
}
