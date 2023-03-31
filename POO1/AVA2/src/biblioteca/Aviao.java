package biblioteca;

import java.util.Scanner;

public class Aviao extends Veiculo {

    private String prefixo, dataRevisao;

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public String getDataRevisao() {
        return dataRevisao;
    }

    public void setDataRevisao(String dataRevisao) {
        this.dataRevisao = dataRevisao;
    }

    public Aviao() {

    }

    public Aviao(String prefixo, String dataRevisao) {
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    public Aviao(int capacidadeTanque, int numeroPassageiros, double preco, String prefixo, String dataRevisao) {
        super(capacidadeTanque, numeroPassageiros, preco);
        this.prefixo = prefixo;
        this.dataRevisao = dataRevisao;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Prefixo.................: " + prefixo);
        System.out.println("Data da revisao.........: " + dataRevisao);
        System.out.println("");
    }

    @Override
    public void entrada() {
        Scanner sc = new Scanner(System.in);
        super.entrada();
        System.out.print("Digite o prefixo.................: ");
        prefixo = sc.nextLine();
        System.out.print("Digite a data da revisao.........: ");
        dataRevisao = sc.nextLine();
        System.out.println("");
    }

    public void reajustarPreco(double percentual) {
        super.preco = super.preco + (super.preco * (percentual / 100));
    }
}
