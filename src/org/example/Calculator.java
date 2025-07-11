package org.example;

public class Calculator {

    // 사칙연산 메소드 제작 후 feature 브런치 생성하여 commit/push
    // git branch feature/calculate(선택) || git checkout -b feature/calculate(선택)
    // github 화면에서 Pull Request 생성
    // PR에서 reviewer로 강사님(joo-pe) 지정하기
    // 리뷰가 끝나면 main에 merge
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

    public int multicplication(int num1, int num2)
    {
        return num1 * num2;
    }

    public int division(int num1, int num2)
    {
        return num1 / num2;
    }
}
