package com.mycompany.desafio_filas;

import java.util.ArrayList;


public class Fila_Demo {
    public static void main(String[] args) {
        
        ArrayList<Pessoa> Atendimento = new ArrayList<>();

            Pessoa P1 = new Pessoa("Diego", 34, 01);
            Pessoa P2 = new Pessoa("Fernanda", 54, 02);
            Pessoa P3 = new Pessoa("Tiago", 65, 03);
           
            Atendimento.add(P1);
            Atendimento.add(P2);
            Atendimento.add(P3);
            

            Fila Atende = new Fila(Atendimento.size());
            
            System.out.println(" Mostrando a Fila Inicial!");
                              
            for(int i = 0; i < Atendimento.size(); i++){
                if(Atende.Lista_Vazia()){
                
                    if(Atende.Lista_Vazia() || Atende.tam_fila[i] == 0){ 
                    Atende.imprimir(Atendimento.get(i).Nome, Atendimento.get(i).Idade,Atende.tam_fila[i]);
                    }else if((Atende.Lista_Vazia() || Atende.tam_fila[i] == 1)){
                    Atende.imprimir(Atendimento.get(i).Nome, Atendimento.get(i).Idade,(Atende.tam_fila[i]+1));
                    }
                }
            }
            
                System.out.println("INSERINDO PESSOA NA FILA!");
                Atende.inserir(01,Atendimento.get(0).Idade); // Recebe a senha do usuario
                Atende.Lista_Cheia();
                
            
            System.out.println("*******************************************");
            System.out.println(Atende.tam_fila[0]);
            for(int i = 0; i < Atendimento.size(); i++)
            {
                if(Atende.Lista_Vazia()){
                
                    Atende.imprimir(Atendimento.get(i).Nome, Atendimento.get(i).Idade, Atende.tam_fila[i]);
                    break;
                }else if(Atendimento.get(i).Posicao == Atende.tam_fila[i]){
                    Atende.imprimir(Atendimento.get(i).Nome, Atendimento.get(i).Idade, Atende.tam_fila[i]);
                    System.out.println("_____________________________________________");
                    break;
                }
            
            }
            
            System.out.println("INSERINDO PESSOA NA FILA!");
            
            Atende.inserir(02,Atendimento.get(1).Idade);// recebe a senha do usuario
            Atende.Lista_Cheia();
            
            for(int i = 0; i < Atendimento.size(); i++)
            {
                if(Atende.Lista_Vazia()){
                
                    Atende.imprimir(Atendimento.get(i).Nome, Atendimento.get(i).Idade, Atende.tam_fila[i]);
                    break;
                }else if(Atendimento.get(i).Posicao == Atende.tam_fila[i]){
                    Atende.imprimir(Atendimento.get(i).Nome, Atendimento.get(i).Idade, Atende.tam_fila[i]);
                    System.out.println("_____________________________________________");
                    
                }
            
            }
         
            System.out.println("INSERINDO PESSOA NA FILA!");
            
            Atende.inserir(03,Atendimento.get(2).Idade); // recebe a senha do usuario
            Atende.Lista_Cheia();
            
            
            for(int i = 0; i < Atendimento.size(); i++){
                          
                Atende.imprimir(Atendimento.get(i).Nome, Atendimento.get(i).Idade, Atende.tam_fila[i]);
                    
                 
            }
            
            System.out.println("*****************************");
            System.out.println("REMOVENDO PESSOA NA FILA!");
            
            Atende.remover();
            
            for(int i = 0; i < Atendimento.size(); i++){
                          
                Atende.imprimir(Atendimento.get(i).Nome, Atendimento.get(i).Idade, Atende.tam_fila[i]);
                    
                 
            }
            
            
    }
}              


