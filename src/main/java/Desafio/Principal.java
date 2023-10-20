package Desafio;

import Desafio.TesteArquivo;

import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Nova\\Desktop\\Wallace - trabalhos\\teste\\formulario.txt";

        TesteArquivo.leitura(path);
        SalvarTeste.teste(path);


    }
}
