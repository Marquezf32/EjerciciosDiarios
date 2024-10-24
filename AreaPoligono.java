public class AreaPoligono {
    /*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
  */
    public static void areaPoligono(double perimtro, double apotema){
        //Declaramos un metodo Area que recibe los parametros y realiza el calculo.
        double area = (perimtro * apotema) * 0.5;
        System.out.println(area);
    }

    public static void main(String[] args) {

        areaPoligono(15,10);

    }
}
