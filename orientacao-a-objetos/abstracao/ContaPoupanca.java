
class ContaPoupanca implements Conta {


    @Override
    public void consultarSaldo() {
        System.out.println("O saldo da sua conta e R$0.00");
    }

    @Override
    public void fazerPix() {
        System.out.println("Pix nao realizado!");
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente();
        contaPoupanca.consultarSaldo();
        contaPoupanca.fazerPix();
        contaCorrente.consultarSaldo();
        contaCorrente.fazerPix();
    }
}
