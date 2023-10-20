package Desafio;

import java.io.*;

public class TesteArquivo {

    public static void leitura(String path ) throws IOException{
        BufferedReader buffRead = new BufferedReader(new FileReader(path));
        String linha = "";

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

