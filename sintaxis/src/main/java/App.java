
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.*;
import java.util.Scanner;

public class App{

    public static void main( String[] args ) throws java.io.IOException
    {
        CharStream input = openFile();
        Scanner wait = new Scanner(System.in);
        tpiLexer tpiLexer = new tpiLexer(input);
        CommonTokenStream commonTokenStream = new CommonTokenStream(tpiLexer);
        tpiParser tpiParser = new tpiParser(commonTokenStream);
        tpiBaseListener tpiListener = new tpiBaseListener();
        ParseTree tree = tpiParser.start();
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(tpiListener, tree);
        wait.nextLine();
    }

    public static CharStream openFile() {
        System.out.println("Ingrese el nombre del archivo con la extension(TXT)");
        Scanner reader = new Scanner(System.in);
        String names = reader.nextLine();
        CharStream outpout = null;
        if (names.isEmpty()) {
            outpout = intro();
        } else {
            try {
                outpout = CharStreams.fromFileName(names);
            } catch (IOException e) {
                System.out.println("Error al  abrir el Archivo.");
            }
        }
        return outpout;
    }

    public static CharStream intro (){
        CharStream out = null;
        try {
            String ruta = "/ruta/filename.txt";
            PrintWriter writer = new PrintWriter("test.txt");
            Scanner reader = new Scanner(System.in);
            System.out.println("Ingrese el pseodocodigo");
            String contenido = "Not empty";
            while (! contenido.isEmpty() ){
                contenido = reader.nextLine();
                writer.println(contenido);
            }
            writer.close();
            out = CharStreams.fromFileName("test.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return out;
    }

}