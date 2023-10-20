package Desafio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SalvarTeste {
    public static void teste(String path) {
        String nome = "";
        String [] respostas = new String[4];

        try {
            String fileName = "1-" + nome.toUpperCase() + ".txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));

            for (int i = 0; i < respostas.length; i++) {
                writer.write((i + 1) + ". " + respostas[i]);
            }
                writer.newLine();

            writer.close();
            System.out.println("Respostas salvas em " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
