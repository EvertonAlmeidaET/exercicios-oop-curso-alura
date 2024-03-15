package br.com.exerciciosOOP.exericios;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibiFichaTecnica(){
        System.out.println("Titulo da musica: " + this.titulo);
        System.out.println("Nome do Artista: " + this.artista);
        System.out.println("Ano de Lançamento: " + this.anoDeLancamento);
        System.out.println("Avaliação: " + avaliacao);
        System.out.println("Número de vezes avaliado: " + numAvaliacoes);
    }

    void recebeAvaliacao(double notaAvaliacao){
        this.avaliacao += notaAvaliacao;
        numAvaliacoes++;
    }

    double mediaDasAvaliacoes(){
        return this.avaliacao / numAvaliacoes;
    }
}
