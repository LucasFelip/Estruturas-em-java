package util;

public class No {
    int chave;
    No esq, dir; // arvore
    No prev, next; // LDE
    No prox; // pilha
     
    public No(){
        chave = 0;
        this.prox = null;
    }
    
    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No(int chave, No prev, No next) {
        this.chave = chave;
        this.prev = prev;
        this.next = next;
    }

    public No getPrev() {
        return prev;
    }

    public void setPrev(No prev) {
        this.prev = prev;
    }

    public No getNext() {
        return next;
    }

    public void setNext(No next) {
        this.next = next;
    }


///////////////////////////////////////////////////////////////
    public No(int chave){
        this.chave = chave;
        this.esq = null;
        this.dir = null;
    }
    
    public int getChave() {
        return chave;
    }
	
    public void setChave(int chave) {
        this.chave = chave;
    }
	
    public No getEsq() {
        return esq;
    }
	
    public void setEsq(No esq) {
        this.esq = esq;
    }
	
    public No getDir() {
        return dir;
    }
	
    public void setDir(No dir) {
        this.dir = dir;
    }
}
