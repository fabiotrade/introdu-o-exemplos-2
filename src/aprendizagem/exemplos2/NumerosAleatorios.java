package aprendizagem.exemplos2;
/*Esse programa escolhe e le 20 números inteiros aleatórios,
armazena-os num vetor e ao final mostra os seus sucessores.
 */

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];



        for(int i = 0; i< numerosAleatorios.length; i ++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.print("\nOs números aleatórios são: ");
        for (int numero : numerosAleatorios){
            System.out.print(numero + " ");
        }

        System.out.print("\nOs antecessores dos números aleatórios são: " );
        for (int numero : numerosAleatorios){
            System.out.print((numero - 1) +" ");
        }

        System.out.print("\nOs sucessores dos números aleatórios são: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + " ");
        }
    }


}
