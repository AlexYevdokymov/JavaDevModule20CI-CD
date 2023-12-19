package org.example;

public class Calculator {
    public int sum(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("An argument must be > 0");
        } else {
            int summ = 0;
            for (int i = 1; i <= n; i++) {
                summ += i;
            }
            return summ;
        }
    }
}
