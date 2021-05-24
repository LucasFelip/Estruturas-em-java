/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;

import Estruturas.ArvoreBin;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.No;

/**
 *
 * @author Inspion
 */
public class MenuTree {
    
    public static void delay(int time){
        try {
            Thread.sleep (time);
        } catch (InterruptedException ex) {
            Logger.getLogger(MenuPilha.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void menuTree(){
        No no = new No(45);
        ArvoreBin tree = new ArvoreBin();
        
        int escolha, chave;
        Scanner scan = new Scanner(System.in);
        
        try {
            FileReader ler = new FileReader("C:\\Users\\Inspion\\Documents\\NetBeansProjects\\LucasFelipe_AtividadeRevisao\\src\\Entrada\\entrada.txt");
            BufferedReader reader = new BufferedReader(ler);
            String linha;
            
            while((linha = reader.readLine()) != null){
                chave = Integer.parseInt(linha);
                tree.insereArvore(no, chave);
            }
            System.out.println("\n ESTRUTURA CARREGADA \n");
        } catch (IOException ex) {
            Logger.getLogger(MenuPilha.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        do{
            System.out.print("\nARVORE\n\n 1 - BUSCAR\n 2 - EXCLUIR \n 3 - EXIBIR\n 0 - SAIR\n Escolha uma opção: ");
            escolha = scan.nextInt();
            
            System.out.println("\n");
            switch(escolha){
                case 0:
                    System.out.println("ENCERRANDO");
                    delay(100);
                    System.out.println("\n\n\n\n");
                    break;
                    
                case 1:
                    System.out.print("Insira o elemento que deseja buscar da arvore: ");
                    chave = scan.nextInt();
                    if(tree.buscaBinaria(no, chave) != null)
                        System.out.println("\n ELEMENTO ENCONTRADO! O " + chave + " está na arvore!");
                    else
                        System.out.println("\n ELEMENTO NÃO ENCONTRADO! O " + chave + " não está na arvore!");
                    delay(2000);
                    break;
                    
                case 2:
                    System.out.print("Insira o elemento que deseja excluir da arvore: ");
                    chave = scan.nextInt();
                    tree.excluiArvore(no, chave);
                    delay(100);
                    break;
                    
                case 3:          
                    System.out.print("Pre : ");
                    tree.preOrdem(no);
                    System.out.print("\nEm  : ");
                    tree.emOrdem(no);
                    System.out.print("\nPos : ");
                    tree.posOrdem(no);
                    delay(2000);
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
                    break;
            }
            
        }while(escolha != 0);
        
    }
}
