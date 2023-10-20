package Cadastro;

public class Cadastro {

    private String NomeCompleto;
    private String email;
    private int idade;
    private double altura;

    public void setNomeCompleto(String nomeCompleto) {
        NomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Cadastro{" +
                "NomeCompleto='" + NomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", idade=" + idade +
                ", altura=" + altura +
                '}';
    }
}
