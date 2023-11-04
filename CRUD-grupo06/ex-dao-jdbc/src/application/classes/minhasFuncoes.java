package application.classes;
import model.dao.*;

import model.entities.Cliente;
import model.entities.Produto;
import model.entities.Proposta;
import model.entities.Vendedor;
import model.entities.User;

import java.util.List;
import java.util.Scanner;

public class minhasFuncoes {
    private SellerDao sellerDao;

    public static void cadastrarVendedor() {
        Scanner scr = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Digite o nome do Vendedor: ");
        String name = scr.nextLine();

        System.out.println("Digite o email do Vendedor: ");
        String email = scr.nextLine();

        System.out.println("Digite o salário do Vendedor: ");
        Double baseSalary = scr.nextDouble();

        Vendedor newVendedor = new Vendedor(null, name, email, baseSalary);
        newVendedor.setId(sellerDao.insert(newVendedor));
        System.out.println("Inserido! Novo ID = " + newVendedor.getId());


    }


    public static void exibirTodosVendedores() {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        List<Vendedor> list = sellerDao.findAll();
        for (Vendedor obj : list) {
            System.out.println(obj);
        }

        // Implemente a lógica para exibir todos os vendedores aqui
    }

    public static void exibirVendedorPeloId() {
        Scanner scr = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("digite o id do vendedor");
        Vendedor vendedor = sellerDao.findById(scr.nextInt());
        System.out.println(vendedor);

    }

    public static void atualizarVendedor() {
        Scanner scr = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Digite o ID do vendedor: ");
        int vendedorId = scr.nextInt();
        scr.nextLine(); // Consuma a quebra de linha

        Vendedor vendedor = sellerDao.findById(vendedorId);
        System.out.println("Digite o novo nome do vendedor: ");
        vendedor.setName(scr.nextLine());

        System.out.println("Digite o novo Email do vendedor: ");
        vendedor.setEmail(scr.nextLine());

        System.out.println("Digite o novo Salário do vendedor: ");
        vendedor.setBaseSalary(scr.nextDouble());

        sellerDao.update(vendedor);
        System.out.println("Update completed");
    }

    public static void deletarVendedor() {
        Scanner scr = new Scanner(System.in);
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("Digite o id para deletar um vendedor: ");
        int id = scr.nextInt();
        sellerDao.deleteById(id);
        System.out.println("Delete completed");

        // Implemente a lógica para deletar um vendedor aqui
    }

    private ClienteDao clienteDao;

    public static void cadastrarCliente() {
        Scanner scr = new Scanner(System.in);
        ClienteDao clienteDao = DaoFactory.createClienteDao();

        System.out.println("Digite o nome do Cliente: ");
        String name = scr.nextLine();

        System.out.println("Digite o email do Cliente: ");
        String email = scr.nextLine();

        System.out.println("Digite o CPF do Cliente: ");
        String CPF = scr.nextLine();

        Cliente newCliente = new Cliente(null, name, email, CPF);
        newCliente.setId(clienteDao.insert(newCliente));
        System.out.println("Inserido! Novo ID = " + newCliente.getId());


    }


    public static void exibirTodosCliente() {
        ClienteDao clienteDao = DaoFactory.createClienteDao();

        List<Cliente> list = clienteDao.findAll();
        for (Cliente obj : list) {
            System.out.println(obj);
        }

    }

    public static void exibirClientePeloId() {
        Scanner scr = new Scanner(System.in);
        ClienteDao clienteDao = DaoFactory.createClienteDao();

        System.out.println("digite o id do cliente");
        Cliente cliente = clienteDao.findById(scr.nextInt());
        System.out.println(cliente);

    }

    public static void atualizarCliente() {
        Scanner scr = new Scanner(System.in);
        ClienteDao clienteDao = DaoFactory.createClienteDao();

        System.out.println("Digite o ID do cliente: ");
        int clienteId = scr.nextInt();
        scr.nextLine(); // Consuma a quebra de linha

        Cliente cliente = clienteDao.findById(clienteId);
        System.out.println("Digite o novo nome do cliente: ");
        cliente.setName(scr.nextLine());

        System.out.println("Digite o novo Email do cliente: ");
        cliente.setEmail(scr.nextLine());

        System.out.println("Digite o novo CPF do cliente: ");
        cliente.setCPF(scr.nextLine());

        clienteDao.update(cliente);
        System.out.println("Update completed");
    }

    public static void deletarCliente() {
        Scanner scr = new Scanner(System.in);
        ClienteDao clienteDao = DaoFactory.createClienteDao();

        System.out.println("Digite o id para deletar um cliente: ");
        int id = scr.nextInt();
        clienteDao.deleteById(id);
        System.out.println("Delete completed");

    }

    public static void cadastrarProposta() {
        Scanner scr = new Scanner(System.in);
        PropostaDao propostaDao = DaoFactory.createPropostaDao();

        System.out.println("Digite o código da Proposta: ");
        String cod = scr.nextLine();

        System.out.println("Digite a descrição da Proposta: ");
        String descricao = scr.nextLine();

        Proposta newProposta = new Proposta(null, cod, descricao);
        newProposta.setId(propostaDao.insert(newProposta));
        System.out.println("Inserido! Novo ID = " + newProposta.getId());
    }

    public static void exibirTodasPropostas() {
        PropostaDao propostaDao = DaoFactory.createPropostaDao();

        List<Proposta> list = propostaDao.findAll();
        for (Proposta obj : list) {
            System.out.println(obj);
        }
    }

