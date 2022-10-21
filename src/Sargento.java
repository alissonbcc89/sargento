import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Sargento {

    static int atual = 0;
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
            while (cont < num  ) {
                if( String.valueOf(comando[cont]).equalsIgnoreCase("D") && cont < num) {
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("N")) {
                        atual = 2;
                        break;
                    }
                    if(String.valueOf(orientacao[atual]).equalsIgnoreCase("S") ) {
                        atual = 3;
                        break;
                    }
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("L")) {
                        atual = 1;
                        break;
                    }
                    if(String.valueOf(orientacao[atual]).equalsIgnoreCase("O")){
                       atual = 0;
                       break;
                    }
                }
                if (String.valueOf(comando[cont]).equalsIgnoreCase("E")  && cont < num ){
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("N")) {
                        atual = 3;
                    }
                    if(String.valueOf(orientacao[atual]).equalsIgnoreCase("S")) {
                        atual = 2;
                    }
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("L")) {
                        atual = 0;
                    }
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("O")) {
                        atual = 1;
                    }
                }
                cont ++;
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





