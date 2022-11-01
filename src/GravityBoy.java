import java.io.IOException;
import java.util.Scanner;

public class GravityBoy {

    enum Setor {
        Piso,
        Teto;
    }

    //16 tamanho
    // 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 relevo teto
    // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 relevo chao
    public int inicio(int n, int[] teto, int[] piso) {

        int gravidade = 0;

        //String[] piso = {"Inferior", "Superior"};
       // enum pis { Superior, Terreo; }
        Setor local = Setor.Piso;
        //int p = 0;

        for (int i = 0; i < n; i++) {
            if(i == 0) {
                if (piso[i] == 0) {
                    local = Setor.Teto;
                    gravidade = teto[i];
                    break;
                }
                if(piso[i]!= 0  ){
                    local = Setor.Piso;
                    gravidade = 1;
                }


            }
            if(i>0) {
                if (local.equals(Setor.Piso) && piso[i] == 0) {
                    local = Setor.Teto;
                    gravidade = teto[i - 1];
                    break;
                }
                if (local.equals(Setor.Teto) && teto[i] > gravidade) {
                    gravidade = piso[i];

                }
                if (local.equals(Setor.Teto) && teto[i] == 0) {
                    local = Setor.Piso;

                }
            }
        }
        return gravidade;
    }


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int tamanho  = sc.nextInt();

        int[] teto; = new int[tamanho];
        int[] piso = new int[tamanho];

        boolean valida = true;

        while(valida == true){

            int cont = 0;
            while(cont < tamanho){
                int valor = sc.nextInt();
                teto[cont] = valor;
                cont++;
            }
            cont = 0;
            while (cont<tamanho){
                int valor1 = sc.nextInt();
                piso[cont] = valor1;
                cont++;
            }




        }

        //5
        //
        //1 1 0 1 1
        //
        //1 2 2 2 1


        //16
        //
        int[] teto ={1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0};
        //
        int[] piso ={0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1};
       int n = 16;

        //int[] teto = {1,1,0,1,1};
        //int[] piso = {1,2,2,2,1};
       // int[] teto = {0,2,1,1,0};

        //int[] piso = {1,1,0,1,1};

        GravityBoy gravityBoy = new GravityBoy();

        System.out.print(gravityBoy.inicio(n,teto,piso));

    }
}