    public static void exibirPropostaPeloId() {
        Scanner scr = new Scanner(System.in);
        PropostaDao propostaDao = DaoFactory.createPropostaDao();

        System.out.println("Digite o id da Proposta: ");
        int id = scr.nextInt();
        Proposta proposta = propostaDao.findById(id);
        System.out.println(proposta);
    }

    public static void atualizarProposta() {
        Scanner scr = new Scanner(System.in);
        PropostaDao propostaDao = DaoFactory.createPropostaDao();

        System.out.println("Digite o id da Proposta: ");
        int id = scr.nextInt();
        scr.nextLine(); // Consuma a quebra de linha

        Proposta proposta = propostaDao.findById(id);
        System.out.println("Digite o novo código da Proposta: ");
        proposta.setCod(scr.next());

        scr.nextLine(); // Consuma a quebra de linha
        System.out.println("Digite a nova descrição da Proposta: ");
        proposta.setDescricao(scr.nextLine());

        propostaDao.update(proposta);
        System.out.println("Update completed");
    }


    public static void deletarProposta() {
        Scanner scr = new Scanner(System.in);
        PropostaDao propostaDao = DaoFactory.createPropostaDao();

        System.out.println("Digite o id para deletar uma Proposta: ");
        int id = scr.nextInt();
        propostaDao.deleteById(id);
        System.out.println("Delete completed");
    }


    private ProdutoDao produtoDao; //aqui começa as funções dos produtos -> DJONATHAN

    public static void cadastrarProduto() {
        Scanner scr = new Scanner(System.in);
        ProdutoDao produtoDao = DaoFactory.createProdutoDao();

        System.out.println("Digite o nome do produto: ");
        String nome = scr.nextLine();

        double preco = 0.0;

        try {
            System.out.println("Digite o valor do produto: ");
            preco = Double.parseDouble(scr.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Erro: Valor de preço inválido. Certifique-se de inserir um número válido.");
            return; // Encerra a operação de cadastro
        }

        if (nome.isEmpty()) {
            System.out.println("Erro: O nome do produto não pode estar vazio.");
            return; // Encerra a operação de cadastro
        }

        Produto newProduto = new Produto(nome, preco);
        long novoId = produtoDao.insert(newProduto);

        if (novoId != -1) {
            newProduto.setId((int) novoId);
            System.out.println("Produto cadastrado com sucesso! Novo ID = " + newProduto.getId());
        } else {
            System.out.println("Erro ao inserir o produto no banco de dados.");
        }
    }



        public static void exibirTodosProdutos() {
            ProdutoDao produtoDao = DaoFactory.createProdutoDao();

            List<Produto> list = produtoDao.findAll();
            for (Produto obj : list) {
                System.out.println(obj);
            }}


    public static void exibirProdutoPeloId() {
            Scanner scr = new Scanner(System.in);
            ProdutoDao produtoDao = DaoFactory.createProdutoDao();

            System.out.println("digite o id do produto");
            Produto produto = produtoDao.findById(scr.nextInt());
            System.out.println(produto);
        }

        public static void deletarProduto() {
            Scanner scr = new Scanner(System.in);
            ProdutoDao produtoDao = DaoFactory.createProdutoDao();

            System.out.println("Digite o id para deletar um produto: ");
            int id = scr.nextInt();
            produtoDao.deleteById(id);
            System.out.println("Produto Deletado com sucesso!");


}
    public static void cadastrarUser() {
        Scanner scr = new Scanner(System.in);
        UserDao userDao = DaoFactory.createUserDao(); // Inicialize a variável userDao

        System.out.println("Digite o nome do Usuário: ");
        String name = scr.nextLine();

        System.out.println("Digite o email do Usuário: ");
        String email = scr.nextLine();

        System.out.println("Digite o CPF do Usuário: ");
        String CPF = scr.nextLine();

        User newUser = new User(null, name, email, CPF);
        newUser.setId(userDao.insert(newUser));
        System.out.println("Inserido! Novo ID = " + newUser.getId());
    }

    public static void exibirTodosUsers() {
        UserDao userDao = DaoFactory.createUserDao(); // Inicialize a variável userDao

        List<User> list = userDao.findAll();
        for (User obj : list) {
            System.out.println(obj);
        }
    }

    public static void exibirUserPeloId() {
        Scanner scr = new Scanner(System.in);
        UserDao userDao = DaoFactory.createUserDao(); // Inicialize a variável userDao

        System.out.println("Digite o id do usuário");
        User user = userDao.findById(scr.nextInt());
        System.out.println(user);
    }

    public static void atualizarUser() {
        Scanner scr = new Scanner(System.in);
        UserDao userDao = DaoFactory.createUserDao(); // Inicialize a variável userDao

        System.out.println("Digite o ID do usuário: ");
        int userId = scr.nextInt();
        scr.nextLine(); // Consuma a quebra de linha

        User user = userDao.findById(userId);
        System.out.println("Digite o novo nome do usuário: ");
        user.setName(scr.nextLine());

        System.out.println("Digite o novo Email do usuário: ");
        user.setEmail(scr.nextLine());

        System.out.println("Digite o novo CPF do usuário: ");
        user.setCPF(scr.nextLine());

        userDao.update(user);
        System.out.println("Update completed");
    }

    public static void deletarUser() {
        Scanner scr = new Scanner(System.in);
        UserDao userDao = DaoFactory.createUserDao(); // Inicialize a variável userDao

        System.out.println("Digite o id para deletar um usuário: ");
        int id = scr.nextInt();
        userDao.deleteById(id);
        System.out.println("Delete completed");
    }

}


