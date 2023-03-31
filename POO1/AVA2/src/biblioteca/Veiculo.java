package biblioteca;

import java.util.Scanner;

public class Veiculo {

    protected int capacidadeTanque, numeroPassageiros;
    protected double preco;

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Veiculo() {

    }

    public Veiculo(int capacidadeTanque, int numeroPassageiros, double preco) {
        this.capacidadeTanque = capacidadeTanque;
        this.numeroPassageiros = numeroPassageiros;
        this.preco = preco;
    }

    public void imprimir() {
        System.out.println("------------------------- -----");
        System.out.println("Capacidade do tanque....: " + capacidadeTanque);
        System.out.println("Numero de passageiros...: " + numeroPassageiros);
        System.out.println("Preco...................: " + preco);
    }

    public void entrada() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a capacidade do tanque....: ");
        this.capacidadeTanque = sc.nextInt();
        System.out.print("Digite o numero de passageiros...: ");
        this.numeroPassageiros = sc.nextInt();
        System.out.print("Digite o preco...................: ");
        this.preco = sc.nextDouble();
    }
}
