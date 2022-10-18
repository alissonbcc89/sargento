import java.io.IOException;
import java.util.Scanner;


public class Sargento {

    public static void comando(int num, String com) {
        char[] comando = new char[num];

        for (int i = 0; i < num; i++) {
            comando[i] = com.charAt(i);
        }

        char direcao;
        String ori = new String("NSLO");
        char[] orientacao = new char[ori.length()];

        for (int i = 0; i < ori.length(); i++) {
            orientacao[i] = ori.charAt(i);
        }


        String atual = null;
        for (int i = 0; i < num - 1; i++) {
            String char1UpperCase = String.valueOf(comando[i]);

            if (i == 0 && char1UpperCase.equalsIgnoreCase(String.valueOf('D'))) {

                atual = String.valueOf(orientacao[2]);


            }
            if (i == 0 && char1UpperCase.equalsIgnoreCase(String.valueOf('E'))) {

                atual = String.valueOf(orientacao[3]);


            }

            if (i != 0 && char1UpperCase.equalsIgnoreCase(String.valueOf('D'))) {
                if (atual.equalsIgnoreCase(String.valueOf("N"))) {
                    atual = String.valueOf(orientacao[2]);
                    System.out.print("\n" + atual);

                }
                if (atual.equalsIgnoreCase(String.valueOf('S'))) {
                    atual = String.valueOf(orientacao[3]);

                }
                if (atual.equalsIgnoreCase(String.valueOf('L'))) {
                    atual = String.valueOf(orientacao[1]);

                }
                if (atual.equalsIgnoreCase(String.valueOf('O'))) {
                    atual = String.valueOf(orientacao[0]);

                }

            }
            if (i != 0 && char1UpperCase.equalsIgnoreCase(String.valueOf('E'))) {
                //nslo
                if (atual.equalsIgnoreCase(String.valueOf("N"))) {
                    atual = String.valueOf(orientacao[3]);


                }
                if (atual.equalsIgnoreCase(String.valueOf('S'))) {
                    atual = String.valueOf(orientacao[2]);


                }
                if (atual.equalsIgnoreCase(String.valueOf('L'))) {
                    atual = String.valueOf(orientacao[0]);


                }
                if (atual.equalsIgnoreCase(String.valueOf('O'))) {
                    atual = String.valueOf(orientacao[1]);


                }

            }


        }
        System.out.print(atual);
    }


    public static void main(String[] args) throws IOException {


        Scanner ler = new Scanner(System.in);

        int contador = 0;

        int num = ler.nextInt();

        String com = ler.next();

        comando(num,com);


    }

}





