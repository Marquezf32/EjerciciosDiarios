import java.util.ArrayList;

public class Anagrama {
    /*
     * Escribe una función que reciba dos palabras (String) y retorne
     * verdadero o falso (Bool) según sean o no anagramas.
     * - Un Anagrama consiste en formar una palabra reordenando TODAS
     *   las letras de otra palabra inicial.
     * - NO hace falta comprobar que ambas palabras existan.
     * - Dos palabras exactamente iguales no son anagrama.
     */
    public static void anagrama(String a, String b){
        //Creamos el Array List vacio
        ArrayList<Character> lista = new ArrayList<>();

        //Inicia el ciclo for con la palabra A

        for (int i = 0; i <a.length() ; i++) {
            //Agrega los caracteres de "A" a la lista.
            lista.add(a.charAt(i));
        }

        //inicializamos un contador en 0
        int contador= 0;

        //Ciclo for que recorra la lista y si los caracteres de palabra2 estan en la lista, aumenta en 1 el contador.
        for (int i = 0; i < b.length(); i++) {
            if (lista.contains(b.charAt(i))){
                contador++;
            }
        }

        //Al final si el contador es del mismo largo que la palabra 2, la palabra es analoga.
        int largo = b.length();
        //Si contador es distinto del largo "B" o las palabras son iguales. No es analoga
        if (largo != contador || a.equals(b)) {
            System.out.println("La palabra no es analoga");
        }else {
            //Sino La palabra es analaga.
            System.out.println("La palabra es analoga");
        }


    }

    public static void main(String[] args) {

        String palabra1 = "Hola";
        String palabra2 = "Hablando";
        String palabra3 = "Hola";

        anagrama(palabra1,palabra2);
        anagrama(palabra1,palabra1);
        anagrama(palabra2,palabra1);


    }

}
