package desafio.aluguel;

import java.util.Scanner;

public class Residencia extends Usuario {

    //MÉTODO DE CADASTRO DE RESIDÊNCIA QUE É CHAMADO LÁ NA MAIN
    public void cadastroResidencia() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Metragem do terreno (LxC): ");
            setMetragemTerreno(scanner.nextLine());
        } while (getMetragemTerreno().length() < 0);

        do {
            System.out.print("Posição da frente [N] Norte [S] Sul [L] Leste [O] Oeste: ");
            setPosicaoFrente(scanner.nextLine().toUpperCase());
        } while (!(getPosicaoFrente().equals("N") || getPosicaoFrente().equals("S") || getPosicaoFrente().equals("L") || getPosicaoFrente().equals("O")));

        do {
            System.out.print("A unidade é de esquina? s/n  ");
            setEsquina(scanner.nextLine().toLowerCase());
        } while (!(getEsquina().equals("s") || getEsquina().equals("n")));
    }

    @Override
    public String toString(){
        return "Terreno de " + getMetragemTerreno() + ", posição da frente " + getPosicaoFrente() + ", esquina? " + getEsquina();
    }

}
