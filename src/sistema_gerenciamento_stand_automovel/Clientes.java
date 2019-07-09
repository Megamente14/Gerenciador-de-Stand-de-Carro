package sistema_gerenciamento_stand_automovel;

import javax.swing.JOptionPane;

/**
 *
 * APPOLO 4
 */

// Conceito de Herança!!!!!!!!!
public final class Clientes extends Pessoa {

    protected int idade;
    private boolean estadoCadastroC;
    protected int quantidadeCliente = 25;
    Endereco endereco = new Endereco();
    
//Mêtodo Especiais-Acessores e Modificadores!!!!
    public boolean isEstadoCadastroC() {
        return estadoCadastroC;
    }

    public void setEstadoCadastroC(boolean estadoCadastroC) {
        this.estadoCadastroC = estadoCadastroC;
    }

//Metodo Construtor
    public Clientes() {
        this.setNome("Edvaldo Vicente Borges");
        this.setEstadoCadastroC(true);

    }
    // Mêtodo Contrutor - por Herança!!!!!!!!!!!!!!!!!!!

    public Clientes(String nome, String sexo, int datan, String nacionalidade, String telefone) {
        super(nome, sexo, datan, nacionalidade, telefone);
    }
    //Mêtodo Para Apresentar Idade do Funcionário!!! ///// Conceito de Polimorfismo - Mêtodo SobrePosto!!!

