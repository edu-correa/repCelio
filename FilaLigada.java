package org.example;

public class FilaLigada<T> {

    private Node inicio;
    private Node fim;


    // Construtor
    @SuppressWarnings("unchecked")
    public FilaLigada() {
//        fila = (T[]) new Object[capacidade];
//        tamanho = 0;
        inicio = new Node(0);
        fim = null;
    }

    // Métodos

    /* Método isEmpty() - retorna true se a fila está vazia e false caso contrário */
    public boolean isEmpty() {
        return inicio.getNext() == null;
    }

    /* Método insert - recebe um elemento e insere esse elemento na fila
                       no índice tamanho, e incrementa tamanho
                       Lançar IllegalStateException caso a fila esteja cheia
     */
    public void insert(T info) {
        if(fim == null) {
            inicio.setNext(new Node(info));
            fim = inicio.getNext();
        } else{
            Node aux = new Node(info);
            fim.setNext(aux);
            fim = aux;
        }
    }

    /* Método peek - retorna o primeiro elemento da fila, sem removê-lo */
    @SuppressWarnings("unchecked")
    public T peek() {
        return (T) inicio.getInfo();
    }

    /* Método poll - remove e retorna o primeiro elemento da fila, se a fila não estiver
       vazia. Quando um elemento é removido, a fila "anda", e tamanho é decrementado
       Depois que a fila andar, "limpar" o ex-último elemento da fila, atribuindo null
     */
    @SuppressWarnings("unchecked")
    public T poll() {
        if (!isEmpty()){
            Node aux = inicio;
            inicio = inicio.getNext();
            return (T) aux.getInfo();
        } else{
            System.out.println("fila vazia");
            return null;
        }
    }

    /* Método exibe() - exibe o conteúdo da fila */
    public void exibe() {
        Node atual = inicio;
        while (atual != null){
            System.out.println(atual);
            atual = atual.getNext();
        }
    }

    /* Usado nos testes  - complete para que fique certo */
    public int getTamanho(){
        Node atual = inicio;
        int contador = 0;
        while (atual != null){
            System.out.println(atual);
            atual = atual.getNext();
            contador++;
        }
        return contador;
    }
}
