package Atividades;

public class Atividade4 {
    public void calcular(){
        int[] aLista = {};
        for (int a = 1; a < 10; a += 2) {
            System.out.print(a + ", ");
        } System.out.println("\n");

        for (int b = 2; b < 130; b *= 2){
            System.out.print(b+", ");
        } System.out.println("\n");

        int impa = 1;
        for (int c = 0; c < 50; c += impa, impa += 2 ){
            System.out.print(c+", ");
        } System.out.println("\n");

        int dSoma = 12;
        for (int d = 4; d < 120; d += dSoma, dSoma += 8){
            System.out.print(d+", ");
        } System.out.println("\n");

        int eSoma = 1;
        int e = 0;
        do {int eA = e;
            e += eSoma;
            System.out.print(e+", ");
            eSoma = eA;
        } while (e < 13);
        System.out.println("\n");

        System.out.println("2 (Dois),10 (Dez), 12(doze), 16(Dezesseis), 17(Dezessete), 18(Dezoito), 19(Dezenove), 200(Duzentos)\n");
    }
}
