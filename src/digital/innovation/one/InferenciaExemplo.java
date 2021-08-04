package digital.innovation.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo {
    public static void main(String[] args) {
//        printarNomeCompleto("Anizair", "Lopes");
        printarSoma(4,3, 5);
       //  connectAndPrintUrlJavaOracle();
    }

    private static void connectAndPrintUrlJavaOracle() {
        try {
            var url = new URL("https://docs.oracle.com/javase/10/language/");
            var urlConnection = url.openConnection();
            var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printarNomeCompleto(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s", nome, sobrenome);
        System.out.println(nomeCompleto);

    }
    public static void printarSoma(int... numeros) {
        int soma;
        if(numeros.length > 0) {
            soma = 0;
            for (var numero: numeros ) {
                soma+=numero;
            }
            System.out.println("A soma é ::: " + soma);
        }
    }

}
