public class Passageiro {

    private String nome;
    private String cpf;
    private int idade;

    public Passageiro(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return cpf;
    }

    public void setIdade(int novaIdade) {

        if (novaIdade >= 0) {
            this.idade = novaIdade;
        } else {
            System.out.println("Idade inválida!");
        }
    }
}