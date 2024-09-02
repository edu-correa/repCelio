package org.example;

public class PilhaLigada<T> {

    // 01) Atributos
    private Node topo;

    // 02) Construtor
    public PilhaLigada() {
        topo = new Node(null);
    }

    // 03) Metodo isEmpty
    public Boolean isEmpty() {
        return topo.getNext() == null;
    }

    // 05) Metodo push
    public void push(T info) {
        Node temp = new Node(info);
        temp.setNext(topo.getNext());
        topo.setNext(temp);
    }

    // 06) Metodo pop
    public Node pop() {
        Node temp = topo.getNext();
        topo.setNext(temp.getNext());
        return temp;
    }

    // 07) Metodo peek
    public Node peek() {
        if (isEmpty()) {
            return null;
        }
        return topo.getNext();
    }

    // 08) Metodo exibe
    public void exibe() {
        if (isEmpty()) {
            System.out.println("Pilha vazia");
        }
        else {
            Node next = topo.getNext() ;
            while (next != null){
                System.out.println(next);
                next = next.getNext();
            }
        }
    }


    //Getters & Setters (manter)
    public Node getTopo() {
        return topo;
    }
}