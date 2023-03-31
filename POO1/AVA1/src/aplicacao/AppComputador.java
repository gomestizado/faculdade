package aplicacao;

import biblioteca.*;
import java.util.Scanner;

public class AppComputador {

    public static void main(String[] args) {

        String pro, plm;
        int mem, hd, fon;

        //INSTANCIANDO OBJETO 1
        Computador pc1 = new Computador();
        pc1.configurar();

        //INSTANCIANDO OBJETO 2
        Computador pc2 = new Computador();
        pc2.configurar();

        //INSTANCIANDO OBJETO 3 
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("----- Monte seu PC -----");
        System.out.println("Escolha seu processador:");
        System.out.println(" i3 | i5 | i7 | i9 ");
        pro = sc.nextLine();

        System.out.println("Escolha sua Placa-mae:");
        System.out.println(" Asus | Gigabyte | ASRock ");
        plm = sc.nextLine();

        System.out.println("Escolha a quantidade de memória: em gb");
        System.out.println(" 4 | 8 | 16 | 32 ");
        mem = sc.nextInt();

        System.out.println("Escolha o tamanho do SSD: em gb");
        System.out.println(" 250 | 500 | 1000 ");
        hd = sc.nextInt();

        System.out.println("Escolha a potencia da fonte: em watts");
        System.out.println(" 400 | 550 | 700 ");
        fon = sc.nextInt();

        Computador pc3 = new Computador(pro, plm, mem, hd, fon);

        //INSTANCIANDO OBJETO 4
        sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("----- Monte seu PC -----");
        System.out.println("Escolha seu processador:");
        System.out.println(" i3 | i5 | i7 | i9 ");
        pro = sc.nextLine();

        System.out.println("Escolha sua Placa-mae:");
        System.out.println(" Asus | Gigabyte | ASRock ");
        plm = sc.nextLine();

        System.out.println("Escolha a quantidade de memoria: em gb");
        System.out.println(" 4 | 8 | 16 | 32 ");
        mem = sc.nextInt();

        System.out.println("Escolha o tamanho do SSD: em gb");
        System.out.println(" 250 | 500 | 1000 ");
        hd = sc.nextInt();

        System.out.println("Escolha a potencia da fonte: em watts");
        System.out.println(" 400 | 550 | 700 ");
        fon = sc.nextInt();

        Computador pc4 = new Computador(pro, plm, mem, hd, fon);

        //IMPRIMINDO RESULTADOS
        pc1.imprimir();
        pc2.imprimir();
        pc3.imprimir();
        pc4.imprimir();

    }

}
