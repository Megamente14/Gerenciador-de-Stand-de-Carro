package sistema_gerenciamento_stand_automovel;

import javax.swing.JOptionPane;

/**
 *
 * @author GRUPO  APOLLO 4
 */
public final  class Carros extends AcessorioCarro {

    private String marca;
    private String cor;
    private String matricula;
    private String caixa_velocidade;
    private String caixa_transmissao;
    private String Categoria;
    private String tipo_combustivel;
    private String estadoCarro;
    private boolean estadoCadastro;
    private String Modelo_Carro;
    protected double precoCarro_Venda;
    protected double precoCarro_Aluguer;
    protected double precoCarro_Lising;
    protected int carro_Quantidade = 100;
//Metodo Construtor
    public Carros() {
this.setMatricula("45 - 78 K");
this.setEstadoCadastro(true);
    }

    public String getModelo_Carro() {
        return Modelo_Carro;
    }

    public void setModelo_Carro(String Modelo_Carro) {
        this.Modelo_Carro = Modelo_Carro;
    }

    public boolean isEstadoCadastro() {
        return estadoCadastro;
    }

    public void setEstadoCadastro(boolean estadoCadastro) {
        this.estadoCadastro = estadoCadastro;
    }

    public String getEstadoCarro() {
        return estadoCarro;
    }

    public void setEstadoCarro(String estadoCarro) {
        this.estadoCarro = estadoCarro;
    }

    public String getCaixa_velocidade() {
        return caixa_velocidade;
    }

    public void setCaixa_velocidade(String caixa_velocidade) {
        this.caixa_velocidade = caixa_velocidade;
    }

    public String getCaixa_transmissao() {
        return caixa_transmissao;
    }

