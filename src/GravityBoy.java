import java.util.Scanner;

public class GravityBoy {

    Scanner sc = new Scanner(System.in);
    //16 tamanho
    // 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 relevo teto
    // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 relevo chao



    public void inicio(int n, int[] teto, int[] piso) {

        int gravidade = 0;

            for (int i = 0; i < n; i++){
                if( piso[i] == 0 ){
                    gravidade = teto[i];
                }
                if(piso[i] > 0){
                    gravidade += piso[i];
                }

            }
    }


}

