public class Main {
    public static void main(String[] args) {
        //Impresión en consola el retorno de la funcón pasando números por valor.
        System.out.println(suma(1,2,3));

        //Creación del objeto miCoche, llamando al método e imprimiendo la cantidad de puertas.
        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a+b+c;

    }

    public static class Coche{
        int puertas = 0;

        public void incrementarPuerta(){
            puertas+=1;
        }

    }
}