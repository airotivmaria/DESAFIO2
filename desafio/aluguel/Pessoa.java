package desafio.aluguel;

import java.util.Scanner;

public class Pessoa extends Usuario {

    public void Cadastro() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nome completo: ");
            setNome(scanner.nextLine());
        } while (getNome().length() < 6 || getNome().length() > 100);

        do {
            System.out.print("Idade: ");
            setIdade(scanner.nextInt());
            scanner.nextLine();
        } while (getIdade() <= 0 || getIdade() >= 100);

        do {
            System.out.print("CPF (Apenas os 11 números): ");
            setCpf(scanner.nextLine());
        } while (getCpf().length() != 11);

        do {
            System.out.print("Salário mensal: ");
            setSalarioMensal(scanner.nextDouble());
        } while (getSalarioMensal() <= 0);
    }

    public void alugar() {

    }

}