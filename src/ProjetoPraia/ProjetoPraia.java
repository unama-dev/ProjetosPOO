package ProjetoPraia;

public class ProjetoPraia {
    public static void main(String args[]){
        Crianca c1 = new Crianca();
        c1.altura = 1.6;
        c1.corCabelo = "Loiro";
        c1.corPele = "Branca";
        c1.idade = 10;
        c1.brincar();
        c1.correr(100);
        System.out.println(c1.sorrir());
        System.out.println(c1.altura);

        Planta planta = new Planta();

        planta.cor = "Verde";
        planta.tamanho = 1.9;
        planta.tipo = "Laranjeira";

        System.out.println(planta.cor);
        System.out.println(planta.tamanho);
        System.out.println(planta.tipo);

        System.out.println(planta.darFrutos());
        planta.seAlimentar();






    }

}
