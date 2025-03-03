package com.example;

import com.example.exercicio01.MathOperations;
import com.example.exercicio02.Desconto;

public class Main {
    public static void main(String[] args) {
        
        MathOperations operation1 = new MathOperations();
        System.out.println("O valor da operação é: "+ operation1.doubleSum(15, 16));

        System.out.println("------------------------------------------------------");

        Desconto desconto1 = new Desconto();
        System.out.printf("O valor após desconto é: %.2f%n" , desconto1.calcular(2588));
    }
}