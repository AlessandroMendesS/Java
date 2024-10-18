package main;
import classes.Pessoa;

public class Aplicacao {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Alessandro", 16, "Rua Python é melhor", "99999-9999");

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println("Telefone: " + pessoa.getTelefone());
    }
}
