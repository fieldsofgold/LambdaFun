package com.mycompany.lambdafun;

import methodReftoIntanceMethods.HighTemp;
import methodReftoIntanceMethods.InstanceMethWithObjectRefDemo;
import methodReftoIntanceMethods.MyFunc;

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
        {
            StringRevFunc RevString = (str) -> {
                String result = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    result += str.charAt(i);
                }
                return result;
            };
            System.out.println("Lambda String Reverse test(Lambda): " + RevString.revFunc("Lambda"));
            System.out.println("Lambda String Reverse test(Segregator): " + RevString.revFunc("Segregator"));
        }
        {
            SomeFunc<String> withWhiteSpace = (str) -> {
                String result = "";
                for (int i = 0; i <= str.length() - 1; i++) {
                    result += str.charAt(i);
                    result += " ";

                }
                return result;
            };
            System.out.println("Lambda String withWhiteSpace test(Lambda): " + withWhiteSpace.func("Lambda"));
            System.out.println("Lambda String withWhiteSpace test(Segregator): " + withWhiteSpace.func("Segregator"));
        }

        {
            String inStr = "Lambda Bad Ass";
            String outStr;
            outStr = stringOp((str) -> str.toUpperCase(), inStr);
            System.out.println("LBA in uppercase:" + outStr);

            outStr = stringOp((str) -> {
                String result = "";
                int i;

                for (i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != ' ') {
                        result += str.charAt(i);
                    }

                }
                return result;

            }, inStr);
            System.out.println("The LBA without spaces:" + outStr);

            PassingLambdaExpAsArgs revString = (str) -> {
                String result = "";
                for (int i = str.length() - 1; i >= 0; i--) {
                    result += str.charAt(i);
                }
                return result;
            };
            System.out.println("The LBA reversed:" + stringOp(revString, inStr));
        }

        /////////////////////////////////////////////////////////////////////////
        //Method Reference to Instance Methods
        /////////////////////////////////////////////////////////////////////////
        {
            int count;

            HighTemp[] weekDayHighs = {new HighTemp(89), new HighTemp(90), new HighTemp(89), new HighTemp(84), new HighTemp(82), new HighTemp(89), new HighTemp(91), new HighTemp(83)};

            count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(82));
            
            
            
        }
    }

    static String stringOp(PassingLambdaExpAsArgs plaa, String s) {
        return plaa.func(s);
    }
}
