package org.example;

public class Main {

    //var

    //method
    public static void calOper(int num1, int num2)
    {
        System.out.println("num1 + num2: " + num1 + num2);
        System.out.println("num1 % num2: " + num1 % num2);
    }

    public static int plusOper(int num, int plusValue)
    {
        num += plusValue;
        return num;
    }

    public static void equalOper(int num, int standardNum)
    {
        System.out.println(num == standardNum);
    }

    public static void conditionOper(int num)
    {
        System.out.println((num >=90) ? "A" : "B");
    }

    public static void logicalOper(int num1, int num2, int num3, int num4)
    {
        System.out.println((num1 > num2) && (num3 > num4));
    }

    public static void bitOper(int num1, int num2)
    {
        System.out.println(num1&num2);
    }

    public static String ifMethod(int num)
    {
//        if(num > 0) System.out.println("양수입니다.");
//        else if(num == 0) System.out.println("0입니다.");
//        else System.out.println("음수입니다.");

        String strSum = "";
        if(num > 0) strSum = "양수";
        else if(num == 0) strSum = "0";
        else strSum = "음수";

        return strSum;
    }

    public static void switchMethod(int num)
    {
        switch (num) {
            case 1:
                System.out.println("월요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            default:
                System.out.println("기타 요일");
                break;
        }
    }

    public static void forMethod(int num)
    {
        for (int i = 0; i < num; i++) {
            System.out.println(i);
        }
    }

    public static void whileMethod(int num)
    {
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }

    public static void dowhileMethod(int num)
    {
        do {
            System.out.println(num);
            num++;
        } while (num < 3);
    }

    public static void main(String[] args) {
         //System.out.println("Hello world!");
        System.out.println(10+10);

        // 산술 연산자 예제
        calOper(5,7);

        // 대입 연산자 예제
        int x = 5;
        System.out.println("x: " + plusOper(x, 3));

        // 비교 연산자 예제
        equalOper(x, 10);

        // 논리 연산자 예제
        logicalOper(5, 3, 10, 5);

        // 증감 연산자 예제
        x++;
        System.out.println("x: " + x);

        // 삼항 연산자 예제
        int score = 85;
        conditionOper(score);

        // 비트 연산자 예제
        int n = 5;
        int m = 3;
        bitOper(n, m);

        // if문 예제
        System.out.println(ifMethod(3) + "입니다.");

        // switch문 예제
        int day = 3;
        switchMethod(day);

        // for문 예제
        forMethod(5);

        // while문 예제
        int count = 3;
        whileMethod(count);

        // do while문 예제
        int num = 0;
        dowhileMethod(num);
    }
}