/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Estruturas.ListaDuplamenteEncadeada;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Inspion
 */
public class MenuLDE {
    
    public static void delay(int time){
        try {
            Thread.sleep (time);
        } catch (InterruptedException ex) {
            Logger.getLogger(MenuPilha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void menuLDE(){
        ListaDuplamenteEncadeada l = new ListaDuplamenteEncadeada();
        
        int escolha, chave;
        Scanner scan = new Scanner(System.in);
        
        try {
            FileReader ler = new FileReader("C:\\Users\\Inspion\\Documents\\NetBeansProjects\\LucasFelipe_AtividadeRevisao\\src\\Entrada\\entrada.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            
            while((linha = reader.readLine()) != null){
                chave = Integer.parseInt(linha);
                l.add(chave);
            }
                System.out.println("\n ESTRUTURA CARREGADA \n");
            } catch (IOException ex) {
                Logger.getLogger(MenuPilha.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        do{
            System.out.print("\nLista Duplamente Encadeada\n\n 1 - EXCLUIR \n 2 - EXIBIR\n 0 - SAIR\n Escolha uma opção: ");
            escolha = scan.nextInt();
            
            System.out.println("\n");
            switch(escolha){
                case 0:
                    System.out.println("ENCERRANDO");
                    delay(100);
                    System.out.println("\n\n\n\n");
                    break;
                    
                case 1:
                    System.out.print("Insira o elemento que deseja excluir da arvore: ");
                    chave = scan.nextInt();
                    
                    l.remove(chave);
                    
                    delay(100);
                    break;
                    
                case 2:          
                    l.print();
                    delay(2000);
                    break;

                default:
                    System.out.println("Escolha invalida");
                    break;
            }
            
        }while(escolha != 0);
        
    }
    
}
