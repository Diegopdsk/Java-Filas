
package com.mycompany.desafio_filas;

public class Pessoa {
    String Nome;
    int Idade;
    int Posicao;

    public Pessoa(String nome, int idade, int posicao){
        Nome = nome;
        Idade = idade;
        Posicao = posicao;
    }

    
    @Override
    public String toString(){
        return " Nome: " + this.Nome + "\n Posição: " + (this.Posicao+1 + "\n Idade: " + this.Idade);
    }

    public void imprimir(int tam){
        
        int[] tamanho_fila = new int[tam];
        for (int i = 0; i < tamanho_fila.length; i++){
            System.out.println("----------------------------------------");

            if (this.Nome == null){
                
                System.out.println("__________________");
            }else{
                System.out.println((i + 1) + "° da Fila");
                System.out.println(this.Nome);
                System.out.println(this.Idade);
                System.out.println("----------------------------------------");
                    }
        }
    }
}
