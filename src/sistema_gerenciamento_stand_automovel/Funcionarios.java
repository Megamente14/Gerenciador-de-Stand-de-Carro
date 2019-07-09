package sistema_gerenciamento_stand_automovel;

import javax.swing.JOptionPane;

/**
 *
 * APPOLO 4
 */

// Conceito de Herança!!!!!!!!!

public final  class Funcionarios extends Pessoa {

    protected int ano;
    private double salario;
    private boolean estadoCadastroF;
    protected int quantidadeFuncionario = 15;
    protected int idade;
    Endereco endereco = new Endereco();
//Metodo Construtor
    public Funcionarios() {
this.setNome("Benilde");
this.setEstadoCadastroF(true);
    }
   // Mêtodo Contrutor - por Herança!!!!!!!!!!!!!!!!!!!
    public Funcionarios(String nome, String sexo, int datan, String nacionalidade, String telefone) {
        super(nome, sexo, datan, nacionalidade, telefone);
    }
    // Mêtodo Especiais- Acessores e Modificadores!!!!!!
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isEstadoCadastro() {
        return estadoCadastroF;
    }

    public void setEstadoCadastroF(boolean estadoCadastroF) {
        this.estadoCadastroF = estadoCadastroF;
    }
//Mêtodo Para Apresentar Idade do Funcionário!!! ///// Conceito de Polimorfismo - Mêtodo SobrePosto!!!

