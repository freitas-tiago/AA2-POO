public void adicionarExame() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o convênio:");
    String convenio = scanner.nextLine();

    System.out.println("Digite o nome do médico:");
    String nomeMedico = scanner.nextLine();

    System.out.println("Digite o nome do paciente:");
    String nomePaciente = scanner.nextLine();

    Exame exame = new Exame(convenio, nomeMedico, nomePaciente);
    exames.add(exame);

    System.out.println("Exame adicionado com sucesso!");
}
/**
 * 
 */
public void exibirExames() {
    System.out.println("Lista de Exames Clínicos:");
    for (Exame exame : exames) {
        System.out.println(exame);
    }
}

