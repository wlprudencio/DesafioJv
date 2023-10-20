package Desafio;

import java.util.Scanner;

public class TesteUsuario {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        UsuarioDes usuario = new UsuarioDes(nome, email, idade, altura);


        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Email: " + usuario.getEmail());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Altura: " + usuario.getAltura());


    }

}

