package sistema_gerenciamento_stand_automovel;

public abstract class Pessoa {

    private String nome;
    private String sexo;
    private int anoNancimento;
    private String nacionalidade;
    private String telefone;
    private String email;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
    
// Mêtodo Contrutor Vazio!!!!!!!!!
    public Pessoa() {
    }
    
    
// Mêtodo Contrutor com Paramêtro!!!!!!!!!
    public Pessoa(String nome, String sexo, int datan, String nacionalidade, String telefone) {
        this.nome = nome;
        this.sexo = sexo;
        this.anoNancimento = datan;
        this.nacionalidade = nacionalidade;

        this.telefone = telefone;
    }
    
    
// Mêtodo Especiais- Acessores e Modificadores!!!!!!!!!
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getAnoNancimento() {
        return anoNancimento;
    }

    public void setAnoNancimento(int anoNancimento) {
        this.anoNancimento = anoNancimento;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Mêtodo Abstrato!!!!!!!!!!
    public abstract int verify_Idade();
    public abstract void exibir_Dados();

}
