package com.example;

import com.example.exercicio01.MathOperations;
import com.example.exercicio02.Desconto;
import com.example.exercicio03.Cliente;
import com.example.exercicio03.ClienteNulo;
import com.example.exercicio03.Pedido;

public class Main {
    public static void main(String[] args) {
        
        MathOperations operation1 = new MathOperations();
        System.out.println("O valor da operação é: "+ operation1.doubleSum(15, 16));

        System.out.println("------------------------------------------------------");

        Desconto desconto1 = new Desconto();
        System.out.printf("O valor após desconto é: %.2f%n" , desconto1.calcular(2588));

        System.out.println("------------------------------------------------------");

        Cliente cliente1 = new ClienteNulo();
        Cliente cliente2 = new Cliente("Uendel Ives");

        Pedido pedido1 = new Pedido(cliente1);
        System.out.println(pedido1.getNomeCliente());
        Pedido pedido2 = new Pedido(cliente2);
        System.out.println(pedido2.getNomeCliente());

        System.out.println("------------------------------------------------------");

        
    }
}