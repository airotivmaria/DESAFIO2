package desafio.aluguel;

public class Usuario {
    private String nome;
    private int idade;
    private String cpf;
    private double salarioMensal;
    private int quantidadeDeUnidades;

    private String metragemTerreno;
    private String posicaoFrente;
    private String esquina;


    public String getEsquina() {
        return esquina;
    }

    public void setEsquina(String esquina) {
        this.esquina = esquina;

    }

    public String getPosicaoFrente() {
        return posicaoFrente;

    }

    public void setPosicaoFrente(String posicaoFrente) {
        this.posicaoFrente = posicaoFrente;

    }

    public String getMetragemTerreno() {
        return metragemTerreno;

    }

    public void setMetragemTerreno(String metragemTerreno) {
        this.metragemTerreno = metragemTerreno;

    }

    public double getSalarioMensal() {
        return salarioMensal;

    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;

    }

    public String getCpf() {
        return cpf;

    }

    public void setCpf(String cpf) {
        this.cpf = cpf;

    }

    public int getIdade() {
        return idade;

    }

    public void setIdade(int idade) {
        this.idade = idade;

    }

    public String getNome() {
        return nome;

    }

    public void setNome(String nome) {
        this.nome = nome;

    }

    public static void setQuantidadeDeUnidades(int quantidadeDeUnidades) {
        this.quantidadeDeUnidades = quantidadeDeUnidades;
    }

    public int getQuantidadeDeUnidades() {
        return quantidadeDeUnidades;

    }

}
