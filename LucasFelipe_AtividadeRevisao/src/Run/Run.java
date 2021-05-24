/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Run;


import java.util.Scanner;

/**
 *
 * @author Inspion
 */
public class Run {
    
    
    public static void main(String [] args){
        
        MenuTree tree = new MenuTree();
        MenuLDE lde = new MenuLDE();
        MenuFila fila = new MenuFila();
        MenuPilha pilha = new MenuPilha();
        
        int dado;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.print(" ATIVIDADE DE REVISÃO - AED II\n Aluno - Lucas Felipe\n\n 1 - Arvore Binaria \n 2 - Lista Duplamente Encadeada\n 3 - Fila \n 4 - Pilha \n 0 - Sair\n Escolher opcao: ");
            dado = scan.nextInt();
            
            switch(dado){
                case 0:
                    System.out.println("ENCERRANDO");
                    break;
                case 1:
                    tree.menuTree();
                    break;
                case 2:
                    lde.menuLDE();
                    break;
                case 3:
                    fila.menuFila();
                    break;
                case 4:
                    pilha.menuPilha();
                    break;   
                default:
                    System.out.println("Escolha invalida");
                    break;
            }
        }while(dado != 0);        
    }
}
