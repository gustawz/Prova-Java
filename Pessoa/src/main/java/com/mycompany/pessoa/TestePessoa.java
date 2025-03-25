/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pessoa;

/**
 *
 * @author Admin
 */
public class TestePessoa {
    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa1 = new Pessoa();

        // Atribuindo valores aos atributos
        pessoa1.nome = "Ana";
        pessoa1.sexo = 'F';

        // Exibindo informações
        pessoa1.imprimirInformacoes();
    }
}

