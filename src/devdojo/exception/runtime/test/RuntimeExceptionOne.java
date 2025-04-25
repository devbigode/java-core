package devdojo.exception.runtime.test;

import java.util.Scanner;

public class RuntimeExceptionOne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /* Unchecked Exceptions */

        /* ArrayIndexOutOfBoundsException */
        System.out.print("Digite um número entre 0 e 9: ");
        int x = input.nextInt();
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        try{
            System.out.println(ints[x]);
        } catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace(); /* Captura o erro, imprime no terminal e continua a execução do código */
            /* throw new ArrayIndexOutOfBoundsException("Índice inexistente"); > Lança o erro e trava a execução do programa */
        }

        /* NullPointerException */
        Object obj = null;
        System.out.println(obj.getClass());
    }
}
