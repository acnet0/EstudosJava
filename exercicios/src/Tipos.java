import java.lang.module.FindException;
import java.util.Arrays;
import java.util.ArrayList;

public class Tipos {
    public static void main(String[] args) {
        //TiposPrimitivos
            /*
        byte => 8 bits => -128 a 127
        short => 16 bits => -32.768 a 32.767
        int => 32 bits => -2.147.483.648 a 2.147.483.647
        long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        float => 32 bits => precisão simples
        double => 64 bits => precisão dupla

        char => representar um unico caractere => 'a' //aspas simples
        String => representar palavras e frases => "abacate" //aspas duplas // classe

        boolean => logico => true ou false
            */
//        byte = 100;
//        short = 1000;
//        int = 10000;
//        long = 1000000;
//        float = 10.5f
//        double = 20.5;
//        char c = 'A';
          String str = "Neto";
//        boolean bool = true;


        /* Indice Arrays            0,1,2,3,4
        int[] colecaoDeInteiros = {1,2,3,4,5}; //quando ja declaramos os valores do array ja determinamos o seu tamanho
        int[] meusNumeros = new int[5];//aqui determinamos o seu tamanho e os valores serão preenchidos conforme o desenrolar do programa

        String[] nomesArr = new String[10];

        nomesArr[0] = "Duduzinha";
        nomesArr[3] = "Palmeiras";
        nomesArr[8] = "Sebastião";

        ArrayList<String> listaDinamica = new ArrayList<>();
        listaDinamica.add("Duduh");
        listaDinamica.add("Micheal");
        listaDinamica.add("Gabs");
        listaDinamica.add("Dani");
        listaDinamica.add("Ed");

        System.out.println(listaDinamica.get(0));

        listaDinamica.remove(1);
        listaDinamica.remove(2);
        */

        /*condicionais
        if(str.isBlank()) {
            System.out.println("Verdadeiro");
        } else if (str == "Fernanda") {
            System.out.println("Fernanda");
        }
        else {
            System.out.println("Falso");

        //Laços
        Com este laço vamos percorrer e exibir todos os nomes dos arrays
        for(int i = 0; //variavel
            i < listaDinamica.size(); //condicional enquanto i for menor que o tamanho da listaDinamica
            i++){ //atribuição, no caso incremento a ser realizado de 1 em 1 representado por i++
        */

        /* Tipos de for
        for(int i = 0; i < listaDinamica.size(); i++) { //for relacionado a um array de ListaDinamica
            System.out.println(listaDinamica.get(i));
        }
        for(int i = 0; i < meusNumeros.length; i++) { //for relacionado a um array
            System.out.println(meusNumeros[i]);
        }
        for(int i = 0; i < colecaoDeInteiros.length; i++) {
            System.out.println(colecaoDeInteiros[i]);
        }
        for(int i = 0; i < nomesArr.length; i++) {
            System.out.println(nomesArr[i]);
        }
        for(String nome : listaDinamica){ //outra forma de fazer o for, declarando o tipo da variavel que quremos : grupo que buscaremos tal condicao
            System.out.println(nome); //retorne a variavel
        }

         */
    //While
        int contador = 0;
        while(contador < 10) {
            System.out.println(contador + "- Estou no while");
            contador++;
        }
        if (contador >=10) {
            System.out.println(contador + "- Saí do while");
        }

    }
}

