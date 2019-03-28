package ProjetoCarro;

public class Carro {

    String modelo, cor, marca, chassi;
    double velocidadeMaxima, velocidadeAtual,
            volumeCombsutivel;
    int ano, nPortas, nMarchas, marchaAtual;
    Proprietario proprietario;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVolumeCombsutivel() {
        return volumeCombsutivel;
    }

    public void setVolumeCombsutivel(double volumeCombsutivel) {
        this.volumeCombsutivel = volumeCombsutivel;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getnPortas() {
        return nPortas;
    }

    public void setnPortas(int nPortas) {
        this.nPortas = nPortas;
    }

    public int getnMarchas() {
        return nMarchas;
    }

    public void setnMarchas(int nMarchas) {
        this.nMarchas = nMarchas;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setMarchaAtual(int marchaAtual) {
        this.marchaAtual = marchaAtual;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

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
