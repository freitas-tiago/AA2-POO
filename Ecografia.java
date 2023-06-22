package examesclinicos;

public class Ecografia extends Exame {
    private String preparacaoPropria;

    public Ecografia(String convenio, String nomeDoMedico, String nomeDoPaciente, String preparacaoPropria) {
        super(convenio, nomeDoMedico, nomeDoPaciente);
        this.preparacaoPropria = preparacaoPropria;
    }

    // Getter e Setter para preparacaoPropria

    public String getPreparacaoPropria() {
        return preparacaoPropria;
    }

    public void setPreparacaoPropria(String preparacaoPropria) {
        this.preparacaoPropria = preparacaoPropria;
    }
}
