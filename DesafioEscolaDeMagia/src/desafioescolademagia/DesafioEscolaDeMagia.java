/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafioescolademagia;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.UUID;
/**
 *
 * @author User
 */
public class DesafioEscolaDeMagia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner nome = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);
        Scanner confirmarId = new Scanner(System.in);
        Scanner casas = new Scanner(System.in);
        Scanner especialidade = new Scanner(System.in);
        
        String ID = UUID.randomUUID().toString();
        int pontos = 0;
        
        //casas
        int lufaLufa = 20;
        int sonserina = 10;
        int grifinoria = 15;
        int corvinal = 15;
        
        //especialidades
        int herbologia = 10;
        int pocoes = 15;
        int defesaContraArtesDasTrevas = 25;
        int transfiguracao = 20;
        int historiaDaMagia = 10;
        int feiticos = 5;
        
        System.out.println("Olá, seja bem-vindo(a)");
        System.out.println("Poderia me falar seu nome?: ");
        String nomeDeCadastro = nome.nextLine();
        System.out.println("E a sua idade?: ");
        int idadeDeCadastro = idade.nextInt();
        if (idadeDeCadastro < 30 || idadeDeCadastro > 120)
        {
            System.out.println("Professores(as) com menos de 30 ou mais de 120 não podem se qualificar");
            return;
        }
        else
        {
            System.out.println("Muito bem!! Seu nome e idade foram registrados");
        }
        System.out.println("Agora coloque o código de inscrição que selecionamos: " + ID);
        String id = confirmarId.nextLine();
        if(id.equals(ID))
        {
            System.out.println("Agora temos certeza que é você");
        }
        else
        {
            System.out.println("Este não é o código que enviamos");
            return;
        }
        System.out.println("Agora vamos escolher sua casa!!");
        System.out.println("Nós temos 4 casas, para qual você deseja entrar?");
        System.out.println("[1]Grifinória");
        System.out.println("[2]Sonserina");
        System.out.println("[3]Lufa-Lufa");
        System.out.println("[4]Corvinal");
        String escolhaCasas = casas.nextLine();
        if(escolhaCasas.equals("1"))
        {
            System.out.println("Você entrou para Grifinória, ganhou 20 pontos por sua escolha");
            pontos += grifinoria;
        }
        else if(escolhaCasas.equals("2"))
        {
            System.out.println("Você entrou para Sonserina, ganhou 10 pontos por sua escolha");
            pontos += sonserina;
        }
        else if(escolhaCasas.equals("3"))
        {
            System.out.println("Você estrou para Lufa-Lufa, ganhou 15 pontos por sua escolha");
            pontos += lufaLufa;
        }
        else if(escolhaCasas.equals("4"))
        {
            System.out.println("Você entrou para Corvinal, ganhou 15 pontos por sua escolha");
            pontos += corvinal;
        }
        else
        {
            System.out.println(escolhaCasas + " Não é uma casa válida");
            return;
        }
        System.out.println("Agora vamos ás especialidades");
        System.out.println("Escolha a que você possui mais conforto:");
        System.out.println("[1]Herbologia");
        System.out.println("[2]Poções");
        System.out.println("[3]Defesa Contra Artes Das Trevas");
        System.out.println("[4]Transfiguracao");
        System.out.println("[5]Historia Da Magia");
        System.out.println("[6]Feitiços");
        String escolhaEspecialidade = especialidade.nextLine();
        if (escolhaEspecialidade.equals("1"))
        {
            System.out.println("Você escolheu herbologia");
            pontos += herbologia;
        }
        else if (escolhaEspecialidade.equals("2"))
        {
            System.out.println("Você escolheu poções");
            pontos += pocoes;
        }
        else if (escolhaEspecialidade.equals("3"))
        {
            System.out.println("Você escolheu Defesa Contra Artes Das Trevas");
            pontos += defesaContraArtesDasTrevas;
        }
        else if (escolhaEspecialidade.equals("4"))
        {
            System.out.println("Você escolheu Transfiguração");
            pontos += transfiguracao;
        }
        else if (escolhaEspecialidade.equals("5"))
        {
            System.out.println("Você escolheu História da Magia");
            pontos += historiaDaMagia;
        }
        else if (escolhaEspecialidade.equals("6"))
        {
            System.out.println("Feitiços");
            pontos += feiticos;
        }
        else
        {
            System.out.println(escolhaEspecialidade + " não é uma especialidade válida");
            return;
        }
        System.out.println("Seu cadastro foi concluído com SUCESSO!!");
        System.out.println("Seu nome é: " + nomeDeCadastro);
        System.out.println("Você possui " + idadeDeCadastro + " anos");
        System.out.println("Você escolheu " + escolhaCasas + " como sua casa");
        System.out.println("E a sua especialidade é: " + escolhaEspecialidade);
        System.out.println("Você acumulou " + pontos + " pontos");
        System.out.println("Obrigado pelo seu tempo, e uma ótima experiência");
        
    }
    
}
