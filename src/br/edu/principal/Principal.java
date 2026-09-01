package br.edu.principal;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Substituição dos vetores por coleções dinâmicas
        List<String> nomes = new ArrayList<>();
        List<String> celulares = new ArrayList<>();
        List<String> emails = new ArrayList<>();
        
        boolean continuar = true;
        
        System.out.println("==========================");
        System.out.println(" AGENDA DE CONTATOS ");
        System.out.println(" V.0.2.0 ");
        System.out.println("==========================");
        
        while (continuar) {
            System.out.println();
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contato");
            System.out.println("3 - Procurar contato");
            System.out.println("4 - Excluir contato");
            System.out.println("5 - Sair");
            System.out.println();
            System.out.print("Escolha uma opção: ");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcao) {
                case 1:
                    System.out.println("\n--- ADICIONAR CONTATO ---");
                    System.out.print("Nome: ");
                    nomes.add(scanner.nextLine());
                    System.out.print("Celular: ");
                    celulares.add(scanner.nextLine());
                    System.out.print("E-mail: ");
                    emails.add(scanner.nextLine());
                    
                    System.out.println("Contato salvo com sucesso!");
                    break;
                    
                case 2:
                    System.out.println("\n--- LISTAR CONTATOS ---");
                    if (nomes.size() == 0) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println("\nContato " + (i + 1));
                            System.out.println("Nome: " + nomes.get(i));
                            System.out.println("Celular: " + celulares.get(i));
                            System.out.println("E-mail: " + emails.get(i));
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("\n--- PROCURAR CONTATO ---");
                    if (nomes.size() == 0) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.print("Digite o nome que deseja procurar: ");
                        String nomeBusca = scanner.nextLine();
                        boolean encontrado = false;
                        
                        for (int i = 0; i < nomes.size(); i++) {
                            if (nomes.get(i).equalsIgnoreCase(nomeBusca)) {
                                System.out.println("Contato encontrado!");
                                System.out.println("Nome: " + nomes.get(i));
                                System.out.println("Celular: " + celulares.get(i));
                                System.out.println("E-mail: " + emails.get(i));
                                encontrado = true;
                            }
                        }
                        
                        if (!encontrado) {
                            System.out.println("Contato não encontrado.");
                        }
                    }
                    break;
                    
                case 4:
                    System.out.println("\n--- EXCLUIR CONTATO ---");
                    if (nomes.size() == 0) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.print("Digite o nome do contato que deseja excluir: ");
                        String nomeExcluir = scanner.nextLine();
                        int indiceExcluir = -1;
                        
                        for (int i = 0; i < nomes.size(); i++) {
                            if (nomes.get(i).equalsIgnoreCase(nomeExcluir)) {
                                indiceExcluir = i;
                                break;
                            }
                        }
                        
                        if (indiceExcluir == -1) {
                            System.out.println("Contato não encontrado.");
                        } else {
                            nomes.remove(indiceExcluir);
                            celulares.remove(indiceExcluir);
                            emails.remove(indiceExcluir);
                            
                            System.out.println("Contato excluído com sucesso!");
                        }
                    }
                    break;
                    
                case 5:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}