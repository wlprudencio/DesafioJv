package Desafio;

import Desafio.TesteArquivo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Nova\\Desktop\\Wallace - trabalhos\\teste\\formulario.txt";


        //Passo1
        TesteArquivo.leitura(path);

        //Passo2
        SalvarTeste.teste(path);


        //Passo3
        Scanner scanner = new Scanner(System.in);

            // Solicitar o nome do usuário
            System.out.print("Digite o seu nome: ");
            String nomeUsuario = scanner.nextLine().toUpperCase();

            // Respostas às quatro perguntas
            String[] respostas = new String[4];
            for (int i = 0; i < 4; i++) {
                System.out.print("Digite a " + (i + 1) + "ª resposta: ");
                respostas[i] = scanner.nextLine();
            }



            // Salvar as respostas em arquivos .txt
            for (int i = 0; i < 4; i++) {
                String nomeArquivo = (i + 1) + "-" + nomeUsuario + ".TXT";
                try (FileWriter writer = new FileWriter(nomeArquivo)) {
                    writer.write(respostas[i]);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            System.out.println("Respostas salvas com sucesso!");
        }


    }

