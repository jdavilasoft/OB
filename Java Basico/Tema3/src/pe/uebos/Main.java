package pe.uebos;

public class Main {

    public static void main(String[] args) {

        String cadena="";
        String[] nombre = {"hola", "HOLA", "Hola", "hOLA", "hOlA", "HoLa"};

        for (String item: nombre)
            cadena += item + " ";
          
        System.out.println(cadena);

    }
}
