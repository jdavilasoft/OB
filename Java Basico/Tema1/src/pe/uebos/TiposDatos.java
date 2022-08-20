package pe.uebos;

public class TiposDatos {
    public static void main(String[] args) {

        // 1. NUMERICOS

        // 1.1 ENTEROS
        byte varByte = 5;
        System.out.println(varByte);
        short varShort = 10;
        System.out.println(varShort);
        int varInt = 30;
        System.out.println(varInt);
        long varLong = 100;
        System.out.println(varLong);
        long numTelefono = 666555444;
        System.out.println(numTelefono);

        // 1.2 DECIMALES
        float varFloat = 5.5f;
        System.out.println(varFloat);
        double varDouble1 = 10.5d;
        System.out.println(varDouble1);
        double varDouble2 = 49.99;
        System.out.println(varDouble2);

        // 2. BOOLEANO
        boolean varBolean1 = false;
        System.out.println(varBolean1);

        boolean varBolean2 = true;
        System.out.println(varBolean2);

        //  3. TEXTO
        char varChar = 'a';
        System.out.println(varChar);

        String varString = "Lorem ipsum dolor sit amet...";
        System.out.println(varString);
    }
}
