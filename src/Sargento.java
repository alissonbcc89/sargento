import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;


public class Sargento {

    static int atual = 1;
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
                System.out.println(cont + "primeira etapa do while\n" );

                if( String.valueOf(comando[cont]).equalsIgnoreCase("D")) {
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("N")) {
                        System.out.print(atual + "\n");
                        atual = 2;
                        //cont  ++;
                        System.out.print(atual + "\n");
                        System.out.print(cont + "\t" + orientacao[atual] + "\n");
                        break;
                    }
                    if(String.valueOf(orientacao[atual]).equalsIgnoreCase("S")) {
                        System.out.print(atual + "\n");
                        atual = 3;
                        //cont  ++;
                        System.out.print(atual + "\n");
                        System.out.print(cont + "\t" + orientacao[atual] + "\n");

                        break;

                    }
                    //solucionar aqui
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("L")) {
                        System.out.print(atual + "\n");
                        atual = 1;
                        //cont  ++;
                        System.out.print(atual + "\t" + orientacao[atual] + "\n");

                    }

                    if(String.valueOf(orientacao[atual]).equalsIgnoreCase("O")){
                        System.out.print(atual + "\n");
                        atual = 0;
                        //cont  ++;
                        System.out.print(atual + "\n");
                        System.out.print(cont + "\t" + orientacao[atual] + "\n");

                    }
                }
                if (String.valueOf(comando[cont]).equalsIgnoreCase("E")) {
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("N")) {
                        System.out.print(atual + "\n");
                        atual = 3;
                        //cont  ++;
                        System.out.print(atual + "\t" + orientacao[atual] + "\n");


                    }
                    if(String.valueOf(orientacao[atual]).equalsIgnoreCase("S")) {
                        System.out.print(atual + "\n");
                        atual = 2;
                        //cont ++;
                        System.out.print(atual + "\t" + orientacao[atual] + "\n");
                        //break;
                    }
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("L")) {
                        System.out.print(atual + "\n");
                        atual = 0;

                        System.out.print(atual + "\t" + orientacao[atual] + "\n");
                        //break;
                    }
                    if (String.valueOf(orientacao[atual]).equalsIgnoreCase("O")) {
                        System.out.print(atual + "\n");
                        atual = 1;

                        System.out.print(atual + "\t" + orientacao[atual] + "\n");
                        //break;
                    }

                }
                cont ++;
            }
        System.out.print(atual+"\n");
        System.out.print(orientacao[atual]);

    }




    public static void main(String[] args) throws IOException {




        Scanner ler = new Scanner(System.in);

        boolean contador = true;


        while(contador == true){
            int aux = ler.nextInt();
            String ordem = ler.next();
            if(aux != 0){
                comando(aux,ordem);
            }
            if(aux == 0){
                contador = false;
            }


        }








    }

}





