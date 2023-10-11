package Desafio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TesteArquivo {

    public static void leitura(String path ) throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";
        System.out.println("é");

        while (true) {
            if (linha != null) {
                System.out.println(linha);

            } else
                break;
            linha = buffRead.readLine();
        }
        buffRead.close();
    }
}