    @Override
    public int verify_Idade() {
        if (estadoCadastroF == true) {
            JOptionPane.showMessageDialog(null, "O Funcionário Tem " + this.idade + " Anos!");

        } else {
            JOptionPane.showMessageDialog(null, "Este Funcionário Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
        return idade;
    }
    // Mêtodo para Apresentar Status!!!!!!!!!!!!///// Conceito de Polimorfismo - Mêtodo SobrePosto!!!
     @Override
     
    public void exibir_Dados() {
        if(this.estadoCadastroF==true){
JOptionPane.showMessageDialog(null, "Estas Cadastrado/a neste Sistema,essas são as  informações do "
                + "Funcionário ( " + this.getNome() + " )\n=> Nome Completo: " + this.getNome() + "\n=>Tem " + this.ano
                + " anos de idade \n=>sexo: " + this.getSexo() + "\n=>Nacionalidade: " + this.getNacionalidade() + "\n=>O seu Número de"
                + " Telefone é: " + this.getTelefone() + "\n=>O seu Email é: " + this.getEmail() + "\n=>Cidade: " + this.endereco.getCidade() + "\n=>Rua:"
                + " " + this.endereco.getRua() + "\n=>Número de Edifício: " + this.endereco.getNumero_edificio());
    }else{
            JOptionPane.showMessageDialog(null, "Este Funcionário Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
    }
 //Mêtodo Para Verif....Erro da Idade Funcionário!!! //// Conceito de Polimorfismo - Mêtodo SobreCarga!!!
    private void verify_Idade(String anoNanci) {
        int aux_Ano = 0;
        if (!anoNanci.equals("")) {
            aux_Ano = Integer.parseInt(anoNanci);
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o ano em que  Nansceu o/a Funcionário/a !", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            anoNanci = (JOptionPane.showInputDialog("Digita o ano em que  Nansceu o/a Funcionário/a "));
            verify_Idade(anoNanci);
        }
        if (aux_Ano > 1929 && aux_Ano < 2019) {

            idade = 2019 - aux_Ano;
            this.setAnoNancimento(idade);
        } else {
            if (this.getAnoNancimento() < 0) {
                JOptionPane.showMessageDialog(null, " Ano Invalido, Por Favor, Digite Corretamente o ano em que  Nansceu o/a Funcionário/a !", "Valor Negativo!!!", JOptionPane.WARNING_MESSAGE);
                anoNanci = (JOptionPane.showInputDialog("Digita o ano em que  Nansceu o/a Funcionário/a "));
                verify_Idade(anoNanci);
            }
        }

    }



    //Mêtodo Para Adicionar Funcionário!!!
    public void adicionar_Funcionario() {
        //Mêtodo Para Perguntar o Ano De Nancimento do Funcionário!!!
        String anoNanci = (JOptionPane.showInputDialog("Digita o ano em que  Nansceu o/a Funcionário/a "));
        verify_Idade(anoNanci);
        //Mêtodo Para Perguntar o Nome do  Funcionário!!!
        String nomef = JOptionPane.showInputDialog(" Por Favor Digite o Nome Completo do/a Funcionário/a");
        verify_error_nomef(nomef);
        //Mêtodo Para Perguntar a Nacionalidade  Funcionário!!!
        String NacioF = (JOptionPane.showInputDialog("Por Favor Digite a sua nacionalidade"));
        verify_error_NacioF(NacioF);
        //Mêtodo Para Perguntar o Telefone Funcionário!!!
        String TelefF = (JOptionPane.showInputDialog("Digita o seu número de Telefone"));
        verify_error_TelefF(TelefF);
        //Mêtodo Para Perguntar o Email do  Funcionário!!!
        String EmailF = (JOptionPane.showInputDialog("Digita o seu Email"));
        verify_error_EmailF(EmailF);
        //Mêtodo Para Perguntar o Cidade do  Funcionário!!!
        String CidadeF = (JOptionPane.showInputDialog("Digita a sua Cidade"));
        verify_error_CidadeF(CidadeF);
        //Mêtodo Para Perguntar o Rua da Cidade do  Funcionário!!!
        String ruaF = (JOptionPane.showInputDialog("Digita a Rua da Cidade!"));
        verify_error_ruaF(ruaF);
        //Mêtodo Para Perguntar o Número do Edifício do  Funcionário!!!
        String NumeEdifF = (JOptionPane.showInputDialog("Digite o número do Edifício"));
        verify_error_NumeEdifF(NumeEdifF);
        //Mêtodo Para Perguntar o Gênero do  Funcionário!!!
        String GeneroF = JOptionPane.showInputDialog("Quanto ao sexo, Digite 1 para Másculino,ou Digite 2 para Feminino !");
        verify_error_GeneroF(GeneroF);
        JOptionPane.showMessageDialog(null, "Estas Cadastrado/a neste Sistema,essas são as  informações do "
                + "Funcionário ( " + this.getNome() + " )\n=> Nome Completo: " + this.getNome() + "\n=>Tem " + this.ano
                + " anos de idade \n=>sexo: " + this.getSexo() + "\n=>Nacionalidade: " + this.getNacionalidade() + "\n=>O seu Número de"
                + " Telefone é: " + this.getTelefone() + "\n=>O seu Email é: " + this.getEmail() + "\n=>Cidade: " + this.endereco.getCidade() + "\n=>Rua:"
                + " " + this.endereco.getRua() + "\n=>Número de Edifício: " + this.endereco.getNumero_edificio());
        this.estadoCadastroF = true;
        this.quantidadeFuncionario += 1;
        JOptionPane.showMessageDialog(null, " Agora Existe " + this.quantidadeFuncionario + " Funcionário na Stand!", "ANÚNCIO!", JOptionPane.INFORMATION_MESSAGE);

    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


    
    //Mêtodo Para Verif....Erro do Nome do Funcionário!!!
    private void verify_error_nomef(String nomef) {
        if (!nomef.equals("")) {
            this.setNome(nomef);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Nome Deste Funcionário!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            nomef = JOptionPane.showInputDialog(" Por Favor Digite o Nome Completo do/a Funcionário/a");
            verify_error_nomef(nomef);
        }
    }

    //Mêtodo Para Verif....Erro do Nacionalidade do Funcionário!!!
    private void verify_error_NacioF(String NacioF) {
        if (!NacioF.equals("")) {
            this.setNacionalidade(NacioF);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente a Nacionalidade Deste Funcionário!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            NacioF = (JOptionPane.showInputDialog("Por Favor Digite a sua nacionalidade"));
            verify_error_NacioF(NacioF);
        }
    }

    //Mêtodo Para Verif....Erro do Telefone do Funcionário!!!
    private void verify_error_TelefF(String TelefF) {
        if (!TelefF.equals("")) {
            this.setTelefone(TelefF);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Telefone Deste Funcionário!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            TelefF = (JOptionPane.showInputDialog("Digita o seu número de Telefone"));
            verify_error_TelefF(TelefF);
        }
    }

    //Mêtodo Para Verif....Erro do Email do Funcionário!!!
    private void verify_error_EmailF(String EmailF) {
        if (!EmailF.equals("")) {
            this.setEmail(EmailF);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Email Deste Funcionário!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            EmailF = (JOptionPane.showInputDialog("Digita o seu Email"));
            verify_error_EmailF(EmailF);
        }
    }

    //Mêtodo Para Verif....Erro do Cidade do Funcionário!!!
    private void verify_error_CidadeF(String CidadeF) {
        if (!CidadeF.equals("")) {
            this.endereco.setCidade(CidadeF);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Cidade Deste Funcionário!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            CidadeF = (JOptionPane.showInputDialog("Digita a sua Cidade"));
            verify_error_CidadeF(CidadeF);
        }
    }

    //Mêtodo Para Verif....Erro do Rua Da Cidade do Funcionário!!!
    private void verify_error_ruaF(String ruaF) {
        if (!ruaF.equals("")) {
            this.endereco.setRua(ruaF);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente a Rua da Cidade Deste Funcionário!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            ruaF = (JOptionPane.showInputDialog("Digita a Rua da Cidade!"));
            verify_error_ruaF(ruaF);
        }
    }
//Mêtodo Para Verif....Erro do Rua Da Cidade do Funcionário!!!

    private void verify_error_NumeEdifF(String NumeEdifF) {
        if (!NumeEdifF.equals("")) {
            this.endereco.setNumero_edificio(NumeEdifF);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Número do Edifício Deste Funcionário!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            NumeEdifF = (JOptionPane.showInputDialog("Digite o número do Edifício"));
            verify_error_NumeEdifF(NumeEdifF);
        }
    }

    //Verifi..Erro no Gênero do Funcionário!!!
    private void verify_error_GeneroF(String GeneroF) {
        if (GeneroF.equalsIgnoreCase("1") || GeneroF.equalsIgnoreCase("2")) {
            if (GeneroF.equalsIgnoreCase("1")) {
                this.setSexo("Masculino");
            } else {
                if (GeneroF.equalsIgnoreCase("2")) {
                    this.setSexo("Feminino");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Definição do Gênero do Funcionário!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção
            GeneroF = JOptionPane.showInputDialog("Quanto ao sexo, Digite 1 para Másculino,ou Digite 2 para Feminino !");
            verify_error_GeneroF(GeneroF);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Mêtodo Para Remover Funcionário!!!
    public void remover_Funcionario() {
        if (estadoCadastroF == true) {
            this.estadoCadastroF = false;
            this.quantidadeFuncionario -= 1;
            JOptionPane.showMessageDialog(null, " Agora Passou a Existir " + this.quantidadeFuncionario + " Funcionário no Sistema da Stand!", "ANÚNCIO!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Este Funcionário Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }

    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Mêtodo Para Atribuir Salário!!!
    public void atribuir_Salario() {
        if (estadoCadastroF == true) {
            String valor = (JOptionPane.showInputDialog(" Digite o Valor do Salário à ser Atribuido para o/a Funcionario/a " + this.getNome()));
            verify_error_valor(valor);
            JOptionPane.showMessageDialog(null, "O Salário atribuido  ao  funcionário/a " + this.getNome() + " foi de " + this.salario + " Dobras");

        } else {
            JOptionPane.showMessageDialog(null, "Este Funcionário Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
    }
    //Mêtodo Para Verif....Erro da Valor do Salário!!!

    private void verify_error_valor(String valor) {
        int aux_valor = 0;
        if (!valor.equals("")) {
            aux_valor = Integer.parseInt(valor);
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Valor do Salário à ser Atribuido para o/a Funcionario/a !" + this.getNome() + "", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            valor = (JOptionPane.showInputDialog(" Digite o Valor do Salário à ser Atribuido para o/a Funcionario/a " + this.getNome()));
            verify_error_valor(valor);
        }
        if (aux_valor > 0) {
            this.salario = aux_valor;
        } else {
            if (aux_valor < 0) {
                JOptionPane.showMessageDialog(null, " Salário Invalido, Por Favor, Digite Corretamente o Valor do Salário à ser Atribuido para o/a Funcionario/a !", "Valor Negativo!!!", JOptionPane.WARNING_MESSAGE);
                valor = (JOptionPane.showInputDialog(" Digite o Valor do Salário à ser Atribuido para o/a Funcionario/a " + this.getNome()));
                verify_error_valor(valor);
            }
        }

    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Mêtodo Para Aumentar Salário!!!
    public void aumentar_Salario() {
        if (estadoCadastroF == true) {
            String aumento = (" Digite o Valor do Aumento à ser Atribuido para o/a Funcionario/a " + this.getNome());
            verify_error_aumento(aumento);
            JOptionPane.showMessageDialog(null, "Agora o total do salário do/a funcionário/a " + this.getNome() + " é de " + this.salario + " Dobras");
        } else {
            JOptionPane.showMessageDialog(null, "Este Funcionário Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
    }
    //Mêtodo Para Verif....Erro do Aumento do Salário!!!

    private void verify_error_aumento(String aumento) {
        int aux_valorA = 0;
        if (!aumento.equals("")) {
            aux_valorA = Integer.parseInt(aumento);
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Valor Aumento do Salário à ser Atribuido para o/a Funcionario/a !" + this.getNome() + "", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            aumento = (JOptionPane.showInputDialog(" Digite o Valor Aumento do Salário à ser Atribuido para o/a Funcionario/a " + this.getNome()));
            verify_error_valor(aumento);
        }
        if (aux_valorA > 0) {
            this.salario += aux_valorA;
        } else {
            if (aux_valorA < 0) {
                JOptionPane.showMessageDialog(null, " Aumento do Salário Invalido, Por Favor, Digite Corretamente o Valor do Aumentodo Salário à ser Atribuido para o/a Funcionario/a !", "Valor Negativo!!!", JOptionPane.WARNING_MESSAGE);
                aumento = (JOptionPane.showInputDialog(" Digite o Valor do Aumento do Salário à ser Atribuido para o/a Funcionario/a " + this.getNome()));
                verify_error_valor(aumento);
            }
        }

    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Mêtodo Para Aplicar Desconto!!!
    public void fazer_Desconto() {
        if (estadoCadastroF == true) {
            String descontoF = JOptionPane.showInputDialog(" Digite o Valor do Desconto à ser Efectuado para o/a Funcionari/a " + this.getNome());
            verify_error_descontoF(descontoF);
            if (this.salario < 0) {
                JOptionPane.showMessageDialog(null, "O funcionário " + this.getNome() + " está em dívida com a Stand de  " + this.salario + " Dobras");
            }
            JOptionPane.showMessageDialog(null, "Agora o total do salário do/a funcionário/a " + this.getNome() + " é de " + this.salario + " Dobras");
        } else {
            JOptionPane.showMessageDialog(null, "Este Funcionário Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
    }
    //Mêtodo Para Verif....Erro do Desconto do Salário!!!

    private void verify_error_descontoF(String descontoF) {
        int aux_valorD = 0;
        if (!descontoF.equals("")) {
            aux_valorD = Integer.parseInt(descontoF);
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Valor do Desconto do Salário à ser Efetuado para o/a Funcionario/a !" + this.getNome() + "", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            descontoF = JOptionPane.showInputDialog(" Digite o Valor do Desconto à ser Efectuado para o/a Funcionari/a " + this.getNome());
            verify_error_descontoF(descontoF);
        }
        if (aux_valorD > 0) {
            this.salario = aux_valorD;
        } else {
            if (aux_valorD < 0) {
                JOptionPane.showMessageDialog(null, " Desconto do Salário Invalido, Por Favor, Digite Corretamente o Valor do do Desconto à ser Efectuado para o/a Funcionari/a " + this.getNome() + "", "Valor Negativo!!!", JOptionPane.WARNING_MESSAGE);
                descontoF = JOptionPane.showInputDialog(" Digite o Valor do Desconto à ser Efectuado para o/a Funcionari/a " + this.getNome());
                verify_error_descontoF(descontoF);
            }
        }

    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //Mêtodo Para Atualizar os Dados dos Funcionário!!

    public void atualizar_Dados() {
        if (this.estadoCadastroF == true) {
            String atual_DadosF = JOptionPane.showInputDialog("Atualização de Dados Do Funcionário!!!!\n\nPor Favor Digite a Senha do Dado que Pretendes"
                    + " Atualizar!\n=> 1-Referente ao Número de Telefone!\n=> 2-Referente "
                    + "ao Email!\n=> 3-Referente à Cidade onde Mora!\n=> 4- Referente à Rua em Concreto!\n=> 5- Referente à  Número de Edifício onde Mora!");
            correcaoF_Atual_Dados(atual_DadosF);
            JOptionPane.showMessageDialog(null, "Estas Cadastrado/a neste Sistema,essas são as  informações do "
                    + "Funcionário ( " + this.getNome() + " )\n=> Nome Completo: " + this.getNome() + "\n=>Tem " + this.ano
                    + " anos de idade \n=>sexo: " + this.getSexo() + "\n=>Nacionalidade: " + this.getNacionalidade() + "\n=>O seu Número de"
                    + " Telefone é: " + this.getTelefone() + "\n=>O seu Email é: " + this.getEmail() + "\n=>Cidade: " + this.endereco.getCidade() + "\n=>Rua:"
                    + " " + this.endereco.getRua() + "\n=>Número de Edifício: " + this.endereco.getNumero_edificio());
        } else {
            JOptionPane.showMessageDialog(null, "Este Funcionário Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }

    }

    //Mêtodo Para Correção para Atualizar OU Editar Dados!!! 
    private void correcaoF_Atual_Dados(String atual_DadosF) {

        if (atual_DadosF.equals("1") || atual_DadosF.equals("2") || atual_DadosF.equals("3") || atual_DadosF.equals("4") || atual_DadosF.equals("5")) {
            switch (atual_DadosF) {
                case "1":
                    //Mêtodo Para Perguntar o Telefone Funcionário!!!
                    String TelefF = (JOptionPane.showInputDialog("Digita o seu número de Telefone"));
                    verify_error_TelefF(TelefF);
                    break;
                case "2":

                    //Mêtodo Para Perguntar o Email do  Funcionário!!!
                    String EmailF = (JOptionPane.showInputDialog("Digita o seu Email"));
                    verify_error_EmailF(EmailF);
                    break;
                case "3":

                    //Perguntar Matricula/Atual
                    //Mêtodo Para Perguntar o Cidade do  Funcionário!!!
                    String CidadeF = (JOptionPane.showInputDialog("Digita a sua Cidade"));
                    verify_error_CidadeF(CidadeF);
                    break;
                case "4":

                    //Perguntar Matricula/Atual
                    //Mêtodo Para Perguntar o Rua da Cidade do  Funcionário!!!
                    String ruaF = (JOptionPane.showInputDialog("Digita a Rua da Cidade!"));
                    verify_error_ruaF(ruaF);
                    break;
                case "5":

                    //Perguntar Matricula/Atual
                    //Mêtodo Para Perguntar o Número do Edifício do  Funcionário!!!
                    String NumeEdifF = (JOptionPane.showInputDialog("Digite o número do Edifício"));
                    verify_error_NumeEdifF(NumeEdifF);
                    break;

            }

        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Escolha dos Dados do Funcionário que Será Atualizado!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            atual_DadosF = JOptionPane.showInputDialog("Atualização de Dados Do Funcionário!!!!\n\nPor Favor Digite a Senha do Dado que Pretendes"
                    + " Atualizar!\n=> 1-Referente ao Número de Telefone!\n=> 2-Referente "
                    + "ao Email!\n=> 3-Referente à Cidade onde Mora!\n=> 4- Referente à Rua em Concreto!\n=> 5- Referente à  Número de Edifício onde Mora!");
            correcaoF_Atual_Dados(atual_DadosF);

        }

    }

   
   
}
