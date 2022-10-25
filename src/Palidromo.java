import java.util.ArrayList;
import java.util.Scanner;
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


        }

    }




    public static void imprime(String frase){


        converte(frase);
        System.out.print(ss.first()+"\t"+ss.last()+"\n");
       // System.out.print("\n"+palavra);
        ss.clear();
        palavra.clear();

    }
    public static void main(String [] args) {

       // String use = "eart";

       // Palidromo palidromo = new Palidromo();
        //palidromo.imprime(use);

        Scanner ler = new Scanner(System.in);
        boolean contador = true;

        int cont = 1;
        while(contador == true){
            String aux = ler.next();
            if(aux.equals("*")){
                contador = false;
            }
            else{
               System.out.printf("Caso %d:", cont);
               cont++;
               imprime(aux);
            }
        }



    }

}
