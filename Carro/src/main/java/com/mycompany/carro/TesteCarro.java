/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carro;

/**
 *
 * @author Admin
 */
public class TesteCarro {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro meuCarro = new Carro();

        // Atribuindo valores aos atributos do carro
        meuCarro.modelo = "Fusca";
        meuCarro.cor = "Azul";
        meuCarro.velocidade = 80;

        // Chamando o método para exibir as informações
        meuCarro.exibirInformacoes();
    }
}

