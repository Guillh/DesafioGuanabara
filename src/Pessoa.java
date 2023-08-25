public class Pessoa {
    //Atributos

    private String nome;
    private int idade;
    private String sexo;

    //Métodos

    public void fazerAniver(){
        this.setIdade(this.getIdade() + 1);
    }

    //Setters, Getters and Constructor


    public Pessoa(String no, int id, String sx) {
        this.setNome(no);
        this.setIdade(id);
        this.setSexo(sx);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
