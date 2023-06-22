package examesclinicos;

public class RaioX extends Exame {
    private String preparacaoPropria;

    public RaioX(String convenio, String nomeDoMedico, String nomeDoPaciente, String preparacaoPropria) {
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
