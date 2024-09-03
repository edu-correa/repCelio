package org.example;

public class HashtableTema {
    private ListaLigada<Temporada>[] tab;

    public HashtableTema(int tamanho) {
        tab = new ListaLigada[tamanho];

        for (int i = 0; i < tamanho; i++) {
            tab[i] = new ListaLigada();
        }
    }

    private int funcaoHash(int x){
        if (x < 0){
            x = x * -1;
        }
        return x % tab.length;
    }

    public void insere(Temporada x){
        int posicao = funcaoHash(x.getId());
        tab[posicao].insereNode(x);
    }

    public boolean busca(Temporada x){
        int posicao = funcaoHash(x.getId());
        return tab[posicao].buscaNode(x) != null;
    }

    public boolean remove(Temporada x){
        int posicao = funcaoHash(x.getId());
        return tab[posicao].removeNode(x);
    }

    public void exibe(){
        for (int i = 0; i < tab.length; i++) {
            System.out.println("Entrada " + i + ": ");
            tab[i].exibe();
            System.out.println("---------------------");
        }
    }

    public ListaLigada[] getTab() {
        return tab;
    }
}
