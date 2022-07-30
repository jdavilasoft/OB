package ejerciciosTema3;

/*
Primera parte:
Crear una función con tres parámetros que sean números que se suman entre sí.
Llamar a la función en el main y darle valores.
*/

class ParteUno {
    public static void main(String[] args) {
        int suma = 0;
        suma = sumaNumeros(10, 20, 30);
        System.out.println("La suma de tres numeros es: " + suma);
    }
    
    private void sumaNumeros(int x, int y, int z) {
        return x + y + z;
    }
}
