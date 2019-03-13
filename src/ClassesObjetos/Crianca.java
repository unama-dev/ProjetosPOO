package ClassesObjetos;

class Crianca {

    String corCabelo;
    String corPele;
    double altura;
    int idade;

    void brincar(){
        System.out.println("Brincando...");
    }

    void correr(double metros){
        System.out.println("Correndo " + metros + " metros");
    }

    void nadar(double metros){
        System.out.println("Nadand " + metros + " metros");
    }

    String sorrir() {
        return ":)";
    }

}
