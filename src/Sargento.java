import java.util.Scanner;

public class Sargento {

    public static void main(String [] args) {

        Scanner ler = new Scanner(System.in);

        int contador = 0;

        System.out.println("Numero de comando:");
        int num = ler.nextInt();


        System.out.println("\nComandos:");
        String com = ler.next();
        System.out.print(com.toUpperCase());
        int tam = com.length();
        System.out.println("\nCapturei linha0");

        char[] comando = new char[num];
         // tamanho da string (qtde de caracteres)
        for (int i=0; i < tam; i++) {
            comando[i] = com.charAt(i);
        }
        System.out.println("Capturei linha");
        char direcao;
        String ori = new String("NSLO");
       char[] orientacao = new char[ori.length()];

        for (int i=0; i< ori.length(); i++) {
            orientacao[i] = ori.charAt(i);
        }


        String atual = null;
        for(int i = 0; i < num -1 ; i++ ){
            String char1UpperCase = String.valueOf(comando[i]);

            if (i == 0 && char1UpperCase.equalsIgnoreCase( String.valueOf('D'))) {

                atual = String.valueOf(orientacao[2]);
                System.out.print("\n"+ atual);


            }
            if(i == 0 && char1UpperCase.equalsIgnoreCase( String.valueOf('E'))){

                atual = String.valueOf(orientacao[3]);
                System.out.print("\n"+atual);

            }

            if( i != 0 && char1UpperCase.equalsIgnoreCase(String.valueOf('D'))){
                if( atual.equalsIgnoreCase(String.valueOf("N"))){
                    atual =  String.valueOf(orientacao[2]);
                    System.out.print("\n"+atual);

                }
                if( atual.equalsIgnoreCase(String.valueOf('S'))){
                  atual =  String.valueOf(orientacao[3]);
                  System.out.print("\n"+atual);
                }
                if( atual.equalsIgnoreCase(String.valueOf('L'))){
                    atual =  String.valueOf(orientacao[1]);
                    System.out.print("\n"+atual);
                }
                if( atual.equalsIgnoreCase(String.valueOf('O'))){
                    atual =  String.valueOf(orientacao[0]);
                    System.out.print("\n"+atual);
                }

            }
            if( i != 0 && char1UpperCase.equalsIgnoreCase(String.valueOf( 'E'))){
                                            //nslo
                if( atual.equalsIgnoreCase(String.valueOf("N"))){
                    atual =  String.valueOf(orientacao[3]);
                    System.out.print("\n"+atual);


                }
                if( atual.equalsIgnoreCase(String.valueOf('S'))){
                    atual =  String.valueOf(orientacao[2]);
                    System.out.print("\n"+atual);

                }
                if( atual.equalsIgnoreCase(String.valueOf('L'))){
                    atual =  String.valueOf(orientacao[0]);
                    System.out.print("\n"+atual);

                }
                if( atual.equalsIgnoreCase(String.valueOf('O'))){
                    atual =  String.valueOf(orientacao[1]);
                    System.out.print("\n"+atual);

                }

            }


        }




    }
}





