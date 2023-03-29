
public class LinuxTipsBankMain {

    public static void main(String[] args) {

        System.out.println("Bem Vindo(a) ao Linux Tips Bank!");
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.consultarSaldo();
        contaCorrente.fazerPix();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.consultarSaldo();
        contaPoupanca.fazerPix();
    }
}
