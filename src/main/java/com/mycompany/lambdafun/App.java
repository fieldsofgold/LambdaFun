package com.mycompany.lambdafun;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        {
            LambdaTest t;
            t = (i) -> (i * 9);
            t = (i) -> (i * 90);
            System.out.println("Lambda multiply test: " + t.methodInt(10));
        }

        {
            NumericFunc factorial = (n) -> {
                int result = 1;
                for (int i = 1; i <= n; i++) {
                    result = i * result;
                }
                return result;
            };
            System.out.println("Lambda factorial test(3): " + factorial.func(3));
            System.out.println("Lambda factorial test(4): " + factorial.func(4));
            System.out.println("Lambda factorial test(5): " + factorial.func(5));
        }
    }
}
