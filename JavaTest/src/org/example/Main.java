package org.example;

public class Main {

    //var

    //method
    public static void add(int num1, int num2)
    {
        System.out.println("num1 + num2: "+num1 + num2);
    }

    public static int plus(int num, int plusValue)
    {
        num += plusValue;
        return num;
    }

    public static void equal(int num, int standardNum)
    {
        System.out.println(num == standardNum);
    }

    public static void scoreOper(int num)
    {
        System.out.println((num >=90) ? "A" : "B");
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

    public static void main(String[] args) {
         //System.out.println("Hello world!");
        System.out.println(10+10);

        add(5,7);

        int x = 5;
        System.out.println("x: " + plus(x, 3));

        equal(x, 10);

        System.out.println((5>3) && (10>5));

        x++;
        System.out.println("x: " + x);

        int score = 85;
        scoreOper(score);

        int n = 5;
        int m = 3;
        bitOper(n, m);

        System.out.println(ifMethod(3) + "입니다.");

        int day = 3;
        switchMethod(day);

        for(int i = 0; i < 3; i++)
        {
            x += i;
            System.out.println("x: " + x);
        }

        while(true)
        {
            x++;
            System.out.println("x: " + x);
            if(x > 20) break;
        }

        do {
            x++;
            System.out.println("x: " + x);
        } while (x < 25);

    }
}