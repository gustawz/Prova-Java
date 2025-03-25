/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Admin
 */
public class Veiculo {
    protected String modelo;
    protected String cor;
    protected int velocidade;

    // Construtor
    public Veiculo(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
        this.velocidade = 0; // Começa parado
    }

    // Método para acelerar
    public void acelerar(int aumento) {
        if (aumento > 0) {
            velocidade += aumento;
            System.out.println("O veículo acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("A aceleração deve ser maior que zero.");
        }
    }

    // Método para exibir informações
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}
