package com.mycompany.lambdafun;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        LambdaTest t;
        t = (i) -> (i*9);
        t = (i) -> (i*90);
        System.out.println( t.methodInt(10) );
    }
}
