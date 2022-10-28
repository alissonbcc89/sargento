import java.io.IOException;
import java.util.Scanner;

public class GravityBoy {


    //16 tamanho
    // 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 relevo teto
    // 0 0 0 0 0 0 0 0 0 0 0 0 0 0 1 1 relevo chao
    public int inicio(int n, int[] teto, int[] piso) {

        int gravidade = 0;
        public enum Setor {
            Piso,
            Teto;
        }
        //String[] piso = {"Inferior", "Superior"};
        //enum pis { Superior, Terreo; }
        Setor local = Setor.Piso;
        int p = 0;

            for (int i = 0; i < n; i++) {
                if (i == 0 && piso[i] == 0) {
                    local = Setor.Teto;
                    gravidade += teto[i];
                    break;
                }
                if(local.equals(Setor.Piso)){
                        if(i == 0){
                            gravidade
                        }
                    }

                }

            return gravidade;
    }

    public static void main(String[] args) throws IOException {

    }

}

