//sublcasse herda da classe principal
public class Pessoa {
    public static void main(String[] args) {

        PessoaDesenvolvedoraBackend pessoaDesenvolderaBackend =
                new PessoaDesenvolvedoraBackend("DevBackEnd", "Java e Spring", 1000.00);
        pessoaDesenvolderaBackend.codar();

        PessoaDesenvolvedoraFrontEnd pessoaDesenvolvedoraFrontEnd =
                new PessoaDesenvolvedoraFrontEnd("DevFrontEnd", "JS", 1000.00);
        pessoaDesenvolvedoraFrontEnd.codar();
    }
}
