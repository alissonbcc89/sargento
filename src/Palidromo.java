import java.util.ArrayList;
import java.util.SortedSet;
import java.util.TreeSet;

public class Palidromo {




    public void inverte(String frase){

        char[] caracter = new char[frase.length()];
        //char[] auxcaracter = new char[fr];
        String palidromo="";
        ArrayList<String> ordem = new ArrayList<>();
        SortedSet<String> ss =  new TreeSet<String>();


        for(int i = 0; i < frase.length();i++){
            caracter[i] = frase.charAt(i);
        }

        for(int i = 0; i < frase.length(); i ++){
            palidromo+= caracter[frase.length()-i-1];
            System.out.print("\n"+palidromo + "\t iteracao geral:"+i);

            if (i == 0) {
                for (int j = 0; j < frase.length() - 1; j++) {
                    char auxiliar;
                    //pq pula o r na segunda interacao?
                    palidromo += caracter[j];
                    System.out.print("\n" + palidromo + "\t iteracao local:" + j);

                }
                ss.add(palidromo);
                ordem.add(palidromo);
                palidromo="";

            }

           /* if(i>0){

            palidromo += caracter[frase.length()-i];
            palidor



                  ss.add(palidromo);
          }*/


          }



           System.out.print("\n\t Primeiro"+ss.first()+"\n");
        System.out.print("\n");
           System.out.print(palidromo);
           palidromo="";
        }

      //  String retorno1  = ss.first();
      //  String retorno2 = ss.last();

       // return "\n" + retorno1 +"\t"+ retorno2 +"\t"+ ss.size();





    public static void main(String [] args) {

            String use = "amor";

            Palidromo palidromo = new Palidromo();


          //  System.out.print(palidromo.inverte(use));

        //Palidromo

        palidromo.inverte(use);

    }

}
