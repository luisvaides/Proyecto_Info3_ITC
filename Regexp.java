import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Esta es la clase principal donde debe tener su metodo main. 
// Para este proyecto tiene la libertad de ejecutar su programa como desee
// siempre que se cumplan los lineamientos de las instrucciones.
public class Regexp {

    // Implemente aqui su metodo main. Recuerde que debe recibir los argumentos en este orden
    // 1. en path con el archivo .rgx donde esta la informacion de la expresion regular
    // 2. El modo de ejecucion [-afd|-gld|-min|-eval]
    // 3. El nombre del archivo de salida donde escribiran el resultado (para la bandera -eval, este argumento no se toma en cuenta)
    public static void main(String[] args) throws Exception {

        // Verificamos que al menos se hayan pasado los dos primeros argumentos
        if (args.length < 2) {
            System.out.println("Uso incorrecto. Esperado: java Regexp pathExpresionRegular (-afd|-gld|-min|-eval) [archivoSalida]");
            return;
        }

        String pathExpresionRegular = args[0];
        String modoEjecucion = args[1];
        String pathArchivoSalida = args.length > 2 ? args[2] : null;

        // Leemos la expresion regular del archivo
        String expresionRegular = leerExpresionRegular(pathExpresionRegular);

        // Ejecutamos segun el modo de ejecucion
        switch (modoEjecucion) {
            case "-afd":
                generarAFD(expresionRegular, pathArchivoSalida);
                break;
            case "-gld":
                generarGLD(expresionRegular, pathArchivoSalida);
                break;
            case "-min":
                generarAFDMinimo(expresionRegular, pathArchivoSalida);
                break;
            case "-eval":
                evaluarExpresion(expresionRegular);
                break;
            default:
                System.out.println("Modo de ejecución no reconocido. Debe ser -afd, -gld, -min o -eval.");
                break;
        }
    }

    private static String leerExpresionRegular(String pathExpresionRegular)  {
        // Aqui debes implementar la lectura del archivo con la expresion regular.
        // Te recomiendo usar BufferedReader y FileReader.
        return "" ;
    }

    private static void generarAFD(String expresionRegular, String pathArchivoSalida)  {
        // Aqui debes implementar la generacion del AFD basado en la expresion regular.
        // Al final, escribes el AFD al archivo de salida usando FileWriter.
    }

    private static void generarGLD(String expresionRegular, String pathArchivoSalida)  {
        // Aqui debes implementar la generacion del GLD basado en la expresion regular.
        // Al final, escribes el GLD al archivo de salida usando FileWriter.
    }

    private static void generarAFDMinimo(String expresionRegular, String pathArchivoSalida)  {
        // Aqui debes implementar la generacion del AFD minimo basado en la expresion regular.
        // Al final, escribes el AFD minimo al archivo de salida usando FileWriter.
    }

    private static void evaluarExpresion(String expresionRegular) {
        // Aqui debes implementar la evaluacion de la expresion regular.
        // Lees cuerdas del usuario desde la consola y evalua si se pueden generar con la expresion regular.
    }
}
