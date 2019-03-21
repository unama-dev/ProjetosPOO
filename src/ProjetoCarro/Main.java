package ProjetoCarro;

public class Main {
    public static void main(String args[]){
        Carro meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.ano = 2017;
        meuCarro.chassi = "5321231";
        meuCarro.marca = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.nMarchas = 5;
        meuCarro.nPortas = 5;
        meuCarro.velocidadeMaxima = 250;

        meuCarro.volumeCombsutivel = 10;
        meuCarro.marchaAtual = 2;
        meuCarro.velocidadeAtual = 20;

        System.out.println(meuCarro.velocidadeAtual);
        meuCarro.acelera(30);
        System.out.println(meuCarro.velocidadeAtual);
    }
}
