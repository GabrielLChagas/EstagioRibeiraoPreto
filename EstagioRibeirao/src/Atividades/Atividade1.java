package Atividades;

import java.util.ArrayList;
import java.util.Scanner;

public class Atividade1 {

    Scanner numero = new Scanner(System.in);

    ArrayList fibonacci = new ArrayList<>();

    int numEscolhido;

    public int selecionaNumero(){
        System.out.println("\nInsira o número escolhido: ");
        numEscolhido = numero.nextInt();
        return numEscolhido;
    }

    public void calcular(){
        Integer eSoma = -1;
        Integer e = 1;
        do {int eA = e;
            e += eSoma;
            fibonacci.add(e);
            eSoma = eA;
        } while (fibonacci.size() < 10);

        System.out.println(fibonacci);
        if (fibonacci.contains(numEscolhido)){
            System.out.println("O valor " + numEscolhido + " é um valor de Fibonacci.\n");
        } else {System.out.println("O valor " + numEscolhido + " não é um valor de Fibonacci.\n");
        }
    }

    @Override
    public String toString() {
        return "{" +
                "fibonacci=" + fibonacci +
                '}';
    }
}
