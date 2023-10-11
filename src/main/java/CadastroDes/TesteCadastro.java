package CadastroDes;

import java.util.Scanner;

public class TesteCadastro {

    public static void main(String[] args) {

        //		Scanner texto = new Scanner(System.in);
//
//		 String nomeCompleto;
//		 String email;
//		 int idade = 50;
//		 double altura;
//
//		System.out.println("Digite seu nome completo:");
//		nomeCompleto = texto.nextLine();
//
//		System.out.println("Digite seu email:");
//		email = texto.nextLine();
//
//		System.out.println("Digite seu idade:" );
//		idade = texto.nextInt();
//
//		System.out.println("Digite sua altura:");
//		altura = texto.nextDouble();
//
//		texto.close();
//

        Scanner texto = new Scanner(System.in);

        String nomeCompleto;
        String email;
        int idade;
        double altura;

        try {
            System.out.println("Digite seu nome completo:");
            nomeCompleto = texto.nextLine();

            System.out.println("Digite seu email:");
            email = texto.nextLine();

            System.out.println("Digite sua idade:");
            idade = texto.nextInt();

            System.out.println("Digite sua altura:");
            altura = texto.nextDouble();


            if (!email.contains("@")) {
                throw new IllegalArgumentException("Email format is not valid.");
            }

            System.out.println("Nome: " + nomeCompleto);
            System.out.println("Email: " + email);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);

        } catch (Exception e) {
            System.out.println("Erro na entrada de dados: " + e.getMessage());
        } finally {
            texto.close();
        }
    }

    }