    @Override
    public int verify_Idade() {
        if (estadoCadastroC == true) {
            JOptionPane.showMessageDialog(null, "O Cliente Tem " + this.idade + " Anos!");

        } else {
            JOptionPane.showMessageDialog(null, "Este Cliente Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
        return 0;
    }
        //Mêtodo Para Verif....Erro da Idade Cliente!!!

    private void verify_Idade(String anoNanci) {
        int aux_Ano = 0;
        if (!anoNanci.equals("")) {
            aux_Ano = Integer.parseInt(anoNanci);
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o ano em que  Nansceu o/a Cliente/a !", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            anoNanci = (JOptionPane.showInputDialog("Digita o ano em que  Nansceu o/a Cliente/a "));
            verify_Idade(anoNanci);
        }
        if (aux_Ano > 1929 && aux_Ano < 2019) {

            idade = 2019 - aux_Ano;
            this.setAnoNancimento(idade);
        } else {
            if (this.getAnoNancimento() < 0) {
                JOptionPane.showMessageDialog(null, " Ano Invalido, Por Favor, Digite Corretamente o ano em que  Nansceu o/a Cliente/a !", "Valor Negativo!!!", JOptionPane.WARNING_MESSAGE);
                anoNanci = (JOptionPane.showInputDialog("Digita o ano em que  Nansceu o/a Cliente/a "));
                verify_Idade(anoNanci);
            }
        }

    }

    // Mêtodo para Apresentar Status do Cliente

    @Override
    public void exibir_Dados() {
        if(this.estadoCadastroC==true){
        JOptionPane.showMessageDialog(null, "Estas Cadastrado/a neste Sistema,essas são as  informações do Cliente " + this.getNome() + "\n--> Nome Completo: " + this.getNome() + "\n-->Tem " + this.getAnoNancimento()
                + " anos de idade \n-->sexo " + this.getSexo() + "\n-->Nacionalidade " + this.getNacionalidade() + "\n-->O seu Número de Tele"
                + "fone é: " + this.getTelefone() + "\n-->O seu Email é: " + this.getEmail() + "\n-->Cidade: " + this.endereco.getCidade() + "\nR"
                + "ua: " + this.endereco.getRua() + "\nNúmero de Edifício: " + this.endereco.getNumero_edificio());
    }else{
            JOptionPane.showMessageDialog(null, "Este Cliente Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Mêtodo para Adicionar Cliente
    public void adicionar_Cliente() {
        //Mêtodo Para Perguntar o Ano De Nancimento do Cliente!!!
        String anoNanci = (JOptionPane.showInputDialog("Digita o ano em que  Nansceu o/a Cliente/a "));
        verify_Idade(anoNanci);
        //Mêtodo Para Perguntar o Nome do  Cliente!!!
        String nomec = JOptionPane.showInputDialog(" Por Favor Digite o Nome Completo do/a Cliente/a");
        verify_error_nomec(nomec);
        //Mêtodo Para Perguntar a Nacionalidade  Cliente!!!
        String NacioC = (JOptionPane.showInputDialog("Por Favor Digite a sua nacionalidade"));
        verify_error_NacioC(NacioC);
        //Mêtodo Para Perguntar o Telefone Cliente!!!
        String TelefC = (JOptionPane.showInputDialog("Digita o seu número de Telefone"));
        verify_error_TelefC(TelefC);
        //Mêtodo Para Perguntar o Email do  Cliente!!!
        String EmailC = (JOptionPane.showInputDialog("Digita o seu Email"));
        verify_error_EmailC(EmailC);
        //Mêtodo Para Perguntar o Cidade do  Cliente!!!
        String CidadeC = (JOptionPane.showInputDialog("Digita a sua Cidade"));
        verify_error_CidadeC(CidadeC);
        //Mêtodo Para Perguntar o Rua da Cidade do  Cliente!!!
        String ruaC = (JOptionPane.showInputDialog("Digita a Rua da Cidade!"));
        verify_error_ruaC(ruaC);
        //Mêtodo Para Perguntar o Número do Edifício do  Cliente!!!
        String NumeEdifC = (JOptionPane.showInputDialog("Digite o número do Edifício"));
        verify_error_NumeEdifC(NumeEdifC);
        //Mêtodo Para Perguntar o Gênero do  Cliente!!!
        String GeneroC = JOptionPane.showInputDialog("Quanto ao sexo, Digite 1 para Másculino,ou Digite 2 para Feminino !");
        verify_error_GeneroC(GeneroC);
        JOptionPane.showMessageDialog(null, "Estas Cadastrado/a neste Sistema,essas são as  informações do Cliente " + this.getNome() + "\n--> Nome Completo: " + this.getNome() + "\n-->Tem " + this.getAnoNancimento()
                + " anos de idade \n-->sexo " + this.getSexo() + "\n-->Nacionalidade " + this.getNacionalidade() + "\n-->O seu Número de Tele"
                + "fone é: " + this.getTelefone() + "\n-->O seu Email é: " + this.getEmail() + "\n-->Cidade: " + this.endereco.getCidade() + "\nR"
                + "ua: " + this.endereco.getRua() + "\nNúmero de Edifício: " + this.endereco.getNumero_edificio());
        this.estadoCadastroC = true;
        this.quantidadeCliente += 1;
        JOptionPane.showMessageDialog(null, " Agora Existe " + this.quantidadeCliente + " Funcionário na Stand!", "ANÚNCIO!", JOptionPane.INFORMATION_MESSAGE);

    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    //Mêtodo Para Verif....Erro do Nome do Cliente!!!
    private void verify_error_nomec(String nomec) {
        if (!nomec.equals("")) {
            this.setNome(nomec);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Nome Deste Cliente!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            nomec = JOptionPane.showInputDialog(" Por Favor Digite o Nome Completo do/a Cliente/a");
            verify_error_nomec(nomec);
        }
    }

    //Mêtodo Para Verif....Erro do Nacionalidade do Cliente!!!
    private void verify_error_NacioC(String NacioC) {
        if (!NacioC.equals("")) {
            this.setNacionalidade(NacioC);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente a Nacionalidade Deste Cliente!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            NacioC = (JOptionPane.showInputDialog("Por Favor Digite a sua nacionalidade"));
            verify_error_NacioC(NacioC);
        }
    }

    //Mêtodo Para Verif....Erro do Telefone do Cliente!!!
    private void verify_error_TelefC(String TelefC) {
        if (!TelefC.equals("")) {
            this.setTelefone(TelefC);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Telefone Deste Cliente!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            TelefC = (JOptionPane.showInputDialog("Digita o seu número de Telefone"));
            verify_error_TelefC(TelefC);
        }
    }

    //Mêtodo Para Verif....Erro do Email do Cliente!!!
    private void verify_error_EmailC(String EmailC) {
        if (!EmailC.equals("")) {
            this.setEmail(EmailC);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Email Deste Cliente!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            EmailC = (JOptionPane.showInputDialog("Digita o seu Email"));
            verify_error_EmailC(EmailC);
        }
    }

    //Mêtodo Para Verif....Erro do Cidade do Cliente!!!
    private void verify_error_CidadeC(String CidadeC) {
        if (!CidadeC.equals("")) {
            this.endereco.setCidade(CidadeC);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Cidade Deste Cliente!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            CidadeC = (JOptionPane.showInputDialog("Digita a sua Cidade"));
            verify_error_CidadeC(CidadeC);
        }
    }

    //Mêtodo Para Verif....Erro do Rua Da Cidade do Cliente!!!
    private void verify_error_ruaC(String ruaC) {
        if (!ruaC.equals("")) {
            this.endereco.setRua(ruaC);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente a Rua da Cidade Deste Cliente!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            ruaC = (JOptionPane.showInputDialog("Digita a Rua da Cidade!"));
            verify_error_ruaC(ruaC);
        }
    }
//Mêtodo Para Verif....Erro do Rua Da Cidade do Cliente!!!

    private void verify_error_NumeEdifC(String NumeEdifC) {
        if (!NumeEdifC.equals("")) {
            this.endereco.setNumero_edificio(NumeEdifC);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Número do Edifício Deste Cliente!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
            NumeEdifC = (JOptionPane.showInputDialog("Digite o número do Edifício"));
            verify_error_NumeEdifC(NumeEdifC);
        }
    }

    //Verifi..Erro no Gênero do Cliente!!!
    private void verify_error_GeneroC(String GeneroC) {
        if (GeneroC.equalsIgnoreCase("1") || GeneroC.equalsIgnoreCase("2")) {
            if (GeneroC.equalsIgnoreCase("1")) {
                this.setSexo("Masculino");
            } else {
                if (GeneroC.equalsIgnoreCase("2")) {
                    this.setSexo("Feminino");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Definição do Gênero do Cliente!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção
            GeneroC = JOptionPane.showInputDialog("Quanto ao sexo, Digite 1 para Másculino,ou Digite 2 para Feminino !");
            verify_error_GeneroC(GeneroC);
        }
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Mêtodo para Remover Cliente
    public void remover_Cliente() {
        if (estadoCadastroC == true) {
            this.estadoCadastroC = false;
            this.quantidadeCliente -= 1;
            JOptionPane.showMessageDialog(null, " Agora Passou a Existir " + this.quantidadeCliente + " Cliente no Sistema da Stand!", "ANÚNCIO!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Este Cliente Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }

    }

    // Mêtodo para Atualizar Dados do  Cliente
    public void AtualizarDado_Cliente() {
         if (this.estadoCadastroC == true) {
            String atual_DadosC = JOptionPane.showInputDialog("Atualização de Dados Do Cliente!!!!\n\nPor Favor Digite a Senha do Dado que Pretendes"
                    + " Atualizar!\n=> 1-Referente ao Número de Telefone!\n=> 2-Referente "
                    + "ao Email!\n=> 3-Referente à Cidade onde Mora!\n=> 4- Referente à Rua em Concreto!\n=> 5- Referente à  Número de Edifício onde Mora!");
            correcaoC_Atual_Dados(atual_DadosC);
            JOptionPane.showMessageDialog(null, "Estas Cadastrado/a neste Sistema,essas são as  informações do Cliente " + this.getNome() + "\n--> Nome Completo: " + this.getNome() + "\n-->Tem " + this.getAnoNancimento()
                + " anos de idade \n-->sexo " + this.getSexo() + "\n-->Nacionalidade " + this.getNacionalidade() + "\n-->O seu Número de Tele"
                + "fone é: " + this.getTelefone() + "\n-->O seu Email é: " + this.getEmail() + "\n-->Cidade: " + this.endereco.getCidade() + "\nR"
                + "ua: " + this.endereco.getRua() + "\nNúmero de Edifício: " + this.endereco.getNumero_edificio());
        } else {
            JOptionPane.showMessageDialog(null, "Este Cliente Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
        

    }
    
    //Mêtodo Para Correção para Atualizar OU Editar Dados!!! 
    private void correcaoC_Atual_Dados(String atual_DadosC) {

        if (atual_DadosC.equals("1") || atual_DadosC.equals("2") || atual_DadosC.equals("3") || atual_DadosC.equals("4") || atual_DadosC.equals("5")) {
            switch (atual_DadosC) {
                case "1":
                    //Mêtodo Para Perguntar o Telefone Funcionário!!!
                    String TelefC = (JOptionPane.showInputDialog("Digita o seu número de Telefone"));
                    verify_error_TelefC(TelefC);
                    break;
                case "2":

                    //Mêtodo Para Perguntar o Email do  Funcionário!!!
                    String EmailC = (JOptionPane.showInputDialog("Digita o seu Email"));
                    verify_error_EmailC(EmailC);
                    break;
                case "3":

                    //Perguntar Matricula/Atual
                    //Mêtodo Para Perguntar o Cidade do  Funcionário!!!
                    String CidadeC = (JOptionPane.showInputDialog("Digita a sua Cidade"));
                    verify_error_CidadeC(CidadeC);
                    break;
                case "4":

                    //Perguntar Matricula/Atual
                    //Mêtodo Para Perguntar o Rua da Cidade do  Funcionário!!!
                    String ruaC = (JOptionPane.showInputDialog("Digita a Rua da Cidade!"));
                    verify_error_ruaC(ruaC);
                    break;
                case "5":

                    //Perguntar Matricula/Atual
                    //Mêtodo Para Perguntar o Número do Edifício do  Funcionário!!!
                    String NumeEdifC = (JOptionPane.showInputDialog("Digite o número do Edifício"));
                    verify_error_NumeEdifC(NumeEdifC);
                    break;

            }

        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Escolha dos Dados do Cliente que Será Atualizado!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            atual_DadosC = JOptionPane.showInputDialog("Atualização de Dados Do Cliente!!!!\n\nPor Favor Digite a Senha do Dado que Pretendes"
                    + " Atualizar!\n=> 1-Referente ao Número de Telefone!\n=> 2-Referente "
                    + "ao Email!\n=> 3-Referente à Cidade onde Mora!\n=> 4- Referente à Rua em Concreto!\n=> 5- Referente à  Número de Edifício onde Mora!");
            correcaoC_Atual_Dados(atual_DadosC);

        }

    }

}
