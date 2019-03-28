package ProjetoPessoa;

public class Main {
    public static void main(String args[]){
        Pessoa p = new Pessoa();

        p.setNome("João");
        p.setCpf("232432");

        System.out.println(p.getNome());
        System.out.println(p.getCpf());

    }
}
