
class ContaCorrente implements Conta {

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo da sua conta e R$1000.00");
    }

    @Override
    public void fazerPix() {
        System.out.println("Digite o valor que voce deseja transferir");

    }
}
