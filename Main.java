import java.util.Scanner;
import java.util.ArrayList;

import desafio.aluguel.Pessoa;
import desafio.aluguel.Residencia;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        String menuOpcao;
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Residencia> residencias = new ArrayList<>();

        //Primeira interação do Menu
        mostrarmenu();
        menuOpcao = scanner.nextLine();
        boolean cadastroInicialRealizado = false;
        if (!cadastroInicialRealizado){
            if(menuOpcao.equals("1")) {
                cadastrarPessoa(pessoas, scanner, pessoa1, menuOpcao);
                cadastroInicialRealizado = true;
            }
        }

        while (true) {            

            mostrarmenu();
            menuOpcao = scanner.nextLine();

            switch (menuOpcao) {
                case "2":
                    cadastrarResidencia(residencias, scanner, pessoa1);
                    break;
                case "3":
                    mostrarResidencia(residencias, scanner);
                    break;
                case "4":
                    System.out.println("Até a próxima.");
                    return;
            
                default:
                    System.out.println("Opção inválida.");
                    break;     
                }
            }
        }
    

    private static void mostrarmenu() {
        System.out.print("""
                ********************
                Aluguel de unidades

                1 - Cadastro inicial
                2 - Cadastrar residência
                3 - Alugar residência
                4 - Sair

                ********************
                """);
    }

    private static void cadastrarPessoa(ArrayList<Pessoa> pessoas, Scanner scanner, Pessoa pessoa1, String menuOpcao){
        pessoa1.Cadastro();
        System.out.println("\nUsuário cadastrado com sucesso.");
        pessoas.add(pessoa1);
    }

    private static void cadastrarResidencia(ArrayList<Residencia> residencias, Scanner scanner, Pessoa pessoa1){
        for (int i = 1; i <= 4; i++) {
            if (i == 4) {
                System.out.println("Última unidade que poderá ser cadastrada.");
            }

            Residencia residencia = new Residencia();
            residencia.cadastroResidencia();
            residencias.add(residencia);
            System.out.println(i + "ª residência cadastrada.");

            System.out.print("Deseja cadastrar outra residência? s/n  ");
            String escolha = scanner.nextLine().toLowerCase();
            if(escolha.equals("n")){
                System.out.println("Foram cadastradas " + i + " unidades.");
                return;
            } else if (!escolha.equals("s")){
                System.out.println("Opção inválida.");
            } 
            
        }
    }

    private static void mostrarResidencia(ArrayList<Residencia> residencias, Scanner scanner) {
        if(residencias.size() == 0){
            System.out.println("Para alugar é necessário cadastrar ao menos uma residência primeiro.");
        }
        System.out.println("Opçãos de residências disponíveis: ");
        for (Residencia residencia : residencias){
            System.out.println("\n" + residencia);
        }
        alugarResidencia(residencias, scanner);
        
        
    }

    private static void alugarResidencia(ArrayList<Residencia> residencias, Scanner scanner){
        System.out.println("Deseja alugar qual? (Diga 1, 2, 3, 4) ");
        String escolha = scanner.nextLine();

        try {
            int indice = Integer.parseInt(escolha) - 1; 
        if (indice >= 0 && indice < residencias.size()) {
            Residencia residenciaEscolhida = residencias.get(indice);
            System.out.println("Você escolheu alugar a residência: " + residenciaEscolhida);
            System.out.println("Parabéns pela escolha, você já alugou.");
        } else {
            System.out.println("Opção inválida. Por favor, digite um número entre 1 e " + residencias.size());
        }
        } catch (NumberFormatException e) {
            System.out.println("Opção inválida");
        }

    }
}

