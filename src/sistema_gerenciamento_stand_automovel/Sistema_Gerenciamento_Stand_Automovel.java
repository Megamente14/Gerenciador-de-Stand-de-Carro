package sistema_gerenciamento_stand_automovel;

import javax.swing.JOptionPane;

public class Sistema_Gerenciamento_Stand_Automovel {

    public static void gerente() {

    }

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "         --------------------------------------------------------------------------"
                + "------------------------------------------------\n----------------Bem Vindo ao Ambiente do Sistema de Gerenciamento de Dados Da Stand ----------------\n"
                + "         --------------------------------------------------------------------------------------------------------------------------");
        String codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
        verify_error_codigo(codigo);

    }

//Verificar erro no Pedido do Codigo inicial!!!!!
    private static void verify_error_codigo(String codigo) {
// Instãncia de Funcionário
        Funcionarios funcionario1 = new Funcionarios();

// Instãncia de Registro de Serviço
        Registro_Servico registroService = new Registro_Servico();

// Instãncia de Clientes
        Clientes cliente = new Clientes();

// Instãncia de Carro
        Carros carro = new Carros();

        if (codigo.equals("1") || codigo.equals("2") || codigo.equals("3") || codigo.equals("4")) {
            switch (codigo) {
                case "1":
                    String codigo1 = (JOptionPane.showInputDialog("Para Gerenciamento quanto ao [Funcionário];\n"
                            + "Digite 1 para Verificar Idade do Funcionário!\n"
                            + "Digite 2 para Adicionar(Cadastrar) o Funcionário!\n"
                            + "Digite 3 para Atualizar-Editar dados ou Infornações do Funcionário!\n"
                            + "Digite 4 para Atribuir Salário do Funcionário!\n"
                            + "Digite 5 para Aumentar Salário do Funcionário!\n"
                            + "Digite 6 para Aplicar Desconto no Salário do Funcionário!\n"
                            + "Digite 7 para Apresentar Informção do Funcionário!\n"
                            + "Digite 8 para Remover o Funcionário!"));
                    

                    switch (codigo1) {
                        case "1":
                            funcionario1.verify_Idade();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "2":
                            funcionario1.adicionar_Funcionario();
                            funcionario1.setEstadoCadastroF(true);
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);

                            break;
                        case "3":
                            funcionario1.atualizar_Dados();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "4":
                            funcionario1.atribuir_Salario();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "5":
                            funcionario1.aumentar_Salario();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "6":
                            funcionario1.fazer_Desconto();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "7":
                            funcionario1.exibir_Dados();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "8":
                            funcionario1.remover_Funcionario();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;

                    }

                    break;
                case "2":
                    String codigo2 = (JOptionPane.showInputDialog("Para Gerenciamento quanto ao [Cliente];\n"
                            + "Digite 1 para Verificar Idade do Cliente!\n"
                            + "Digite 2 para Adicionar(Cadastrar) o Cliente!\n"
                            + "Digite 3 para Atualizar-Editar dados ou Infornações do Cliente\n"
                            + "Digite 4 para Apresentar Informção do Cliente!\n"
                            + "Digite 5 para Remover o Cliente!\n"));
                    switch (codigo2) {
                        case "1":
                            cliente.verify_Idade();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "2":
                            cliente.adicionar_Cliente();
                            cliente.setEstadoCadastroC(true);
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "3":
                            cliente.AtualizarDado_Cliente();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "4":
                            cliente.exibir_Dados();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "5":
                            cliente.remover_Cliente();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                    }
                    break;
                case "3":
                    String codigo3 = (JOptionPane.showInputDialog("Para Gerenciamento quanto ao [Carro]!;\n"
                            + "Digite 1 para Adicionar o Carro!\n"
                            + "Digite 2 para Validar os Preços do Serviços!\n"
                            + "Digite 3 para Atualizar-Editar dados ou Infornações do Carro\n"
                            + "Digite 4 para Apresentar Informção do Carro!\n"
                            + "Digite 5 para Remover o Carro!\n"));
                    switch (codigo3) {
                        case "1":
                            carro.adicionar_Carro();
                            carro.setEstadoCadastro(true);
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "2":
                            String codigo33 = (JOptionPane.showInputDialog("Para este Caso!;\n"
                                    + "Digite 1 para Validar  Preço da Venda!\n"
                                    + "Digite 2 para Validar  Preço do Aluguer!\n"
                                    + "Digite 3 para Validar  Preço da Lising!\n"));
                            switch (codigo33) {
                                case "1":
                                    carro.Validar_Preco_Carro_Venda();
                                    JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                                    break;
                                case "2":
                                    carro.Validar_Preco_Carro_Aluguer();
                                    JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                                    break;
                                case "3":
                                    carro.Validar_Preco_Carro_Lising();
                                    JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                                    break;

                            }

                        case "3":
                            carro.atualizar_Dados_Carro();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "4":
                            carro.fazer_Exibicao_Status_Carro();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                        case "5":
                            carro.remover_Carro();
                            JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                            break;
                    }
                    break;
                case "4":

                    if (cliente.isEstadoCadastroC() == true && funcionario1.isEstadoCadastro() == true && carro.isEstadoCadastro() == true) {
                        String codigo4 = (JOptionPane.showInputDialog("Para Gerenciamento quanto ao [Registros dos Serviços]!;\n"
                                + "Digite 1 Registrar o Serviço de Venda!\n"
                                + "Digite 2 Registrar o Serviço de Aluguer!\n"
                                + "Digite 3 Registrar o Serviço de Lising!\n"
                                + "Digite 4 Registrar o Serviço de Locação!\n"
                                + "Digite 5 Registrar o Serviço de Reparo!\n"));
                        switch (codigo4) {

                            case "1":
                                registroService.funcionario.setNome(funcionario1.getNome());
                                registroService.cliente.setNome(cliente.getNome());
                                registroService.carro.setMatricula(carro.getMatricula());

                                registroService.carro.precoCarro_Venda = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço para o Serviço de Venda!")));
                                registroService.setDia_servico(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Seviço foi realizado")));
                                registroService.setMes(JOptionPane.showInputDialog("Digita o Mês no Qual o Seviço foi realizado"));
                                registroService.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Seviço foi realizado")));

                                JOptionPane.showMessageDialog(null, " Serviço Registrado, essas São as Informação:\n-->O Serviço de Venda Foi realizado pelo/a Funcionário/a " + registroService.funcionario.getNome() + "\n"
                                        + " -->E este Carro Foi Comprado Pelo/a Cliente " + registroService.cliente.getNome() + "\n-->E a Matricula do Carro é: " + registroService.carro.getMatricula() + " STP " + "\n-->Este "
                                        + " serviço foi reaizado no dia  " + registroService.getDia_servico() + " / " + registroService.getMes() + " / " + registroService.getAno() + "\nE o Valor Do Serviço foi de " + registroService.carro.precoCarro_Venda + " Dobras");
                                JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                                break;

                            case "2":
                                registroService.funcionario.setNome(funcionario1.getNome());
                                registroService.cliente.setNome(cliente.getNome());
                                registroService.carro.setMatricula(carro.getMatricula());

                                registroService.carro.precoCarro_Aluguer = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço para o Serviço de Aluguer!")));
                                registroService.setDia_servico(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Seviço foi realizado")));
                                registroService.setMes(JOptionPane.showInputDialog("Digita o Mês no Qual o Seviço foi realizado"));
                                registroService.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Seviço foi realizado")));
                                registroService.setDia_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Carro será Entrege!")));
                                registroService.setMes_entrega(JOptionPane.showInputDialog("Digita  o Mês no Qual o Carro será Entrege!"));
                                registroService.setAno_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Carro será Entrege! ")));
                                JOptionPane.showMessageDialog(null, " Serviço Registrado, essas São as Informação:\n-->O Serviço de Aluguer Foi realizado pelo/a Funcionário/a " + registroService.funcionario.getNome() + "\n"
                                        + " -->E este Carro Foi Llising pelo/a Cliente " + registroService.cliente.getNome() + "\n-->E a Matricula do Carro é: " + registroService.carro.getMatricula() + " STP " + "\n-->Este "
                                        + " serviço foi reaizado no dia  " + registroService.getDia_servico() + " / " + registroService.getMes() + " / " + registroService.getAno() + "\n "
                                        + " e será finalizado no dia " + registroService.getDia_entrega() + " / " + registroService.getMes_entrega() + " / " + registroService.getAno_entrega() + "\nE o Valor usado no Serviço foi de " + registroService.carro.precoCarro_Aluguer + " Dobras");
                                JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);

                                break;
                            case "3":
                                registroService.funcionario.setNome(funcionario1.getNome());
                                registroService.cliente.setNome(cliente.getNome());
                                registroService.carro.setMatricula(carro.getMatricula());

                                registroService.carro.precoCarro_Lising = (Double.parseDouble(JOptionPane.showInputDialog("Digite o preço para o Serviço de Lising!")));
                                registroService.setDia_servico(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Seviço foi realizado")));
                                registroService.setMes(JOptionPane.showInputDialog("Digita o Mês no Qual o Seviço foi realizado"));
                                registroService.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Seviço foi realizado")));
                                registroService.setDia_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita a Dia no Qual o Carro será Entrege!")));
                                registroService.setMes_entrega(JOptionPane.showInputDialog("Digita  o Mês no Qual o Carro será Entrege!"));
                                registroService.setAno_entrega(Integer.parseInt(JOptionPane.showInputDialog("Digita o Ano no Qual o Carro será Entrege! ")));
                                JOptionPane.showMessageDialog(null, " Serviço Registrado, essas São as Informação:\n-->O Serviço de Lising Foi realizado pelo/a Funcionário/a " + registroService.funcionario.getNome() + "\n"
                                        + " -->E este Carro Foi Llising pelo/a Cliente " + registroService.cliente.getNome() + "\n-->E a Matricula do Carro é: " + registroService.carro.getMatricula() + " STP " + "\n-->Este "
                                        + " serviço foi reaizado no dia  " + registroService.getDia_servico() + " / " + registroService.getMes() + " / " + registroService.getAno() + "\n "
                                        + " e será finalizado no dia " + registroService.getDia_entrega() + " / " + registroService.getMes_entrega() + " / " + registroService.getAno_entrega() + "\nE o Valor usado no Serviço foi de " + registroService.carro.precoCarro_Lising + " Dobras");
                                JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                                break;
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Dentre o Funcionário, o Cliente, e o Carro, um deles não está Cadastrado, ou nenhum dos Está!! Cadastrados!!", "Alerta!", JOptionPane.WARNING_MESSAGE);
                        JOptionPane.showMessageDialog(null, "Digite ENTER para Retornar ao Ambiente de Escolha Principal!!!");
                    codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                            + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                            + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                            + "Digite 3 para o Gerenciamento do [Carro]!!!\n"
                            + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
                    verify_error_codigo(codigo);
                    }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Escolha dos Dados que Serão Gerenciados!!!", "Verificação de Cadastro!!!", JOptionPane.WARNING_MESSAGE);
            codigo = (JOptionPane.showInputDialog("Por Favor Para o Gerenciamento da Stand\n"
                    + "Didite 1 para o Gerenciamento do [Funcionário]!!!\n"
                    + "Digite 2 para o Gerenciamento do [Cliente]!!!\n"
                    + "Digite 3 para o Gerenciamento do [Carro]\n"
                    + "Digite 4 para o Gerenciamento quanto ao [Registros dos Serviços]!!!"));
            verify_error_codigo(codigo);
        }

    }

}
