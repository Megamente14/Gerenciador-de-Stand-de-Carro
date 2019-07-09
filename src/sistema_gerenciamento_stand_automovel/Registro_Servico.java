package sistema_gerenciamento_stand_automovel;

import javax.swing.JOptionPane;

public class Registro_Servico implements Registro_Stand {

    Carros carro = new Carros();
    Funcionarios funcionario = new Funcionarios();
    Clientes cliente = new Clientes();

    private int dia_servico;
    private int ano;
    private String mes;
    private int dia_entrega;
    private String mes_entrega;
    private int ano_entrega;
    private String destino;
    private double precoReparo;
    private double precoLocacao;

    public double getPrecoLocacao() {
        return precoLocacao;
    }

    public void setPrecoLocacao(double precoLocacao) {
        this.precoLocacao = precoLocacao;
    }

    public double getPrecoReparo() {
        return precoReparo;
    }

    public void setPrecoReparo(double precoReparo) {
        this.precoReparo = precoReparo;
    }

    // Mêtodo Contrutor Vazio!!!!!!!!!!!!!!!!!!!
    public Registro_Servico() {
    }

    // Mêtodo Contrutor Co Paramêtro!!!!!!!!!!!!!!!!!!!
    public Registro_Servico(int dia_servico, int ano, String mes, int dia_entrega, String mes_entrega, int ano_entrega, String destino) {
        this.dia_servico = dia_servico;
        this.ano = ano;
        this.mes = mes;
        this.dia_entrega = dia_entrega;
        this.mes_entrega = mes_entrega;
        this.ano_entrega = ano_entrega;
        this.destino = destino;
    }

    // Mêtodo Especiais- Acessores e Modificadores!!!!!!!!!
    public Carros getCarro() {
        return carro;
    }

    public void setCarro(Carros carro) {
        this.carro = carro;
    }

