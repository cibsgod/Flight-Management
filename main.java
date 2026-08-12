import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Voos> voos = new ArrayList<>();
        ArrayList<Passageiro> passageiros = new ArrayList<>();
        ArrayList<Passagem> passagens = new ArrayList<>();

        String opcoes[] = {
            "Cadastrar voo",
            "Listar voos",
            "Buscar voo",
            "Cadastrar passageiro",
            "Comprar passagem",
            "Cancelar passagem",
            "Sair"
        };

        boolean continuar = true;

        System.out.println("===== GERENCIADOR DE VOOS =====\n");

        while (continuar) {

            for (int i = 0; i < 7; i++) {
                System.out.println((i + 1) + " - " + opcoes[i]);
            }

            System.out.println("Escolha uma opção para continuar.\n");
            int escolha = scanner.nextInt();

            if (escolha == 7) {
                continuar = false;
                System.out.println("Programa encerrado!");
            }

            if (escolha == 1) {

                System.out.println("Digite o código do voo:");
                String codVoo = scanner.next();

                System.out.println("Digite a origem:");
                String origem = scanner.next();

                System.out.println("Digite o destino:");
                String destino = scanner.next();

                System.out.println("Digite o horário do voo:");
                String horario = scanner.next();

                System.out.println("Digite o preço da sua passagem:");
                float preco = scanner.nextFloat();

                System.out.println("Digite a capacidade do seu voo:");
                int capMax = scanner.nextInt();

                Voos novoVoo = new Voos(
                    codVoo,
                    origem,
                    destino,
                    horario,
                    preco,
                    capMax,
                    0
                );

                voos.add(novoVoo);

                System.out.println("Voo cadastrado com sucesso!");
            }

            if (escolha == 2) {

                for (Voos voo : voos) {

                    System.out.println("Código: " + voo.codVoo);
                    System.out.println("Origem: " + voo.origem);
                    System.out.println("Destino: " + voo.destino);
                    System.out.println("Horário: " + voo.horario);
                    System.out.println("Preço: " + voo.preco);
                    System.out.println("Capacidade: " + voo.capMax);
                    System.out.println("Passageiros: " + voo.passageiros);

                }
            }

            if (escolha == 3) {

                System.out.println("Digite o código do seu voo:");
                String codDigitado = scanner.next();

                Voos vooEncontrado = null;

                for (Voos voo : voos) {

                    if (voo.codVoo.equals(codDigitado)) {

                        vooEncontrado = voo;
                        break;
                    }
                }

                if (vooEncontrado != null) {

                    System.out.println("Origem: " + vooEncontrado.origem);
                    System.out.println("Destino: " + vooEncontrado.destino);
                    System.out.println("Horário: " + vooEncontrado.horario);
                    System.out.println("Preço: " + vooEncontrado.preco);
                    System.out.println("Capacidade: " + vooEncontrado.capMax);
                    System.out.println("Passageiros: " + vooEncontrado.passageiros);

                } else {

                    System.out.println("Código de voo não encontrado.");
                }
            }

            if (escolha == 4) {

                scanner.nextLine();

                System.out.println("Digite seu nome: ");
                String nome = scanner.nextLine();

                System.out.println("Digite seu cpf: ");
                String cpf = scanner.nextLine();

                System.out.println("Digite sua idade: ");
                int idade = scanner.nextInt();

                Passageiro novoPassageiro = new Passageiro(nome, cpf, idade);

                passageiros.add(novoPassageiro);

                System.out.println("Passageiro cadastrado com sucesso!");
            }

            if (escolha == 5) {

                System.out.println("Digite o código do voo:");
                String codigoDigitado = scanner.next();

                Voos vooEncontrado = null;

                for (Voos voo : voos) {

                    if (voo.codVoo.equals(codigoDigitado)) {
                        vooEncontrado = voo;
                        break;
                    }
                }

                if (vooEncontrado != null) {

                    System.out.println("Voo encontrado!");
                    System.out.println("Código: " + vooEncontrado.codVoo);
                    System.out.println("Origem: " + vooEncontrado.origem);
                    System.out.println("Destino: " + vooEncontrado.destino);

                } else {

                    System.out.println("Voo não encontrado!");
                }
            }

            if (escolha == 6) {

                System.out.println("Digite o número da sua passagem: ");
                String numDigitado = scanner.next();

                for (Passagem passagem : passagens) {

                    if (passagem.numPassagem.equals(numDigitado)) {

                        passagem.ativa = false;

                        System.out.println("Passagem cancelada com sucesso!");

                        break;
                    }
                }
            }
        }

        scanner.close();
    }
}