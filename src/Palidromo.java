import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Palidromo {

    SortedSet<String> ss = new TreeSet<String>();
    ArrayList<String> palavra = new ArrayList<String>();
    public static String auxiliar;

    public String converte(String frase){
        String aux = "";
        char[] novo = new char[frase.length()];

       ss.add(frase);



        for (int i = 0; i < frase.length(); i++) {
            novo[i] = frase.charAt(i);
        }
            aux += String.valueOf(novo[frase.length()-1]);

        for(int j = 0; j<frase.length()-1;j++){
            aux += String.valueOf(novo[j]);
        }



        //System.out.print(aux);

        return aux;
    }


    public void imprime(String frase){
        //imprime(aux);
        for(int i = 0; i < frase.length()-1; i++){
            String aux = converte(frase);
            ss.add(aux);
            palavra.add(aux);
            String nome = converte(palavra.get(i));
            ss.add(nome);

        }

        System.out.print(ss.first()+"\t"+ss.last());

    }





        //public static void inverter(String frase, int n){

      //  }
    public static void main(String [] args) {

            String use = "amor";



            Palidromo palidromo = new Palidromo();

            palidromo.imprime(use);

          // System.out.print(palidromo.converte(use)+"\n");
         //   String aux = palidromo.converte(use);
     //   System.out.print(palidromo.converte(aux)+"\n");
       //     String aux1 = palidromo.converte(aux);
        //System.out.print(palidromo.converte(aux1)+"\n");
       //    String aux2 = palidromo.converte(aux1);
      //  System.out.print(palidromo.converte(aux2)+"\n");
           // String aux3 = palidromo.converte(aux2);
           // System.out.print(palidromo.converte(aux3)+"\n");



          //  System.out.print(palidromo.inverte(use));

        //Palidromo

      //  palidromo.inverte(use);

    }

}
