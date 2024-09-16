package Atividades;

import java.util.Scanner;

public class Atividade2 {

    Scanner entrada = new Scanner(System.in);
    String palavra = entrada.nextLine();

    public void buscar(){
        int i = palavra.indexOf("a");
        System.out.println(i);
    }
}
