package Atividades;

import java.util.Scanner;

public class Atividade2 {

    Scanner entrada = new Scanner(System.in);
    String palavra = entrada.nextLine();

    public void buscar(){
        int total = 0;
        for (int i = 0; i < palavra.length(); i++){
            String casa = Character.toString(palavra.charAt(i));
            if (casa.equals("a")) total++;
        }

        if (total > 0){
            System.out.println("Tem "+ total + " de letras \"a\"'s nesta palavra\n");
        } else System.out.println("Não há letras \"a\"'s nesta palavra\n");
    }
}
