/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author Admin
 */
public class Pessoa {
    // Atributos
    String nome;
    char sexo;

    // Método que retorna uma descrição do sexo
    public String sexoDescricao() {
        if (sexo == 'M') {
            return "Masculino";
        } else if (sexo == 'F') {
            return "Feminino";
        } else {
            return "Desconhecido";
        }
    }

    // Método para exibir informações da pessoa
    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexoDescricao());
    }
}
