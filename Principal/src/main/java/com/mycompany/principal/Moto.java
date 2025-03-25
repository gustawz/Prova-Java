/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Admin
 */
public class Moto extends Veiculo {
    private int cilindradas;

    // Construtor
    public Moto(String modelo, String cor, int cilindradas) {
        super(modelo, cor); // Chama o construtor da classe Veiculo
        this.cilindradas = cilindradas;
    }

    // Método para acelerar a moto
    @Override
    public void acelerar(int aumento) {
        if (aumento > 0) {
            velocidade += aumento;
            System.out.println("A moto acelerou para " + velocidade + " km/h.");
        } else {
            System.out.println("A aceleração deve ser maior que zero.");
        }
    }

    // Método para exibir informações da moto
    @Override
    public void exibirInformacoes() {
        System.out.println("Moto: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Velocidade atual: " + velocidade + " km/h");
    }
}

