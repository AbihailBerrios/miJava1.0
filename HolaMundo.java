public class HolaMundo {
    public static void main(String[] args){
        String nombre = "Estudiante";
        int a = 4;
        int b = 7;

        int promedio = (a + b) / 2;
        int suma = a + b;
        int multiplicacion = a * b; 
        int resta = a - b;
        int division = a / b;
        int modulo = a % b;

        System.out.println("Hola, " + nombre + "!");
        System.out.println();
        System.out.println("La suma de " + a + " + " +b+ "es:" + suma);
        System.out.println("La resta de " + a + " - " + b + " es: " + resta);
        System.out.println("La multiplicación de " + a + " * " + b + " es: " + multiplicacion);
        System.out.println("El módulo de " + a + " % " + b + " es: " + modulo);
        System.out.println("La división de " + a + " / " + b + " es: " + division);
        System.out.println("El promedio de " + a + " y " + b + " es: " + promedio);
    }
}
