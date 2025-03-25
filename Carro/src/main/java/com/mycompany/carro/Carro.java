/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carro;

/**
 *
 * @author Admin
 */
  public class Carro {
    // Atributos (Características do carro)
    String modelo;
    String cor;
    int velocidade;

    // Método para exibir informações do carro
    public void exibirInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }
}
