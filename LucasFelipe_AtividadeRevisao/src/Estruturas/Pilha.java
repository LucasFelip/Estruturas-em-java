package Estruturas;

import util.No;

public class Pilha {
    
    private No base;
    
    public void empilhar(int o) {
        No novo = new No();
        novo.setChave(o);
        novo.setProx(null);
        
        if (base == null) { //Pilha vazia, a base apontará para o novo nó
            base = novo;
        } else { //A pilha já tem um topo sobre o qual ficará o novo nó
            No topo = encontrarUltimo();
            topo.setProx(novo);
        }
    }
    
    private No encontrarUltimo() {
        No auxiliar = base;
        while (auxiliar.getProx() != null) {
            auxiliar = auxiliar.getProx();
        }
        return auxiliar;
    }
    
    public int desempilhar() {
        if (base == null) {
            throw new NullPointerException("Pilha vazia");
        }
        
        int valor;
        
        if (base.getProx() == null) {
            valor = base.getChave();
            base = null;
        } else {
            No penultimo = encontrarPenultimo();
            valor = penultimo.getProx().getChave();
            penultimo.setProx(null); // Quebra o link com o último nó original
        }
        return valor;
    }
    
    protected No encontrarPenultimo() {
        No auxiliar = base;
        
        while (auxiliar.getProx().getProx() != null) {
            auxiliar = auxiliar.getProx();
        }
        return auxiliar;
    }
    
    public int tamanho() {
        if (base == null) {
            return 0;
        }
        
        int tamanho = 1;
        
        No auxiliar = base;
        while (auxiliar.getProx() != null) {
            auxiliar = auxiliar.getProx();
            tamanho++;
        }
        return tamanho;
    }
    
    public int topo() {
        No topo = encontrarUltimo();
        return topo.getChave();
    }
    
    public void show(){
        No aux = base;
        
        System.out.print(" ----- FIM ----- ");
        while(aux.getProx() != null){
            System.out.print( aux.getProx().getChave() + " | ");
            aux = aux.getProx();
        }
        System.out.println(" ----- INICIO ----- \n\n");
    }
}