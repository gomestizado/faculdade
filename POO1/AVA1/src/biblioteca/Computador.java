package biblioteca;

import java.util.Scanner;

public class Computador {

    private String processador, placaMae;
    private int memoria, ssd, fonte;

    //CONSTRUTOR
    public Computador(String processador, String placaMae, int memoria, int ssd, int fonte) {
        this.processador = processador;
        this.placaMae = placaMae;
        this.memoria = memoria;
        this.ssd = ssd;
        this.fonte = fonte;
    }

    //CONTRUTOR DEFAULT
    public Computador() {

    }

    //GETTERS E SETTERS
    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(String placaMae) {
        this.placaMae = placaMae;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getFonte() {
        return fonte;
    }

    public void setFonte(int fonte) {
        this.fonte = fonte;
    }

//EXIBIR INFORMAÇÕES
    public void imprimir() {
        System.out.println("--------------------------");
        System.out.println("Processador: " + getProcessador());
        System.out.println("Placa-mae: " + getPlacaMae());
        System.out.println("Memoria: " + getMemoria());
        System.out.println("SSD: " + getSsd());
        System.out.println("Fonte: " + getFonte());
        System.out.println("");

    }

//ENTRADA DE DADOS
    public void configurar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        System.out.println("----- Monte seu PC -----");
        System.out.println("----- Computador -----");        
        System.out.println("Escolha seu processador:");
        System.out.println(" i3 | i5 | i7 | i9 ");
        this.processador = sc.nextLine();
        
        System.out.println("Escolha sua Placa-mae:");
        System.out.println(" Asus | Gigabyte | ASRock ");
        this.placaMae = sc.nextLine();
        
        System.out.println("Escolha a quantidade de memoria:");
        System.out.println(" 4 gb | 8 gb | 16 gb | 32 gb");
        this.memoria = sc.nextInt();
        
        System.out.println("Escolha o tamanho do SSD:");
        System.out.println(" 250 gb | 500 gb | 1000 gb ");
        this.ssd = sc.nextInt();
        
        System.out.println("Escolha a potencia da fonte:");
        System.out.println(" 400 W | 550 W | 700 W ");
        this.fonte = sc.nextInt();

    }

}