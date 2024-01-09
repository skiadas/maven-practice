package org.example;

import org.example.math.OpRunner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OpRunner opRunner = new OpRunner();
        System.out.println("Type integer math operations, e.g. 4 + 5");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int a = scanner.nextInt();
            String op = scanner.next();
            int b = scanner.nextInt();
            int result = opRunner.doOp(a, op, b);
            System.out.printf("%d %s %d = %s", a, op, b, result);
        }

    }
}