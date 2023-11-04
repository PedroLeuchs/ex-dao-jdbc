package application;

import java.util.Scanner;

import application.classes.minhasFuncoes;
import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.dao.ClienteDao;


public class Program extends minhasFuncoes {

	public static void main(String[] args) {
		SellerDao sellerDao = DaoFactory.createSellerDao();
		ClienteDao clienteDao = DaoFactory.createClienteDao();

		int opcao = 0;
		Scanner scanner = new Scanner(System.in); // Mova a criação do Scanner para fora do loop

		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1. Vendedor");
			System.out.println("2. Cliente");
			System.out.println("3. Proposta");
			System.out.println("4. Produto");
			System.out.println("5. User");
			System.out.println("0. Sair");
			System.out.print("Digite o número da operação desejada: ");


			if (scanner.hasNextInt()) {
				opcao = scanner.nextInt();
				scanner.nextLine();
				switch (opcao) {
					case 1:
						menuVendedor();
						break;
					case 2:
						menuCliente();
						break;
					case 3:
						menuProposta();
						break;
					case 4:
						menuProduto();
					case 5:
						menuUser();
					case 0:
						System.out.println("Saindo do programa.");
						break;
					default:
						System.out.println("Opção inválida. Tente novamente.");
						break;
				}
			} else {
				System.out.println("Opção inválida. Tente novamente.");
				scanner.nextLine(); // Consumir a entrada inválida
			}
		} while (opcao != 0);

		scanner.close(); // Feche o Scanner somente quando o programa terminar
	}

	private static void menuproduto() {
	}

	public static void menuVendedor() {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		do {

			System.out.println("Menu de Vendedor:");
			System.out.println("1. Cadastrar vendedor");
			System.out.println("2. Exibir todos vendedores");
			System.out.println("3. Exibir vendedor pelo id");
			System.out.println("4. Atualizar vendedor");
			System.out.println("5. Deletar vendedor");
			System.out.println("0. Voltar ao menu principal");
			System.out.print("Digite o número da operação desejada: ");

			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					cadastrarVendedor();
					break;
				case 2:
					exibirTodosVendedores();
					break;
				case 3:
					exibirVendedorPeloId();
					break;
				case 4:
					atualizarVendedor();
					break;
				case 5:
					deletarVendedor();
					break;
				case 0:
					System.out.println("Voltando ao menu principal.");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 0);
	}

	public static void menuCliente() {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		do {

			System.out.println("Menu de Cliente:");
			System.out.println("1. Cadastrar cliente");
			System.out.println("2. Exibir todos clientes");
			System.out.println("3. Exibir cliente pelo id");
			System.out.println("4. Atualizar cliente");
			System.out.println("5. Deletar cliente");
			System.out.println("0. Voltar ao menu principal");
			System.out.print("Digite o número da operação desejada: ");

			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					cadastrarCliente();
					break;
				case 2:
					exibirTodosCliente();
					break;
				case 3:
					exibirClientePeloId();
					break;
				case 4:
					atualizarCliente();
					break;
				case 5:
					deletarCliente();
					break;
				case 0:
					System.out.println("Voltando ao menu principal.");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);
	}

	public static void menuProposta() {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("Menu de Proposta:");
			System.out.println("1. Cadastrar proposta");
			System.out.println("2. Exibir todas propostas");
			System.out.println("3. Exibir proposta pelo id");
			System.out.println("4. Atualizar proposta");
			System.out.println("5. Deletar proposta");
			System.out.println("0. Voltar ao menu principal");
			System.out.print("Digite o número da operação desejada: ");

			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					cadastrarProposta();
					break;
				case 2:
					exibirTodasPropostas();
					break;
				case 3:
					exibirPropostaPeloId();
					break;
				case 4:
					atualizarProposta();
					break;
				case 5:
					deletarProposta();
					break;
				case 0:
					System.out.println("Voltando ao menu principal.");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao!=0);
	}

	public static void menuProduto() {
		Scanner scanner = new Scanner(System.in);

		int opcao = 0;
		do {
			System.out.println("Menu de Produto:");
			System.out.println("1. Cadastrar produto");
			System.out.println("2. Exibir todos produtos");
			System.out.println("3. Exibir produto pelo id");
			System.out.println("4. Deletar produto");
			System.out.println("0. Voltar ao menu principal");
			System.out.print("Digite o número da operação desejada: ");

			opcao = scanner.nextInt();

			switch (opcao) {
				case 1:
					cadastrarProduto();
					break;
				case 2:
					exibirTodosProdutos();
					break;
				case 3:
					exibirProdutoPeloId();
					break;
				case 4:
					deletarProduto();
					break;
				case 0:
					System.out.println("Voltando ao menu principal.");
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);
	}

	public static void menuUser() {
		Scanner scanner = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("Menu de Usuário:");
			System.out.println("1. Cadastrar usuário");
			System.out.println("2. Exibir todos usuários");
			System.out.println("3. Exibir usuário pelo id");
			System.out.println("4. Atualizar usuário");
			System.out.println("5. Deletar usuário");
			System.out.println("0. Voltar ao menu principal");
			System.out.print("Digite o número da operação desejada: ");
			opcao = scanner.nextInt();
			switch (opcao) {
				case 0:
					System.out.println("Voltando ao menu principal.");
					break;
				case 1:
					cadastrarUser();
					break;
				case 2:
					exibirTodosUsers();
					break;
				case 3:
					exibirUserPeloId();
					break;
				case 4:
					atualizarUser();
					break;
				case 5:
					deletarUser();
					break;
				default:
					System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);
	}

}


