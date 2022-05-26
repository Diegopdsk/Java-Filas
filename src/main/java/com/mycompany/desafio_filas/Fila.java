
package com.mycompany.desafio_filas;

public class Fila {
    
    public int primeira_pos;
    public int ultima_pos;
    public int total;
    public int[] tam_fila;
    
    public Fila(int max){
                
        tam_fila = new int[max];
        primeira_pos = 0;
        ultima_pos = 0;
        total = 0;
    }    
     
    public boolean inserir(int posicao, int idade){
                
        if (Lista_Cheia()){
                    
            System.out.println("Encerrado Atendimento por Hoje");
            return false;
        }else if(idade >65){
            
            tam_fila[primeira_pos] = posicao;
            ultima_pos = (ultima_pos + 1) % tam_fila.length;// o resto da divisão da como resultado a posição
            total++;
            return true;
        }else{
            tam_fila[ultima_pos] = posicao;
            ultima_pos = (ultima_pos + 1) % tam_fila.length;// o resto da divisão da como resultado a posição
            total++;
            return true;
        }
        
        }

    public int remover(){
                
        if (Lista_Vazia()){
                    
            System.out.println("Não Há ninguem na Fila");
        }

        int posicao = primeira_pos;
        primeira_pos = (primeira_pos + 1) % tam_fila.length;
        total--;
        return posicao;

    }

    public boolean Lista_Vazia(){
        
        return total == 0;
    }
            

    public boolean Lista_Cheia(){
                
        return total == tam_fila.length;
    }
    
    public void imprimir(String nome, int idade, int posicao){
        String Nome = nome;
        int id = idade;
        int pos = posicao;
        
        if(Lista_Vazia()){
            System.out.println("Nome: ____________________");
            System.out.println("Idade: ___________________");
            System.out.println("Posição: "+(pos));
        }else{
            System.out.println("Nome: "+Nome);
            System.out.println("Idade: "+id);
            System.out.println("Posição: "+pos);
        }
    }

}

