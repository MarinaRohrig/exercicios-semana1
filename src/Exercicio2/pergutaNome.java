package Exercicio2;

import java.util.Scanner;

// Programa que vai perguntar o nome do usuario e informar a quantidade de letras que tem no nome dele
// Autor: Marina Larissa Carpes R�hrig

public class pergutaNome {
    public static void main(String[] args) {
        // Declara e inicia vari�vel para pegar informa��o digitada pelo usu�rio
        Scanner scanner = new Scanner(System.in);
        // Pega as informa��es e usa .lenght para verificar o espa�o 0 da string, a primeira letra
        System.out.println("Ol�! Informe o seu nome, por gentileza: ");
        String nome = scanner.nextLine();
        int quantidadeLetras = nome.length();
        System.out.printf("Ol�,%s, tudo bem com voc�?%nO seu nome possu� %d letras contabilizando os espa�os em branco. %n",nome,quantidadeLetras);
        int quantidadeLetrasSemEspaco = nome.replace(" ", "").length(); // tira os espa�os, se houverem
        System.out.printf("E possu� %d letras sem contar os espa�os em branco. %n",quantidadeLetrasSemEspaco);
    }
}
