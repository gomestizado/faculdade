package aplicacao;

import biblioteca.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppVeiculo {

    public static void main(String[] args) {

        Aviao aviao[] = new Aviao[10];
        Navio navio[] = new Navio[10];

        int i = 0;

        //INSTANCIANDO E INSERINDO VALORES DE AVIAO
        do {
            try {
                System.out.println("Aviao " + (i + 1));
                aviao[i] = new Aviao();
                aviao[i].entrada();
                i++;
            } catch (InputMismatchException ex1) {
                System.out.println("\nNao e permitido inserir letras, informe apenas numeros!");
                System.out.println("RECOMECANDO CADASTRO DO AVIAO " + (i + 1));
            } catch (ArrayIndexOutOfBoundsException ex2) {
                System.out.println("\nTentativa de acesso de uma posição inválida. recomeçando do zero.");
                System.out.println("RECOMECANDO DO ZERO!!!");
                i = 0;
            } finally {
            }
        } while (i < aviao.length);
        i = 0;

        //INSTANCIANDO E INSERINDO VALORES DE NAVIO
        do {
            try {
                System.out.println("Navio " + (i + 1));
                navio[i] = new Navio();
                navio[i].entrada();
                i++;
            } catch (InputMismatchException ex1) {
                System.out.println("\nNao e permitido inserir letras, informe apenas numeros!");
                System.out.println("RECOMECANDO CADASTRO DO NAVIO " + (i + 1));
            } catch (ArrayIndexOutOfBoundsException ex2) {
                System.out.println("\nTentativa de acesso de uma posição inválida. recomeçando do zero.");
                System.out.println("RECOMECANDO DO ZERO!!!");
                i = 0;
            } finally {
            }
        } while (i < navio.length);
        i = 0;

        //METODO REAJUSTAR PRECO - sub classe Aviao
        //Entrada de dados
        double reajuste = 0;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Reajuste do preco das passagens:  ");
                reajuste = sc.nextDouble();
                i++;
            } catch (InputMismatchException ex3) {
                System.out.println("Nao e permitido inserir letras.\nDIGITE NOVAMENTE!");
            }
        } while (i < 1);
        i = 0;

        //Aplicacao do metodo
        do {
            aviao[i].reajustarPreco(reajuste);
            i++;
        } while (i < aviao.length);
        System.out.println("\nOs valores das passagens foram reajustados em " + reajuste + "%\n");
        i = 0;

        //METODO PASSAGEIROS POR TRIPULANTES - sub classe Navio
        do {
            System.out.println("O Navio " + (i + 1) + " possui " + navio[i].passageirosPorTripulantes() + " passageiros por tripulante.");
            i++;
        } while (i < navio.length);
        System.out.println("");
        i = 0;

        //IMPRIMINDO AVIAO
        do {
            System.out.println("AVIAO " + (i + 1));
            aviao[i].imprimir();
            i++;
        } while (i < aviao.length);
        i = 0;

        //IMPRIMINDO NAVIO
        do {
            System.out.println("NAVIO " + (i + 1));
            navio[i].imprimir();
            i++;
        } while (i < navio.length);
    }
}
