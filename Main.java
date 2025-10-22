    public class Main {
    public static void main(String[] args){

        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Gustavo";
        pessoa1.idade = 18;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Jorge";
        pessoa2.idade = 15;

        pessoa1.mostrarInformacoes();
        pessoa2.mostrarInformacoes();
    }
}