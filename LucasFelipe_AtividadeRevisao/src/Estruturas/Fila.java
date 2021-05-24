package Estruturas;

import util.NoFila;

public class Fila {
    private NoFila inicio;
    
    public Fila() {
        inicio = null;
    }
    
    public boolean vazia() {
        return inicio == null;
    }
    
    public void adiciona(int e) {
        if (vazia()) {
            NoFila novo = new NoFila(e);
            novo.prox = inicio;
            inicio = novo;
        }else{
            NoFila aux = inicio;
            while(aux.prox != null) {
                aux = aux.prox;
            }
            aux.prox = new NoFila(e);
        }
    }
    
    public int remove() {
        int r = -1;
        
        if (vazia()) {
            System.out.println("Erro! A fila está vazia.");
        } else {
            r = inicio.dado;
            inicio = inicio.prox;
        }
        return r;
    }
    
    public void exibe() {
        if (vazia()) {
            System.out.println("Erro! A fila está vazia.");
        } else {
            NoFila aux = inicio;
            System.out.print("\n ----- INICIO ----- ");
            while (aux != null) {
                System.out.print(aux.dado + " | ");
                aux = aux.prox;
            }
            System.out.print(" ----- FIM ----- \n");
        }
    }
    
}
