package br.com.exerciciosOOP.exericios;

public class Principal {
    public static void main(String[] args) {
        //1º Exercicio
        Pessoa p1 = new Pessoa();
        p1.exibiBoasVindas();
        System.out.println("-----------------------");

        //2º Exercicio
        Calculadora calc1 = new Calculadora();
        System.out.println(calc1.dobroDoValor(2));
        System.out.println("-----------------------");

        //3º Exercicio
        Musica musica1 = new Musica();
        musica1.titulo = "Sound The Alarm";
        musica1.artista = "Band Adept";
        musica1.anoDeLancamento = 2010;
        musica1.recebeAvaliacao(7);
        musica1.recebeAvaliacao(10);
        musica1.recebeAvaliacao(5);
        System.out.println("--- Dados Musica ---");
        musica1.exibiFichaTecnica();
        System.out.println("Media das avaliações: " + musica1.mediaDasAvaliacoes());
        System.out.println("-----------------------");

        //4º Exericio
        Carro carro1 = new Carro();
        carro1.marca = "volkswagen";
        carro1.modelo = "Gol geração 10º";
        carro1.ano = 2014;
        carro1.cor = "cinza-chumbo";
        System.out.println("<-- DADOS DO VEÍCULO -->");
        carro1.fichaTecnicaVeiculo();
        System.out.println("O Veículo tem: " + carro1.idadeVeiculo() + " anos");


    }
}