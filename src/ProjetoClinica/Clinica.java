package ProjetoClinica;

public class Clinica {
    public static void main(String args[]){
        //Criação do paciente
        Paciente p1 = new Paciente("Pedro", 1223, "Rua xpto");
        //Criação do Médico
        Medico m1 = new Medico("João", 1232432, "Rua xyz");
        //Criação do atendimento médico
        AtendimentoMedico at1 = new AtendimentoMedico("27/03/2018", 90.0, p1, m1);
    }
}