    public void setCaixa_transmissao(String caixa_transmissao) {
        this.caixa_transmissao = caixa_transmissao;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void adicionar_Carro() {
        this.setEstadoCadastro(true);
        //Perguntar Estado
        String estado = JOptionPane.showInputDialog("Digite [N] se o Carro for [Novo], ou Digite [U] se for [Usado]!");
        verify_error_Estado(estado);
        //Perguntar Estado/Correção  
        String correcaoEstado = JOptionPane.showInputDialog("Para Confirmar, O Estado do Carro é " + this.getEstadoCarro() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoEstado(correcaoEstado);

        //Perguntar Marca-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String Marca = JOptionPane.showInputDialog("Por Favor Escolha a Marca do Carro:\n|=> 1 ALPHA ROMEO          |=> 19 LAMBORGUINI           |=> 37 VOLVO\n|=> 2 ACURA       "
                + "                  |=> 20 LEXUS                         |=> 38 VOLZER\n|=> 3 AUDI                             |=> 21 LIMMORZINI                |=> 39 X-TROJAN\n|=> 4 BUGATTI                      |=> 22 LOTUS                         |=> 40 Outros!"
                + "\n|=> 5 "
                + "BMW                            |=> 23 MAZDA \n|=> 6 CHEVROLET               |=> 24 MERCEDES \n|=> 7 CHRYSLER                  |=> 25 MITSUBSHI \n|=> 8 DAFRA                          |=> 26 NISSAN  \n|=> 9 DODGE                         |=> 27 PAGUANI  "
                + " \n|=> 10 DAIHATSU                 |=> 28 PEUGEOT \n|=> 11 FERRARI                    |=> 29 PORCHE \n|=> 12 FIAT                            |=> 30 RENAULT \n|=> 13 FORD                          |=> 31 ROVER"
                + "\n|=> 14 HONDA                       |=> 32 SEAT \n|=> 15 HYUNDAI                    |=> 33 SKODA \n|=> 16 JAGUAR                     |=> 34 SUBARU \n|=> 17 JEEP                           |=> 35 TOYOTA \n|=> 18 KIA                              |=> 36 VOLKSWAGEM ");
        verify_error_Marca(Marca);
        //Perguntar Marca/Correção
        String correcaoMarca = JOptionPane.showInputDialog("Para Confirmar, a Marca do Carro é " + this.getMarca() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoMarca(correcaoMarca);

        //Perguntar Modelo------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        this.setModelo_Carro(JOptionPane.showInputDialog("Digite o Modelo Do Carro Para esta Marca!"));
        verify_error_Modelo(this.getModelo_Carro());
        //Perguntar Modelo/Correção
        String correcaoModelo = JOptionPane.showInputDialog("Para Confirmar, o Modelo do Carro é " + this.getModelo_Carro() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoModelo(correcaoModelo);

        //Perguntar Cor---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String Cor = JOptionPane.showInputDialog("Qual a Cor Do Carro: \n|=> 1-Amarelo\n|=> 2-Azul\n|=> 3-Branco\n|=> 4-Cizento\n|=>"
                + " 5-Preto\n|=> 6- Rosa\n|=> 7-Verde\n|=> 8-Vermelho\n|=> 9-Violeta\n|=> 10- Outros!!!!");

        verify_error_Cor(Cor);
        //Perguntar Cor/CorreÇão
        String correcaoCor = JOptionPane.showInputDialog("Para Confirmar, a Cor do Carro é " + this.getCor() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoCor(correcaoCor);

        //Perguntar Combustivel------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String Combustivel = JOptionPane.showInputDialog("Quanto ao Tipo de Combustível:\nDigite 1 para [Gasolína];\nDigite "
                + "2 para [Gasóleo];\nDigite 3 se for [Eléctrico];\nOu Digite 4 se for [Mista] ");
        verify_error_Combustivel(Combustivel);
        //Perguntar Combustivel/Correção
        String correcaoCombustivel = JOptionPane.showInputDialog("Para Confirmar, O Combustível do Carro é " + this.getTipo_combustivel() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoCombustivel(correcaoCombustivel);

        //Perguntar Categória------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String Categoria = JOptionPane.showInputDialog("Quanto a Categória do Carro,\nDigite 1 para [Ligeiro];\nDigite 2 para [Pesado]\nDigite"
                + " 3 se For [Ligeiro/Luxuoso];\nDigite 4 se For [Pesado/Luxuoso]");
        verify_error_Categoria(Categoria);
        //Perguntar Categória/Correção
        String correcaoCategoria = JOptionPane.showInputDialog("Para Confirmar, A Categoria do Carro é " + this.getCategoria() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoCategoria(correcaoCategoria);

        //Perguntar Caixa de Velocidade-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        this.setCaixa_velocidade(JOptionPane.showInputDialog("Digite o limite da Velocidade do Carro!"));
        verify_error_CaixaVelocidade(this.getCaixa_velocidade());
        //Perguntar Caixa de Velocidade/Correção
        String correcaoCaixaVelocidade = JOptionPane.showInputDialog("Para Confirmar, a Velocidade Maxima do Carro é de " + this.getCaixa_velocidade() + "Km/h!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoCaixaVelocidade(correcaoCaixaVelocidade);

        //Perguntar Caixa de Transmissao------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        String Ctransmisao = JOptionPane.showInputDialog("Quanto a Caixa de Transmissão:\nDigite 1, caso a Caixa de Transmisão for"
                + " [Manual]\nDigite 2, caso a Caixa de Transmisão for [Automática]");
        verify_error_Ctransmisao(Ctransmisao);
        //Perguntar Caixa de Transmissao/Correção
        String correcaoCaixaTransmissao = JOptionPane.showInputDialog("Para Confirmar, a Caixa de Transmissão do Carro é " + this.getCaixa_transmissao() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoCaixaTransmissao(correcaoCaixaTransmissao);

        //Perguntar Matricula------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        this.setMatricula(JOptionPane.showInputDialog("Digite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
        verify_error_Matricula(this.getMatricula());
        //Perguntar Matricula/Correção
        String correcaoMatricula = JOptionPane.showInputDialog("Para Confirmar, a Matricula do Carro é STP " + this.getMatricula() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
        verify_error_correcaoMatricula(correcaoMatricula);

        JOptionPane.showMessageDialog(
                null, "\n--------------------------------------------------------------------------------------------------------------------------------------------------------------\nO Carro está Cadastrado no Sistema, e suas informações são:\n|=> Este Carro é:-------------------------------------------------------------------------------------------------------=>| " + this.getEstadoCarro() + " |\n\n|=> A Marca "
                + "do Carro é:---------------------------------------------------------------------------------------------=>| " + this.getMarca() + " |\n\n|=> O Modelo do Carro é:-------------------------------------------------------------------------------------------=>| " + this.getModelo_Carro() + " |\n\n|=> A Cor do Carro"
                + " é:-------------------------------------------------------------------------------------------------=>| " + this.getCor() + " |\n\n|=> O Tipo de Combustível deste Carro é:---------------------------------------------------------------------=>| " + this.getTipo_combustivel() + " |\n\n|=> A Caixa de Transmisão "
                + "deste Carro é:-------------------------------------------------------------------=>| " + this.getCaixa_transmissao() + " |\n\n|=> A Velocidade Total deste Carro é:--------------------------------------------------------------------------=>| " + this.getCaixa_velocidade() + " Km/h |\n\n|=> Quanto a categória do Carro, este"
                + " Carro é do tipo:---------------------------------------------------=>| " + this.getCategoria() + " |\n\n|=> O número da Chapa Matrícula é:----------------------------------------------------------------------------=>| STP " + this.getMatricula() + " |\n\n--------------------------------------------------------------------------------------------------------------------------------------------------------------\n");

        this.setEstadoCadastro(true);
        this.carro_Quantidade += 1;
        JOptionPane.showMessageDialog(null, " Agora Existe " + this.carro_Quantidade + " Carros no STOCK da Stand!", "ANÚNCIO!", JOptionPane.INFORMATION_MESSAGE);
    }
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
    //-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Verifi..Erro Estado!!!
    private void verify_error_Estado(String estado) {
        if (estado.equalsIgnoreCase("n") || estado.equalsIgnoreCase("u")) {
            if (estado.equalsIgnoreCase("n")) {
                this.setEstadoCarro(" [Novo]");
            } else {
                if (estado.equalsIgnoreCase("u")) {
                    this.setEstadoCarro(" [Usado]");
                }

            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Definição do Estado do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro
            estado = JOptionPane.showInputDialog("Digite [N] se o Carro for [Novo], ou Digite [U] se for [Usado]!");
            verify_error_Estado(estado);
        }
    }

    //Verifi..Erro correçãoEstado!!!
    private void verify_error_correcaoEstado(String correcaoEstado) {
        if (correcaoEstado.equalsIgnoreCase("1") || correcaoEstado.equalsIgnoreCase("2")) {
            if (correcaoEstado.equalsIgnoreCase("1")) {
                this.setEstadoCarro(this.getEstadoCarro());
            } else {
                if (correcaoEstado.equalsIgnoreCase("2")) {
                    String estado = JOptionPane.showInputDialog("CORREÇÃO\n\nDigite [N] se o Carro for [Novo], ou Digite [U] se for [Usado]!");
                    verify_error_Estado(estado);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção do Estado do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção
            correcaoEstado = JOptionPane.showInputDialog("Para Confirmar,O Estado do Carro é " + this.getEstadoCarro() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoEstado(correcaoEstado);
        }
    }
//Verifi..Erro Marca!!!

    private void verify_error_Marca(String Marca) {

        if (Marca.equals("1") || Marca.equals("2") || Marca.equals("3") || Marca.equals("4")
                || Marca.equals("5") || Marca.equals("6") || Marca.equals("7") || Marca.equals("8")
                || Marca.equals("9") || Marca.equals("10") || Marca.equals("11") || Marca.equals("12")
                || Marca.equals("13") || Marca.equals("14") || Marca.equals("15") || Marca.equals("16")
                || Marca.equals("17") || Marca.equals("18") || Marca.equals("19") || Marca.equals("20")
                || Marca.equals("21") || Marca.equals("22") || Marca.equals("23") || Marca.equals("24")
                || Marca.equals("25") || Marca.equals("26") || Marca.equals("27") || Marca.equals("28")
                || Marca.equals("29") || Marca.equals("30") || Marca.equals("31") || Marca.equals("32")
                || Marca.equals("33") || Marca.equals("34") || Marca.equals("35") || Marca.equals("36")
                || Marca.equals("37") || Marca.equals("38") || Marca.equals("39") || Marca.equals("40")) {
            switch (Marca) {
                case "1":
                    this.setMarca("ALPHA ROMEO");
                    break;
                case "2":
                    this.setMarca("ACURA");
                    break;
                case "3":
                    this.setMarca("AUDI");
                    break;
                case "4":
                    this.setMarca("BUGATTI");
                    break;
                case "5":
                    this.setMarca("BMW");
                    break;
                case "6":
                    this.setMarca("CHEVROLET");
                    break;
                case "7":
                    this.setMarca("CHRYSLER");
                    break;
                case "8":
                    this.setMarca("DAFRA");
                    break;
                case "9":
                    this.setMarca("DODGE");
                    break;
                case "10":
                    this.setMarca("DAIHATSU");
                    break;
                case "11":
                    this.setMarca("FERRARI");
                    break;
                case "12":
                    this.setMarca("FIAT");
                    break;
                case "13":
                    this.setMarca("FORD");
                    break;
                case "14":
                    this.setMarca("HONDA");
                    break;
                case "15":
                    this.setMarca("HYUNDAI");
                    break;

                case "16":
                    this.setMarca("JAGUAR");
                    break;
                case "17":
                    this.setMarca("JEEP");
                    break;
                case "18":
                    this.setMarca("KIA");
                    break;
                case "19":
                    this.setMarca("LAMBORGUINI");
                    break;
                case "20":
                    this.setMarca("LEXUS");
                    break;
                case "21":
                    this.setMarca("LIMMORZINI");
                    break;
                case "22":
                    this.setMarca("LOTUS");
                    break;
                case "23":
                    this.setMarca("MAZDA");
                    break;
                case "24":
                    this.setMarca("MERCEDES");
                    break;
                case "25":
                    this.setMarca("MITSUBSHI");
                    break;
                case "26":
                    this.setMarca("NISSAN");
                    break;
                case "27":
                    this.setMarca("PAGUANI");
                    break;
                case "28":
                    this.setMarca("PEUGEOT");
                    break;
                case "29":
                    this.setMarca("PORCHE");
                    break;
                case "30":
                    this.setMarca("RENAULT");
                    break;
                case "31":
                    this.setMarca("ROVER");
                    break;
                case "32":
                    this.setMarca("SEAT");
                    break;
                case "33":
                    this.setMarca("SKODA");
                    break;
                case "34":
                    this.setMarca("SUBARU");
                    break;
                case "35":
                    this.setMarca("TOYOTA");
                    break;
                case "36":
                    this.setMarca("VOLKSWAGEM");
                    break;
                case "37":
                    this.setMarca("VOLVO");
                    break;
                case "38":
                    this.setMarca("VOLZER");
                    break;
                case "39":
                    this.setMarca("X-TROJAN");
                    break;
                case "40":
                    String vcMarca2 = (JOptionPane.showInputDialog("Para este Caso, Digite  Marca do Carro Predefinida!"));
                    verify_error_vcMarca2(vcMarca2);
                    break;
            }
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Definição da Marca do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            Marca = JOptionPane.showInputDialog("Por Favor Escolha a Marca do Carro:\n|=> 1 ALPHA ROMEO          |=> 19 LAMBORGUINI           |=> 37 VOLVO\n|=> 2 ACURA       "
                    + "                  |=> 20 LEXUS                         |=> 38 VOLZER\n|=> 3 AUDI                             |=> 21 LIMMORZINI                |=> 39 X-TROJAN\n|=> 4 BUGATTI                      |=> 22 LOTUS                         |=> 40 Outros!"
                    + "\n|=> 5 "
                    + "BMW                            |=> 23 MAZDA \n|=> 6 CHEVROLET               |=> 24 MERCEDES \n|=> 7 CHRYSLER                  |=> 25 MITSUBSHI \n|=> 8 DAFRA                          |=> 26 NISSAN  \n|=> 9 DODGE                         |=> 27 PAGUANI  "
                    + " \n|=> 10 DAIHATSU                 |=> 28 PEUGEOT \n|=> 11 FERRARI                    |=> 29 PORCHE \n|=> 12 FIAT                            |=> 30 RENAULT \n|=> 13 FORD                          |=> 31 ROVER"
                    + "\n|=> 14 HONDA                       |=> 32 SEAT \n|=> 15 HYUNDAI                    |=> 33 SKODA \n|=> 16 JAGUAR                     |=> 34 SUBARU \n|=> 17 JEEP                           |=> 35 TOYOTA \n|=> 18 KIA                              |=> 36 VOLKSWAGEM ");
            verify_error_Marca(Marca);
        }

    }

    //Verifi..Erro correcaoMarca!!!
    private void verify_error_correcaoMarca(String correcaoMarca) {
        if (correcaoMarca.equalsIgnoreCase("1") || correcaoMarca.equalsIgnoreCase("2")) {
            if (correcaoMarca.equalsIgnoreCase("1")) {
                this.setMarca(this.getMarca());
            } else {
                if (correcaoMarca.equalsIgnoreCase("2")) {
                    String Marca = JOptionPane.showInputDialog("CORREÇÃO\n\nPor Favor Escolha a Marca do Carro:\n|=> 1 ALPHA ROMEO          |=> 19 LAMBORGUINI           |=> 37 VOLVO\n|=> 2 ACURA       "
                            + "                  |=> 20 LEXUS                         |=> 38 VOLZER\n|=> 3 AUDI                             |=> 21 LIMMORZINI                |=> 39 X-TROJAN\n|=> 4 BUGATTI                      |=> 22 LOTUS                         |=> 40 Outros!"
                            + "\n|=> 5 "
                            + "BMW                            |=> 23 MAZDA \n|=> 6 CHEVROLET               |=> 24 MERCEDES \n|=> 7 CHRYSLER                  |=> 25 MITSUBSHI \n|=> 8 DAFRA                          |=> 26 NISSAN  \n|=> 9 DODGE                         |=> 27 PAGUANI  "
                            + " \n|=> 10 DAIHATSU                 |=> 28 PEUGEOT \n|=> 11 FERRARI                    |=> 29 PORCHE \n|=> 12 FIAT                            |=> 30 RENAULT \n|=> 13 FORD                          |=> 31 ROVER"
                            + "\n|=> 14 HONDA                       |=> 32 SEAT \n|=> 15 HYUNDAI                    |=> 33 SKODA \n|=> 16 JAGUAR                     |=> 34 SUBARU \n|=> 17 JEEP                           |=> 35 TOYOTA \n|=> 18 KIA                              |=> 36 VOLKSWAGEM ");
                    verify_error_Marca(Marca);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção da Marca do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção  For Exception Case!
            correcaoMarca = JOptionPane.showInputDialog("Para Confirmar,A Marca do Carro é " + this.getMarca() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoMarca(correcaoMarca);
        }
    }
    //Verifi..Erro Marca 2!!!

    private void verify_error_vcMarca2(String vcMarca2) {
        if (!vcMarca2.equals("")) {
            this.setMarca(vcMarca2);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente a Marca deste Carro para esta Marca!", "ESPAÇO VAZIO!!!!", JOptionPane.WARNING_MESSAGE);

            vcMarca2 = (JOptionPane.showInputDialog("Para este Caso, Digite  Marca do Carro Predefinida!"));
            verify_error_vcMarca2(vcMarca2);
        }

    }

//Verifi..Erro Modelo!!!
    private void verify_error_Modelo(String modelo) {
        if (!this.getModelo_Carro().equals("")) {
            this.setModelo_Carro(this.getModelo_Carro());
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Modelo deste Carro para esta Marca!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);

            this.setModelo_Carro(JOptionPane.showInputDialog("Digite o Modelo Do Carro Para esta Marca!"));
            verify_error_Modelo(this.getModelo_Carro());
        }

    }
    //Verifi..Erro Modelo/Correção!!!

    private void verify_error_correcaoModelo(String correcaoModelo) {
        if (correcaoModelo.equalsIgnoreCase("1") || correcaoModelo.equalsIgnoreCase("2")) {
            if (correcaoModelo.equalsIgnoreCase("1")) {
                this.setModelo_Carro(this.getModelo_Carro());
            } else {
                if (correcaoModelo.equalsIgnoreCase("2")) {
                    this.setModelo_Carro(JOptionPane.showInputDialog("CORRECÃO\n\nDigite o Modelo Do Carro Para esta Marca!"));
                    verify_error_Modelo(this.getModelo_Carro());
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção do Modelo do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção For Exception Case!
            correcaoModelo = JOptionPane.showInputDialog("Para Confirmar,O Modelo do Carro é " + this.getModelo_Carro() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoModelo(correcaoModelo);
        }
    }

//Verifi..Erro Cor!!!
    private void verify_error_Cor(String Cor) {
        if (Cor.equals("1") || Cor.equals("2") || Cor.equals("3")
                || Cor.equals("4") || Cor.equals("5") || Cor.equals("6")
                || Cor.equals("7") || Cor.equals("8") || Cor.equals("9") || Cor.equals("10")) {
            switch (Cor) {
                case "1":
                    this.setCor("Amarelo");
                    break;
                case "2":
                    this.setCor("Azul");
                case "3":
                    this.setCor("Branco");
                    break;
                case "4":
                    this.setCor("Cizento");
                    break;
                case "5":
                    this.setCor("Preto");
                    break;
                case "6":
                    this.setCor("Rosa");
                    break;
                case "7":
                    this.setCor("Verde");
                    break;
                case "8":
                    this.setCor("Vermelho");
                    break;
                case "9":
                    this.setCor("Violeta");
                    break;
                case "10":
                    String vcCor2 = JOptionPane.showInputDialog("Para este Caso, Digite a Cor deste Carro Predefinida!");
                    verify_error_vcCor2(vcCor2);
                    break;

            }

        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Definição da Cor deste Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            Cor = JOptionPane.showInputDialog("Qual a Cor Do Carro: \n|=> 1-Amarelo\n|=> 2-Azul\n|=> 3-Branco\n|=> 4-Cizento\n|=>"
                    + " 5-Preto\n|=> 6- Rosa\n|=> 7-Verde\n|=> 8-Vermelho\n|=> 9-Violeta\n|=> 10- Outros!!!!");
            verify_error_Cor(Cor);
        }
    }

    //Verifi..Erro Cor/Correção!!!
    private void verify_error_correcaoCor(String correcaoCor) {
        if (correcaoCor.equalsIgnoreCase("1") || correcaoCor.equalsIgnoreCase("2")) {
            if (correcaoCor.equalsIgnoreCase("1")) {
                this.setCor(this.getCor());
            } else {
                if (correcaoCor.equalsIgnoreCase("2")) {
                    String Cor = JOptionPane.showInputDialog("CORREÇÃO\n\nQual a Cor Do Carro: \n|=> 1-Amarelo\n|=> 2-Azul\n|=> 3-Branco\n|=> 4-Cizento\n|=>"
                            + " 5-Preto\n|=> 6- Rosa\n|=> 7-Verde\n|=> 8-Vermelho\n|=> 9-Violeta\n|=> 10- Outros!!!!");
                    verify_error_Cor(Cor);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção da Cor do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção For Exception Case!
            correcaoCor = JOptionPane.showInputDialog("Para Confirmar,A Cor do Carro é " + this.getCor() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoCor(correcaoCor);
        }
    }
    //Verifi..Erro Cor 2!!!

    private void verify_error_vcCor2(String vcCor2) {
        if (!vcCor2.equals("")) {
            this.setCor(vcCor2);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente a Cor deste Carro !", "ESPAÇO VAZIO!!!!", JOptionPane.WARNING_MESSAGE);

            vcCor2 = (JOptionPane.showInputDialog("Para este Caso, Digite a Cor do Carro Predefinido!"));
            verify_error_vcCor2(vcCor2);
        }

    }

//Verifi..Erro Combustivel!!!
    private void verify_error_Combustivel(String Combustivel) {
        if (Combustivel.equals("1") || Combustivel.equals("2")
                || Combustivel.equals("3") || Combustivel.equals("4") || Combustivel.equals("5")) {
            switch (Combustivel) {
                case "1":
                    this.setTipo_combustivel("Gasolína");
                    break;
                case "2":
                    this.setTipo_combustivel("Gasóleo");
                    break;
                case "3":
                    this.setTipo_combustivel("Elétrico");
                    break;
                case "4":
                    String vcCombusti2 = (JOptionPane.showInputDialog("Para este Caso,\n Digite 1 se for [Gasolína/Elétrico];\nDigite 2 se for "
                            + "[Gasóleo/Elétrico];\nDigite 3  para Outros!"));
                    verify_error_vcCombusti2(vcCombusti2);
                    switch (vcCombusti2) {
                        case "1":
                            this.setTipo_combustivel("[Gasolína/Elétrico]");
                            break;
                        case "2":
                            this.setTipo_combustivel("[Gasóleo/Elétrico]");
                            break;
                        case "3":
                            String vcCombusti22 = (JOptionPane.showInputDialog("Então Digite o tipo de Combustível de Carro"));
                            verify_error_vcCombusti22(vcCombusti22);
                            break;

                    }
            }
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Definição do Combustível deste Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            Combustivel = JOptionPane.showInputDialog("Quanto ao Tipo de Combustível:\nDigite 1 para [Gasolína];\nDigite "
                    + "2 para [Gasóleo];\nDigite 3 se for [Eléctrico];\nOu Digite 4 se for [Mista] ");
            verify_error_Combustivel(Combustivel);
        }
    }
    //Verifi..Erro Combustivel 2!!!

    private void verify_error_vcCombusti2(String vcCombusti2) {
        if (vcCombusti2.equals("1") || vcCombusti2.equals("2") || vcCombusti2.equals("3")) {
            switch (vcCombusti2) {
                case "1":
                    this.setTipo_combustivel("[Gasolína/Elétrico]");
                    break;
                case "2":
                    this.setTipo_combustivel("[Gasóleo/Elétrico]");
                    break;
                case "3":
                    this.setTipo_combustivel(JOptionPane.showInputDialog("Então Digite o tipo de Combustível de Carro"));
                    break;
            }
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Codigo para Escolha!", "ESPAÇO VAZIO!!!!", JOptionPane.WARNING_MESSAGE);

            vcCombusti2 = (JOptionPane.showInputDialog("Para este Caso,\n Digite 1 se for [Gasolína/Elétrico];\nDigite 2 se for "
                    + "[Gasóleo/Elétrico];\nDigite 3  para Outros!"));
            verify_error_vcCombusti2(vcCombusti2);
        }

    }
    //Verifi..Erro Combustivel 2.2!!!

    private void verify_error_vcCombusti22(String vcCombusti22) {
        if (!vcCombusti22.equals("")) {
            this.setTipo_combustivel(vcCombusti22);
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o combustível deste Carro !", "ESPAÇO VAZIO!!!!", JOptionPane.WARNING_MESSAGE);

            vcCombusti22 = (JOptionPane.showInputDialog("Para este Caso, Digite  Combustível do Carro Predefinido!"));
            verify_error_vcCombusti22(vcCombusti22);
        }

    }

    //Verifi..Erro Combustivel/Correção!!!
    private void verify_error_correcaoCombustivel(String correcaoCombustivel) {
        if (correcaoCombustivel.equalsIgnoreCase("1") || correcaoCombustivel.equalsIgnoreCase("2")) {
            if (correcaoCombustivel.equalsIgnoreCase("1")) {
                this.setTipo_combustivel(this.getTipo_combustivel());
            } else {
                if (correcaoCombustivel.equalsIgnoreCase("2")) {
                    String Combustivel = JOptionPane.showInputDialog("CORREÇÃO\n\nQuanto ao Tipo de Combustível:\nDigite 1 para [Gasolína];\nDigite "
                            + "2 para [Gasóleo];\nDigite 3 se for [Eléctrico];\nOu Digite 4 se for [Mista] ");
                    verify_error_Combustivel(Combustivel);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção do Combustivel  do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção For Exception Case!
            correcaoCombustivel = JOptionPane.showInputDialog("Para Confirmar, O Combustivel do Carro é " + this.getTipo_combustivel() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoCombustivel(correcaoCombustivel);
        }
    }

//Verifi..Erro Categoria!!!
    private void verify_error_Categoria(String Categoria) {
        if (Categoria.equals("1") || Categoria.equals("2") || Categoria.equals("3")
                || Categoria.equals("4")) {
            switch (Categoria) {
                case "1":
                    this.setCategoria("[Ligeiro]");
                    break;
                case "2":
                    this.setCategoria("[Pesado]");
                    break;
                case "3":
                    this.setCategoria("[Ligeiro/Luxuoso]");
                    break;
                case "4":
                    this.setCategoria("[pesado/Luxuoso]");
                    break;

            }

        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Definição da Categória deste Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            Categoria = JOptionPane.showInputDialog("Quanto a Categória do Carro,\nDigite 1 para [Ligeiro];\nDigite 2 para [Pesado]\nDigite"
                    + " 3 se For [Ligeiro/Luxuoso];\nDigite 4 se For [Pesado/Luxuoso]");
            verify_error_Categoria(Categoria);

        }
    }

    //Verifi..Erro Categoria!!!/Correção
    private void verify_error_correcaoCategoria(String correcaoCategoria) {
        if (correcaoCategoria.equalsIgnoreCase("1") || correcaoCategoria.equalsIgnoreCase("2")) {
            if (correcaoCategoria.equalsIgnoreCase("1")) {
                this.setCategoria(this.getCategoria());
            } else {
                if (correcaoCategoria.equalsIgnoreCase("2")) {
                    String Categoria = JOptionPane.showInputDialog("CORREÇÃO\n\nQuanto a Categória do Carro,\nDigite 1 para [Ligeiro];\nDigite 2 para [Pesado]\nDigite"
                            + " 3 se For [Ligeiro/Luxuoso];\nDigite 4 se For [Pesado/Luxuoso]");
                    verify_error_Categoria(Categoria);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção da Categória  do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção For Exception Case!
            correcaoCategoria = JOptionPane.showInputDialog("Para Confirmar, o Carro é " + this.getCategoria() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoCategoria(correcaoCategoria);
        }
    }

//Verifi..Erro Caixa de Velocidade!!!
    private void verify_error_CaixaVelocidade(String caixa_velocidade) {
        if (!this.getCaixa_velocidade().equals("")) {
            this.setCaixa_velocidade(this.getCaixa_velocidade());
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente a Velocidade Maxima deste Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);

            this.setCaixa_velocidade(JOptionPane.showInputDialog("Digite o limite da Velocidade do Carro!"));
            verify_error_Modelo(this.getCaixa_velocidade());
        }

    }

    //Verifi..Erro Caixa de Velocidade!!!/Correção
    private void verify_error_correcaoCaixaVelocidade(String correcaoCaixaVelocidade) {
        if (correcaoCaixaVelocidade.equalsIgnoreCase("1") || correcaoCaixaVelocidade.equalsIgnoreCase("2")) {
            if (correcaoCaixaVelocidade.equalsIgnoreCase("1")) {
                this.setCaixa_velocidade(this.getCaixa_velocidade());
            } else {
                if (correcaoCaixaVelocidade.equalsIgnoreCase("2")) {
                    this.setCaixa_velocidade(JOptionPane.showInputDialog("CORREÇÃO\n\nDigite o limite da Velocidade do Carro!"));
                    verify_error_CaixaVelocidade(this.getCaixa_velocidade());

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção da Velocidade Maxima do Carro do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção For Exception Case!
            correcaoCaixaVelocidade = JOptionPane.showInputDialog("Para Confirmar,a Velocidade Maxima do Carro é " + this.getCaixa_velocidade() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoCaixaVelocidade(correcaoCaixaVelocidade);
        }
    }

//Verifi..Erro Ciaxa De Transmissão!!!
    private void verify_error_Ctransmisao(String Ctransmisao) {
        if (Ctransmisao.equals("1") || Ctransmisao.equals("2")) {
            switch (Ctransmisao) {
                case "1":
                    this.setCaixa_transmissao("[Manual]");
                    break;
                case "2":
                    this.setCaixa_transmissao("[Automático]");
                    break;

            }

        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Definição da Caixa de Transmissão deste Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            Ctransmisao = JOptionPane.showInputDialog("Quanto a Caixa de Velocidade:\nDigite 1, caso a Caixa de Transmisão for"
                    + " [Manual]\nDigite 2, caso a Caixa de Transmisão for [Automática]");
            verify_error_Ctransmisao(Ctransmisao);
        }
    }

    //Verifi..Erro Ciaxa De Transmissão!!!/Correção
    private void verify_error_correcaoCaixaTransmissao(String correcaoCaixaTransmissao) {
        if (correcaoCaixaTransmissao.equalsIgnoreCase("1") || correcaoCaixaTransmissao.equalsIgnoreCase("2")) {
            if (correcaoCaixaTransmissao.equalsIgnoreCase("1")) {
                this.setCaixa_transmissao(this.getCaixa_transmissao());
            } else {
                if (correcaoCaixaTransmissao.equalsIgnoreCase("2")) {
                    String Ctransmisao = JOptionPane.showInputDialog("CORREÇÃO\n\nQuanto a Caixa de Transmissão:\nDigite 1, caso a Caixa de Transmisão for"
                            + " [Manual]\nDigite 2, caso a Caixa de Transmisão for [Automática]");
                    verify_error_Ctransmisao(Ctransmisao);

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção da Caixa De Transmissão do Carro do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção For Exception Case!
            correcaoCaixaTransmissao = JOptionPane.showInputDialog("Para Confirmar, o Carro é " + this.getCaixa_transmissao() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoCaixaTransmissao(correcaoCaixaTransmissao);
        }
    }

//Verifi..Erro Matrícula!!!
    private void verify_error_Matricula(String matricula) {
        if (!this.getMatricula().equals("")) {
            this.setMatricula(this.getMatricula());
        } else {
            //Erro
            JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente a Matricula deste Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            this.setMatricula(JOptionPane.showInputDialog("Digite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
            verify_error_Matricula(this.getMatricula());
        }
    }

    //Verifi..Erro Matrícula!!!/Correção
    private void verify_error_correcaoMatricula(String correcaoMatricula) {
        if (correcaoMatricula.equalsIgnoreCase("1") || correcaoMatricula.equalsIgnoreCase("2")) {
            if (correcaoMatricula.equalsIgnoreCase("1")) {
                this.setMatricula(this.getMatricula());
            } else {
                if (correcaoMatricula.equalsIgnoreCase("2")) {
                    this.setMatricula(JOptionPane.showInputDialog("CORREÇÃO\n\nDigite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
                    verify_error_Matricula(this.getMatricula());

                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Correção da Caixa Da Matrícula do Carro do Carro!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            //Erro Correção For Exception Case!
            correcaoMatricula = JOptionPane.showInputDialog("Para Confirmar, a Matrícula do Carro é STP " + this.getMatricula() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
            verify_error_correcaoMatricula(correcaoMatricula);
        }
    }

//Mêtodo Para Remover Carro!!!
    public void remover_Carro() {
        if (estadoCadastro == true) {
            this.estadoCadastro = false;
            carro_Quantidade -= 1;
            JOptionPane.showMessageDialog(null, " Agora Existe " + this.carro_Quantidade + " Carros no STOCK da Stand!", "ANÚNCIO!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Este Carro Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }

    }
//Mêtodo Para Validar Preço de Carro Para Venda!!!

    public void Validar_Preco_Carro_Venda() {
        if (this.estadoCadastro == true) {
            String valorVenda = JOptionPane.showInputDialog("De Acordo com as informação deste carro, quanto à:\n|=> [Marca/Modelo];\n|=> [Estado];\n|=> "
                    + "[Categoria],[Acessorio]\n Digite o Preço a ser pago quanto a |Venda|!");
//Verifi..Erro  Para Validar Preço de Carro Para Venda!!!
            if (!valorVenda.equals("")) {
                this.precoCarro_Venda = Double.parseDouble(valorVenda);
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Preço a ser pago quanto a |Venda|!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
                Validar_Preco_Carro_Venda();
            }
            if (this.precoCarro_Venda > 0) {
                this.precoCarro_Venda = precoCarro_Venda;
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Preço a ser pago quanto a |Venda|!", "Valor Negativo!!!", JOptionPane.WARNING_MESSAGE);
                Validar_Preco_Carro_Venda();
            }

        } else {
            JOptionPane.showMessageDialog(null, "Este Carro Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);

        }
    }
//Mêtodo Para Validar Preço de Carro Para Aluguer!!!

    public void Validar_Preco_Carro_Aluguer() {
        if (this.estadoCadastro == true) {

            String valorAluguer = JOptionPane.showInputDialog("De Acordo com as informação deste carro, quanto à:\n|=> [Marca/Modelo];\n|=> [Estado];\n|=> "
                    + "[Categoria],[Acessorio]\n Digite o Preço a ser pago quanto ao |Aluguer|!");

//Verifi..Erro  Para Validar Preço de Carro Para Aluguer!!!
            if (!valorAluguer.equals("")) {
                this.precoCarro_Aluguer = Double.parseDouble(valorAluguer);
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Preço a ser pago quanto a |Aluguer|!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
                Validar_Preco_Carro_Venda();
            }
            if (this.precoCarro_Aluguer > 0) {
                this.precoCarro_Aluguer = precoCarro_Aluguer;
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Preço a ser pago quanto a |Aluguer|!", "Valor Negativo!!!", JOptionPane.WARNING_MESSAGE);
                Validar_Preco_Carro_Aluguer();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este Carro Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);

        }
    }

//Mêtodo ParaValidar Preço de Carro Para Lising!!!
    public void Validar_Preco_Carro_Lising() {
        if (this.estadoCadastro == true) {
            String valorLising = JOptionPane.showInputDialog("De Acordo com as informação deste carro, quanto à:\n|=> [Marca/Modelo];\n|=> [Estado];\n|=> "
                    + "[Categoria],[Acessorio]\n Digite o Preço a ser pago quanto ao |Lising|!");
//Verifi..Erro  Para Validar Preço de Carro Para Lising!!!
            if (!valorLising.equals("")) {
                this.precoCarro_Lising = Double.parseDouble(valorLising);
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Preço a ser pago quanto a |Lising|!", "ESPAÇO VAZIO!!!", JOptionPane.WARNING_MESSAGE);
                Validar_Preco_Carro_Lising();
            }
            if (this.precoCarro_Lising > 0) {
                this.precoCarro_Lising = precoCarro_Lising;
            } else {
                JOptionPane.showMessageDialog(null, "Por Favor, Digite Corretamente o Preço a ser pago quanto a |Lising|!", "Valor Negativo!!!", JOptionPane.WARNING_MESSAGE);
                Validar_Preco_Carro_Lising();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Este Carro Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);

        }
    }

//Mêtodo Para Atualizar OU Editar Dados!!! 
    public void atualizar_Dados_Carro() {
        if (this.estadoCadastro == true) {
            String atual_Dados = JOptionPane.showInputDialog("Atualização de Dados!!!!\n\nPor Favor Digite a Senha do Dado que Pretendes"
                    + " Atualizar!\n=> 1-Referente ao Estado!\n=> 2-Referente à Cor!\n=> 3-Referente á Matrícula!");
            correcao_Atual_Dados(atual_Dados);
            JOptionPane.showMessageDialog(null, "As Informação do Carro que Foram Atualizadas São:\n|=> Quanto ao Estado => O Carro é " + this.getEstadoCarro() + ""
                    + "\n|=> Quanto à Cor => O Carro é " + this.getCor() + "\n|=> Quanto a Matricula => A Matricula do Carro é STP " + this.getMatricula() + "");
        } else {
            JOptionPane.showMessageDialog(null, "Este Carro Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);
        }
    }

    //Mêtodo Para Correção para Atualizar OU Editar Dados!!! 
    private void correcao_Atual_Dados(String atual_Dados) {

        if (atual_Dados.equals("1") || atual_Dados.equals("2") || atual_Dados.equals("3")) {
            switch (atual_Dados) {
                case "1":
                    //Perguntar Estado/Atual
                    String estado = JOptionPane.showInputDialog("Para Atualizar:\nDigite [N] se o Carro for [Novo], ou Digite [U] se for [Usado]!");
                    verify_error_Estado(estado);
                    //Perguntar Estado/Correção/Atual
                    String correcaoEstado = JOptionPane.showInputDialog("Para Confirmar, O Estado Atual do Carro é " + this.getEstadoCarro() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
                    verify_error_correcaoEstado(correcaoEstado);
                    break;
                case "2":

                    //Perguntar Cor/Atual
                    String Cor = JOptionPane.showInputDialog("Para Atualizar:\nQual a Cor Do Carro: \n|=> 1-Amarelo\n|=> 2-Azul\n|=> 3-Branco\n|=> 4-Cizento\n|=>"
                            + " 5-Preto\n|=> 6- Rosa\n|=> 7-Verde\n|=> 8-Vermelho\n|=> 9-Violeta\n|=> 10- Outros!!!!");

                    verify_error_Cor(Cor);
                    //Perguntar Cor/CorreÇão/Atual
                    String correcaoCor = JOptionPane.showInputDialog("Para Confirmar, a Cor Atual do Carro é " + this.getCor() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
                    verify_error_correcaoCor(correcaoCor);
                    break;
                case "3":

                    //Perguntar Matricula/Atual
                    this.setMatricula(JOptionPane.showInputDialog("Para Atualizar:\nDigite o Número da Matricula do Carro, da Seguinte Forma:\n[-------------[(número1]---[Travesão ou Hifen]--[número2]---[Letra de Série]----------]"));
                    verify_error_Matricula(this.getMatricula());
                    //Perguntar Matricula/Correção/Atual
                    String correcaoMatricula = JOptionPane.showInputDialog("Para Confirmar, a Matricula Atual do Carro é STP " + this.getMatricula() + "!\nPara Continuar Digite 1 e Para Retroceder  Digite 2!");
                    verify_error_correcaoMatricula(correcaoMatricula);
                    break;

            }

        } else {
            JOptionPane.showMessageDialog(null, "Por Favor, Código necessário para a Escolha dos Dados do Carro que Será Atualizado!", "Código Fora de Parámetro", JOptionPane.WARNING_MESSAGE);
            atual_Dados = JOptionPane.showInputDialog("Atualização de Dados!!!!\n\nPor Favor Digite a Senha do Dado que Pretendes"
                    + " Atualizar!\n=> 1-Referente ao Estado!\n=> 2-Referente à Cor!\n=> 3-Referente á Matrícula!");
            correcao_Atual_Dados(atual_Dados);
        }

    }
//Mêtodo Para Exibir Status do Carro!!!

    public void fazer_Exibicao_Status_Carro() {
        if(this.estadoCadastro==true){
        JOptionPane.showMessageDialog(
                null, "\n--------------------------------------------------------------------------------------------------------------------------------------------------------------\nO Carro está Cadastrado no Sistema, e suas informações são:\n|=> Este Carro é:-------------------------------------------------------------------------------------------------------=>| " + this.getEstadoCarro() + " |\n\n|=> A Marca "
                + "do Carro é:---------------------------------------------------------------------------------------------=>| " + this.getMarca() + " |\n\n|=> O Modelo do Carro é:-------------------------------------------------------------------------------------------=>| " + this.getModelo_Carro() + " |\n\n|=> A Cor do Carro"
                + " é:-------------------------------------------------------------------------------------------------=>| " + this.getCor() + " |\n\n|=> O Tipo de Combustível deste Carro é:---------------------------------------------------------------------=>| " + this.getTipo_combustivel() + " |\n\n|=> A Caixa de Transmisão "
                + "deste Carro é:-------------------------------------------------------------------=>| " + this.getCaixa_transmissao() + " |\n\n|=> A Velocidade Total deste Carro é:--------------------------------------------------------------------------=>| " + this.getCaixa_velocidade() + " Km/h |\n\n|=> Quanto a categória do Carro, este"
                + " Carro é do tipo:---------------------------------------------------=>| " + this.getCategoria() + " |\n\n|=> O número da Chapa Matrícula é:----------------------------------------------------------------------------=>| STP " + this.getMatricula() + " |\n\n--------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }else{
                        JOptionPane.showMessageDialog(null, "Este Carro Não Está Registrado no Sistema da Stand!", "Alerta!", JOptionPane.WARNING_MESSAGE);

        }
    }

}
