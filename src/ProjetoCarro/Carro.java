package ProjetoCarro;

public class Carro {

    String modelo, cor, marca, chassi;
    double velocidadeMaxima, velocidadeAtual,
            volumeCombsutivel;
    int ano, nPortas, nMarchas, marchaAtual;
    Proprietario proprietario;

    void acelera(double velocidadeDesejada) {
        velocidadeAtual = velocidadeDesejada;
    }

    void freia() {
        velocidadeAtual = 0;
    }

    void trocarMarcha(int marcha) {
        marchaAtual = marcha;
    }

    void reduzirMarcha() {
        marchaAtual -= 1;
    }


}
