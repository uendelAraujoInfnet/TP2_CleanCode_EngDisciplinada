package com.example;

import com.example.exercicio01.MathOperations;
import com.example.exercicio02.Desconto;
import com.example.exercicio03.Cliente;
import com.example.exercicio03.Pedido;
import com.example.exercicio04.Ajuste;
import com.example.exercicio04.Produto;
import com.example.exercicio07.RelatorioService;
import com.example.exercicio08.ContaBancaria;
import com.example.exercicio09.FilaMensagens;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Exercicio 01 - Operações Matemáticas");
        MathOperations operation1 = new MathOperations();
        System.out.println("O valor da operação é: "+ operation1.doubleSum(15, 16));

        System.out.println("------------------------------------------------------");

        System.out.println("Exercicio 02 - Ajustes na classe Desconto");
        Desconto desconto1 = new Desconto();
        System.out.printf("O valor após desconto é: %.2f%n" , desconto1.calcular(2588));

        System.out.println("------------------------------------------------------");

        System.out.println("Exercicio 03 - Refatorando a classe Pedido");
        Pedido pedido1 = new Pedido(new Cliente("Uendel Ives"));
        System.out.println(pedido1.getNomeCliente());
        Pedido pedido2 = new Pedido(null);
        System.out.println(pedido2.getNomeCliente());

        System.out.println("------------------------------------------------------");

        System.out.println("Exercicio 04 - Corrigindo o problema da classe Ajuste");
        Produto produtoOriginal = new Produto("Lave-vaisselle", 7500);
        Ajuste ajuste = new Ajuste();

        //Aplicando desconto sem modificação do objeto original
        Produto produtoComDesconto = ajuste.aplicarDesconto(produtoOriginal, 435);

        System.out.println("Preço original: " + produtoOriginal.getPreco());
        System.out.println("Preço com desconto: " + produtoComDesconto.getPreco());

        System.out.println("------------------------------------------------------");

        System.out.println("Exercicio 07 - Testando Criação de Relatorios");
        RelatorioService service = new RelatorioService();
        
        service.gerarRelatorio("PDF");
        service.gerarRelatorio("CSV");
        service.gerarRelatorio("JSON");
        service.gerarRelatorio("XML"); // Testando erro

        System.out.println("------------------------------------------------------");

        System.out.println("Exercicio 08 - Testando Saldo Bancário");
        ContaBancaria conta = new ContaBancaria(100);

        System.out.println("Saldo inicial: " + conta.getSaldo());

        // Teste de consulta sem modificar saldo
        System.out.println("Pode comprar item de R$ 50? " + conta.podeComprar(50));
        System.out.println("Saldo após verificação: " + conta.getSaldo());

        // Teste de compra efetiva
        if (conta.realizarCompra(50)) {
            System.out.println("Compra realizada!");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Saldo após compra: " + conta.getSaldo());

        System.out.println("------------------------------------------------------");

        System.out.println("Exercicio 09 - Testando Sistema de Mensageria");
        FilaMensagens fila = new FilaMensagens();

        fila.adicionarMensagem("Mensagem 1");
        fila.adicionarMensagem("Mensagem 2");

        System.out.println("Próxima mensagem (sem remover): " + fila.visualizarProximaMensagem());
        System.out.println("Fila ainda contém: " + fila.visualizarProximaMensagem()); 
        System.out.println("Obtendo e removendo mensagem: " + fila.obterProximaMensagem()); 

        System.out.println("Próxima mensagem após remoção: " + fila.visualizarProximaMensagem()); 
        System.out.println("Obtendo e removendo mensagem: " + fila.obterProximaMensagem()); 
        System.out.println("Fila está vazia? " + fila.estaVazia());

        
    }
}