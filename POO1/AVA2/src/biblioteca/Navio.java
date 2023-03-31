package biblioteca;

import java.util.Scanner;

public class Navio extends Veiculo {

    private String nome, dataLancamento;
    private int numeroTripulantes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public int getNumeroTripulantes() {
        return numeroTripulantes;
    }

    public void setNumeroTripulantes(int numeroTripulantes) {
        this.numeroTripulantes = numeroTripulantes;
    }

    public Navio() {

    }

    public Navio(String nome) {
        this.nome = nome;
    }

    public Navio(String nome, String dataLancamento) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
    }

    public Navio(String nome, String dataLancamento, int numeroTripulantes) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.numeroTripulantes = numeroTripulantes;
    }

    public Navio(int capacidadeTanque, int numeroPassageiros, double preco, String nome, String dataLancamento, int numeroTripulantes) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.numeroTripulantes = numeroTripulantes;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Nome....................: " + nome);
        System.out.println("Data do lancamento......: " + dataLancamento);
        System.out.println("Numero de tripulantes...: " + numeroTripulantes);
        System.out.println("");
    }

    @Override
    public void entrada() {
        Scanner sc = new Scanner(System.in);
        super.entrada();
        System.out.print("Digite o nome....................: ");
        nome = sc.nextLine();
        System.out.print("Digite a data do lancamento......: ");
        dataLancamento = sc.nextLine();
        System.out.print("Digite numero de tripulantes.....: ");
        numeroTripulantes = sc.nextInt();
        System.out.println("");
    }

    public float passageirosPorTripulantes() {
        return super.numeroPassageiros / numeroTripulantes;
    }
}
