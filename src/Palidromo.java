import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Palidromo {

    static SortedSet<String> ss = new TreeSet<String>();
    static ArrayList<String> palavra = new ArrayList<String>();
    public static String auxiliar;

    public static void converte(String frase) {
        String aux = "";
        char[] novo = new char[frase.length()];
        palavra.add(frase);
        ss.add(frase);

        // ss.add(frase);
        int cont = 0;
        while (palavra.size() < frase.length()) {
            for (int i = 0; i < frase.length(); i++) {
                novo[i] = palavra.get(cont).charAt(i);
            }
            aux += String.valueOf(novo[frase.length() - 1]);

            for (int j = 0; j < frase.length() - 1; j++) {
                aux += String.valueOf(novo[j]);
            }
            palavra.add(aux);
            ss.add(aux);
            cont ++;
            aux = "";

            // System.out.print(palavra);
        }

    }

  /*  public static void adcArray(String frase){
        palavra.add(frase);
        String palav = converte(frase);
        palavra.add(palav);
        }
        // System.out.print(ss);


    }*/


    public void imprime(String frase){


        converte(frase);
        System.out.print(ss.first()+"\t"+ss.last());
        System.out.print("\n"+palavra);

    }
    public static void main(String [] args) {

        String use = "banana";

        Palidromo palidromo = new Palidromo();
        palidromo.imprime(use);


       /* System.out.print("\n"+palidromo.converte(use)+"\n");
        String aux = palidromo.converte(use);
        System.out.print(palidromo.converte(aux)+"\n");
        String aux1 = palidromo.converte(aux);
        System.out.print(palidromo.converte(aux1)+"\n");
        String aux2 = palidromo.converte(aux1);
        System.out.print(palidromo.converte(aux2)+"\n");
        String aux3 = palidromo.converte(aux2);
        System.out.print(palidromo.converte(aux3)+"\n");
        String aux4 = palidromo.converte(aux3);
        System.out.print(palidromo.converte(aux4));
        //Palidromo
        //  palidromo.inverte(use);
*/
    }

}
