package br.com.exerciciosOOP.exericios;

public class Carro {

    String marca;
    String modelo;
    int ano;
    String cor;

    void fichaTecnicaVeiculo(){
        System.out.println("Marca do veículo: " + marca);
        System.out.println("Modelo do veículo: " + modelo);
        System.out.println("Ano do veículo: "+ ano);
        System.out.println("Cor do veículo: " + cor);
    }

    int idadeVeiculo(){
        return Math.abs(this.ano - 2024);
    }
}
