/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Admin
 */
public class Principal {
    public static void main(String[] args) {
        // Criando um objeto da classe Veiculo
        Veiculo v = new Veiculo("Genérico", "Branco");
        v.acelerar(30);
        v.exibirInformacoes();
        System.out.println();

        // Criando um objeto da classe Carro
        Carro c = new Carro("Sedan", "Preto", 4);
        c.acelerar(50);
        c.frear(10);
        c.exibirInformacoes();
        System.out.println();

        // Criando um objeto da classe Moto
        Moto m = new Moto("Esportiva", "Vermelha", 600);
        m.acelerar(80);
        m.exibirInformacoes();
    }
}

