package ProjetoClinica;


public class AtendimentoMedico {

    String dataConsulta;
    double valorConsulta;
    Paciente paciente;
    Medico medico;

    AtendimentoMedico(String dataConsulta, double valorConsulta, Paciente paciente, Medico medico){
        this.dataConsulta = dataConsulta;
        this.valorConsulta = valorConsulta;
        this.paciente = paciente;
        this.medico = medico;

    }

}