    public Funcionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionarios funcionario) {
        this.funcionario = funcionario;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public int getDia_servico() {
        return dia_servico;
    }

    public void setDia_servico(int dia_servico) {
        this.dia_servico = dia_servico;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getDia_entrega() {
        return dia_entrega;
    }

    public void setDia_entrega(int dia_entrega) {
        this.dia_entrega = dia_entrega;
    }

    public String getMes_entrega() {
        return mes_entrega;
    }

    public void setMes_entrega(String mes_entrega) {
        this.mes_entrega = mes_entrega;
    }

    public int getAno_entrega() {
        return ano_entrega;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setAno_entrega(int ano_entrega) {
        this.ano_entrega = ano_entrega;
    }

// Conceito de Polimorfismo - Mêtodo SobrePosto!!!
    @Override
    public void registrarAlugerCarro() {
        this.funcionario.setNome(JOptionPane.showInputDialog("Digite o Nome do Funcionário que Realizou o Aluguer!"));
        this.cliente.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente que Requisitou  o Aluguer!"));
        this.carro.setMatricula(JOptionPane.showInputDialog("Digite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
        this.carro.precoCarro_Aluguer = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço para o Serviço de Aluguer!")));
        this.setDia_servico(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Seviço foi realizado")));
        this.setMes(JOptionPane.showInputDialog("Digita o Mês da realização do Serviço"));
        this.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano da realização do Serviço")));

        this.setDia_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita dia da entrega de Carro!")));
        this.setMes_entrega(JOptionPane.showInputDialog("Digita Mês da entrega de Carro!"));
        this.setAno_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita Ano da entrega de Carro!")));

        JOptionPane.showMessageDialog(null, " Serviço Registrado:\n Essas São as Informação:\n-->O Serviço de Aluguer  Foi realizado pelo/a Funcionário/a:=> " + this.funcionario.getNome() + "\n"
                + " -->E este Carro Foi Aluguado Para o/a Cliente:=> " + this.cliente.getNome() + "\n-->E a Matricula do Carro é STP : " + this.carro.getMatricula() + "\n-->Este "
                + " serviço foi reaizado na Seguinte Data: " + this.getDia_servico() + " / " + this.getMes() + " / " + this.getAno() + "\n "
                + " e será finalizado na Seguinte Data: " + this.getDia_entrega() + " / " + this.getMes_entrega() + " / " + this.getAno_entrega()+this.carro.precoCarro_Aluguer+" Dobras");

    }
// Conceito de Polimorfismo - Mêtodo SobrePosto!!!

    @Override
    public void registrarDeslocamentoCarro() {
        this.funcionario.setNome(JOptionPane.showInputDialog("Digite o Nome do Funcionário que Realizou Deslocação do Carro!"));
        this.cliente.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente Requisitou !"));
        this.carro.setMatricula(JOptionPane.showInputDialog("Digite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
        this.setPrecoLocacao(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço para o Serviço de Locação!")));
        this.setDia_servico(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Seviço foi realizado")));
        this.setMes(JOptionPane.showInputDialog("Digita o Mês no Qual o Seviço foi realizado"));
        this.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Seviço foi realizado")));

        this.setDestino(JOptionPane.showInputDialog("Digite o Local da Locação do Carro!"));

        JOptionPane.showMessageDialog(null, " Serviço Registrado, essas São as Informação:\n-->O Serviço de Deslocação do Carro  Foi realizado pelo/a Funcionário/a " + this.funcionario.getNome() + "\n"
                + " -->E este Carro Foi Deslocado Para o/a Cliente " + this.cliente.getNome() + "\n-->E a Matricula do Carro é STP : " + this.carro.getMatricula() + "\n-->Este "
                + " serviço foi reaizado no dia  " + this.getDia_servico() + " / " + this.getMes() + " / " + this.getAno() + "\n "
                + " e o Local da Locação " + this.getDestino()+this.precoLocacao+" Dobras");

    }
// Conceito de Polimorfismo - Mêtodo SobrePosto!!!

    @Override
    public void registrarReparoCarro() {
        this.funcionario.setNome(JOptionPane.showInputDialog("Digite o Nome do Funcionário que Realizou o Reparo!"));
        this.cliente.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente Requisitou  o Reparo!"));
        this.carro.setMatricula(JOptionPane.showInputDialog("Digite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
        this.setPrecoReparo(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço para o Serviço de Reparo!")));
        this.setDia_servico(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Seviço foi realizado")));
        this.setMes(JOptionPane.showInputDialog("Digita o Mês no Qual o Seviço foi realizado"));
        this.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Seviço foi realizado")));

        this.setDia_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Carro será Entrege!")));
        this.setMes_entrega(JOptionPane.showInputDialog("Digita  o Mês no Qual o Carro será Entrege!"));
        this.setAno_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Carro será Entrege! ")));

        JOptionPane.showMessageDialog(null, " Serviço Registrado, essas São as Informação:\n-->O Serviço de Reparação Foi realizado pelo/a Funcionário/a " + this.funcionario.getNome() + "\n"
                + " -->E este Carro Foi Reparado Para o/a Cliente " + this.cliente.getNome() + "\n-->E a Matricula do Carro é: " + this.carro.getMatricula() + " STP " + "\n-->Este "
                + " serviço foi reaizado no dia  " + this.getDia_servico() + " / " + this.getMes() + " / " + this.getAno() + "\n "
                + " e será finalizado no dia " + this.getDia_entrega() + "  / " + this.getMes_entrega() + "  / " + this.getAno_entrega()+this.precoReparo+" Dobras");

    }
// Conceito de Polimorfismo - Mêtodo SobrePosto!!!

    @Override
    public void registrarVendaCarro() {
        this.funcionario.setNome(JOptionPane.showInputDialog("Digite o Nome do Funcionário que Realizou a Venda!"));
        this.cliente.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente Requisitou a Compra!"));
        this.carro.setMatricula(JOptionPane.showInputDialog("Digite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
        this.carro.precoCarro_Venda = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço para o Serviço de Venda!")));
        this.setDia_servico(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Seviço foi realizado")));
        this.setMes(JOptionPane.showInputDialog("Digita o Mês no Qual o Seviço foi realizado"));
        this.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Seviço foi realizado")));

        JOptionPane.showMessageDialog(null, " Serviço Registrado, essas São as Informação:\n-->O Serviço de Venda Foi realizado pelo/a Funcionário/a " + this.funcionario.getNome() + "\n"
                + " -->E este Carro Foi Comprado Pelo/a Cliente " + this.cliente.getNome() + "\n-->E a Matricula do Carro é: " + this.carro.getMatricula() + " STP " + "\n-->Este "
                + " serviço foi reaizado no dia  " + this.getDia_servico() + " / " + this.getMes() + " / " + this.getAno()+this.carro.precoCarro_Venda+" Dobras");

    }
// Conceito de Polimorfismo - Mêtodo SobrePosto!!!

    @Override
    public void registrarlisingCarro() {
        this.funcionario.setNome(JOptionPane.showInputDialog("Digite o Nome do Funcionário que Realizou o Lising!"));
        this.cliente.setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente Requisitou o lising!"));
        this.carro.setMatricula(JOptionPane.showInputDialog("Digite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
        this.carro.precoCarro_Lising = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço para o  Serviço de Lising!")));
        this.setDia_servico(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Seviço foi realizado")));
        this.setMes(JOptionPane.showInputDialog("Digita o Mês no Qual o Seviço foi realizado"));
        this.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Seviço foi realizado")));

        this.setDia_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Carro será Entrege!")));
        this.setMes_entrega(JOptionPane.showInputDialog("Digita  o Mês no Qual o Carro será Entrege!"));
        this.setAno_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Carro será Entrege! ")));

        JOptionPane.showMessageDialog(null, " Serviço Registrado, essas São as Informação:\n-->O Serviço de Lising Foi realizado pelo/a Funcionário/a " + this.funcionario.getNome() + "\n"
                + " -->E este Carro Foi Llising pelo/a Cliente " + this.cliente.getNome() + "\n-->E a Matricula do Carro é: " + this.carro.getMatricula() + " STP " + "\n-->Este "
                + " serviço foi reaizado no dia  " + this.getDia_servico() + " / " + this.getMes() + " / " + this.getAno() + "\n "
                + " e será finalizado no dia " + this.getDia_entrega() + " / " + this.getMes_entrega() + " / " + this.getAno_entrega()+"\nE o Valor usado no Serviço foi de "+this.carro.precoCarro_Lising+" Dobras");

    }

}
