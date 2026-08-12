public class Passagem {

    Passageiro passageiro;
    Voos voo;

    public Passagem(Passageiro passageiro, Voos voo) {
        this.passageiro = passageiro;
        this.voo = voo;
    }

    String numPassagem;
    boolean ativa = true;
}