package com.example.caculator.model;

public class Calculator {
    public static float calculator(float firstNumber, float secondNumber, char operand){
        switch (operand){
            case '-':
                return firstNumber - secondNumber;
            case '+':
                return firstNumber + secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber !=0){
                    return firstNumber/secondNumber;
                }else {
                    throw new RuntimeException("secondNumber not Zero");
                }
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
