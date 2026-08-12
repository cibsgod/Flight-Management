public class Voos {

    String codVoo;
    String origem;
    String destino;
    String horario;
    float preco;
    int capMax;
    int passageiros;

    Voos(String codVoo, String origem, String destino, String horario,
         float preco, int capMax, int passageiros) {

        this.codVoo = codVoo;
        this.origem = origem;
        this.destino = destino;
        this.horario = horario;
        this.preco = preco;
        this.capMax = capMax;
        this.passageiros = passageiros;
    }
}