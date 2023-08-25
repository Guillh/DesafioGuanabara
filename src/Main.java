public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa("Claudia", 23,"Feminino");
        Livro l1 = new Livro("One","Carlos",263, p1);

        l1.detalhes();
        l1.abrir();
        l1.folhear();
        l1.avançarPag();
        l1.detalhes();
    }
}