import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Sargento {


    public static void comando(int num, String ordem) {


        char direcao;
        String ori = new String("NSLO");
        char[] orientacao = new char[ori.length()];
        char[] comando = new char[ordem.length()];

        for(int i = 0; i < ori.length(); i++) {
            orientacao[i] = ori.charAt(i);
        }
        for(int i = 0; i < ordem.length(); i++) {
            comando[i] = ordem.charAt(i);
        }
        //String ori = new String "NSLO"
        int cont = 0;
        int atual = 0;

                if(num == 1){
                    if( String.valueOf(comando[cont]).equalsIgnoreCase("D")){
                        atual = 2;
                    }
                    if(String.valueOf(comando[cont]).equalsIgnoreCase("E")){
                        atual = 3;
                    }

                }
                if(num>1){
                    while (cont < num  ) {
                    if( String.valueOf(comando[cont]).equalsIgnoreCase("D") ) {
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("N")) {
                            atual = 2;
                            cont ++;
                            continue;
                        }
                        if(String.valueOf(orientacao[atual]).equalsIgnoreCase("S") ) {
                            atual = 3;
                            cont ++;
                            continue;
                        }
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("L")) {
                            atual = 1;
                            cont ++;
                            continue;
                        }
                        if(String.valueOf(orientacao[atual]).equalsIgnoreCase("O")){
                            atual = 0;
                            cont ++;
                            continue;
                        }
                    }
                    if (String.valueOf(comando[cont]).equalsIgnoreCase("E")   ) {
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("N")) {
                            atual = 3;
                            cont++;
                            continue;

                        }
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("S")) {
                            atual = 2;
                            cont++;
                            continue;


                        }
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("L")) {
                            atual = 0;
                            cont++;
                            continue;
                        }
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("O")) {
                            atual = 1;
                            cont++;
                            continue;
                        }
                    }
                }
            }

        System.out.print(orientacao[atual]);

    }

    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        boolean contador = true;

        while(contador == true){
            int aux = ler.nextInt();
            if(aux == 0){
                contador = false;
            }
            if(aux != 0){
                String ordem = ler.next();
                comando(aux,ordem);
            }
        }


    }

}





