/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafioescolademagia;

import java.util.Scanner;
import java.util.UUID;

public class DesafioEscolaDeMagia {

    public static void main(String[] args) {

        Scanner nome = new Scanner(System.in);
        Scanner idade = new Scanner(System.in);
        Scanner confirmarId = new Scanner(System.in);
        Scanner casas = new Scanner(System.in);
        Scanner especialidade = new Scanner(System.in);
        Scanner continuar = new Scanner(System.in);
        int contasCriadas = 1;

       
        do {
            String ID = UUID.randomUUID().toString();
            int pontos = 0;

            // casas
            int lufaLufa = 20;
            int sonserina = 10;
            int grifinoria = 15;
            int corvinal = 15;

            // especialidades
            int herbologia = 10;
            int pocoes = 15;
            int defesaContraArtesDasTrevas = 25;
            int transfiguracao = 20;
            int historiaDaMagia = 10;
            int feiticos = 5;


            System.out.println("Olá, seja bem-vindo(a)");
            System.out.print("Poderia me falar seu nome?: ");
            String nomeDeCadastro = nome.nextLine();
            System.out.print("E a sua idade?: ");
            int idadeDeCadastro = idade.nextInt();
            if (idadeDeCadastro < 30 || idadeDeCadastro > 120) {
                System.out.println("Professores(as) com menos de 30 ou mais de 120 não podem se qualificar");
                continue;
            } else {
                System.out.println("Muito bem!! Seu nome e idade foram registrados");
            }

            System.out.println("Agora coloque o código de inscrição que selecionamos: " + ID);
            String id = confirmarId.nextLine();

            if (id.equals(ID)) {
                System.out.println("Agora temos certeza que é você");
            } else {
                System.out.println("Este não é o código que enviamos");
                continue; 
            }


            System.out.println("Agora vamos escolher sua casa!!");
            System.out.println("Nós temos 4 casas, para qual você deseja entrar?");
            System.out.println("[1]Grifinória");
            System.out.println("[2]Sonserina");
            System.out.println("[3]Lufa-Lufa");
            System.out.println("[4]Corvinal");
            String escolhaCasas = casas.nextLine();
            switch (escolhaCasas) {
                case "1":
                    System.out.println("Você entrou para Grifinória, ganhou 20 pontos por sua escolha");
                    pontos += grifinoria;
                    break;
                case "2":
                    System.out.println("Você entrou para Sonserina, ganhou 10 pontos por sua escolha");
                    pontos += sonserina;
                    break;
                case "3":
                    System.out.println("Você entrou para Lufa-Lufa, ganhou 15 pontos por sua escolha");
                    pontos += lufaLufa;
                    break;
                case "4":
                    System.out.println("Você entrou para Corvinal, ganhou 15 pontos por sua escolha");
                    pontos += corvinal;
                    break;
                default:
                    System.out.println(escolhaCasas + " Não é uma casa válida");
                    continue;
            }


            System.out.println("Agora vamos às especialidades");
            System.out.println("Escolha a que você possui mais conforto:");
            System.out.println("[1]Herbologia");
            System.out.println("[2]Poções");
            System.out.println("[3]Defesa Contra Artes Das Trevas");
            System.out.println("[4]Transfiguração");
            System.out.println("[5]História Da Magia");
            System.out.println("[6]Feitiços");
            String escolhaEspecialidade = especialidade.nextLine();
            switch (escolhaEspecialidade) {
                case "1":
                    System.out.println("Você escolheu herbologia");
                    pontos += herbologia;
                    break;
                case "2":
                    System.out.println("Você escolheu poções");
                    pontos += pocoes;
                    break;
                case "3":
                    System.out.println("Você escolheu Defesa Contra Artes Das Trevas");
                    pontos += defesaContraArtesDasTrevas;
                    break;
                case "4":
                    System.out.println("Você escolheu Transfiguração");
                    pontos += transfiguracao;
                    break;
                case "5":
                    System.out.println("Você escolheu História da Magia");
                    pontos += historiaDaMagia;
                    break;
                case "6":
                    System.out.println("Feitiços");
                    pontos += feiticos;
                    break;
                default:
                    System.out.println(escolhaEspecialidade + " não é uma especialidade válida");
                    continue;
            }


            System.out.println("Seu cadastro foi concluído com SUCESSO!!");
            System.out.println("Seu nome é: " + nomeDeCadastro);
            System.out.println("Você possui " + idadeDeCadastro + " anos");
            System.out.println("Você escolheu " + escolhaCasas + " como sua casa");
            System.out.println("E a sua especialidade é: " + escolhaEspecialidade);
            System.out.println("Você acumulou " + pontos + " pontos");
            System.out.println("Obrigado pelo seu tempo, e uma ótima experiência");


            System.out.println("Deseja criar outro usuário? (s/n)");
            String resposta = continuar.nextLine();
            if (resposta.equals("n")) {
                break; 
            }
            else if(resposta.equals("s")){
                contasCriadas += 1;
            }

        } while (true);
        
        System.out.println("Você criou " + contasCriadas + " conta(s)");
        System.out.println("Obrigado por usar nosso sistema! Até mais!");
    }
}
