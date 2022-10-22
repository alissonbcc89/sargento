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
                        System.out.println(atual + "\t Posicao:" + orientacao[atual]);
                        atual = 2;
                        System.out.println(atual + "\t Posicao:" + orientacao[atual]);
                        //break;
                    }
                    if(String.valueOf(comando[cont]).equalsIgnoreCase("E")){
                        System.out.println(atual + "\t Posicao:" + orientacao[atual]);
                        atual = 3;
                        System.out.println(atual + "\t Posicao:" + orientacao[atual]);
                       // break;
                    }
                    cont ++;
                }
                if(num>1){
                    while (cont < num  ) {
                        System.out.println("\t Iteracao:" + cont);
                    if( String.valueOf(comando[cont]).equalsIgnoreCase("D") ) {
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("N")) {
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            atual = 2;
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            cont ++;
                            continue;
                           // break;
                        }
                        if(String.valueOf(orientacao[atual]).equalsIgnoreCase("S") ) {
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            atual = 3;
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            cont ++;
                            continue;
                            //break;
                        }
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("L")) {
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            atual = 1;
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            cont ++;
                           // break;
                            continue;
                        }
                        if(String.valueOf(orientacao[atual]).equalsIgnoreCase("O")){
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            atual = 0;
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            cont ++;
                           // break;
                            continue;
                        }
                    }
                    if (String.valueOf(comando[cont]).equalsIgnoreCase("E")   ) {
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("N")) {
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            atual = 3;
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            cont++;
                          //  break;
                            continue;

                        }
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("S")) {
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            atual = 2;
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            cont++;
                          //  break;
                            continue;


                        }
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("L")) {
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            atual = 0;
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            cont++;
                         //  break;
                            continue;


                            //cont ++;
                        }
                        if (String.valueOf(orientacao[atual]).equalsIgnoreCase("O")) {
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            atual = 1;
                            System.out.println(atual + "\t Posicao:" + orientacao[atual] + "\tcontador:" + cont);
                            cont++;
                          //  break;
                            //cont ++;
                            continue;


                        }
                        //cont++;


                    }
                }

            }
        System.out.print(atual+"\n");
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





