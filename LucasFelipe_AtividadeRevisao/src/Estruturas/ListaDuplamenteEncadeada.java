package Estruturas;

import util.No;

public class ListaDuplamenteEncadeada {
    No head = null;
    No tail = null;
    
    public void add(int data) {
        No newNode = new No(data, null, null);
        
        if(this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.setPrev(this.tail);
            newNode.setNext(null);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    
    public void remove(int chave) {
        No currentNode = this.head;
        
        while(currentNode != null) {
            if(currentNode.getChave() == chave) {
                if(currentNode.getPrev() == null) {
                    this.head = currentNode.getNext();
                    currentNode.getNext().setPrev(null);
                } else {
                    currentNode.getPrev().setNext(currentNode.getNext());
                    currentNode.getNext().setPrev(currentNode.getPrev());
                }
            }
            currentNode = currentNode.getNext();
        }
    }
    
    public void print() {
        System.out.println(" Lista Duplamente Encadeada");
        
        No currentNode = this.head;
        
        while(currentNode != null) {
            if(currentNode.getPrev() == null) {
                System.out.print("-------");
            }
            System.out.print(currentNode.getChave() + " | ");
            if(currentNode.getNext() == null) {
                System.out.print("-------");
            }
            currentNode = currentNode.getNext();
        }
    }
}
