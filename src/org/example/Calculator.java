package org.example;

public class Calculator {

    // var

    // method
    public int addition(int num1, int num2)
    {
        return num1 + num2;
    }

    public int substraction(int num1, int num2)
    {
        return num1 - num2;
    }

    public int multiplication(int num1, int num2)
    {
        return num1 * num2;
    }

    public void division(int num1, int num2)
    {
        int sum = 0;
        try
        {
            sum = num1 / num2;
            System.out.println(num1 + " / " + num2 + ": " + sum);
        }catch(ArithmeticException e)
        {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        // try catch 종료 후 항상 무언가 작동하는 기능을 넣고 싶다면 finally{}
        finally
        {
            System.out.println("프로그램 종료");
        }

    }
}
