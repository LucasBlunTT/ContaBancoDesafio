public class Conta {
    int numeroConta = 0;
    double saldo = 0;
    String agencia  = "";
    String titular = "";

    public Conta(int numeroConta, double saldo, String agencia, String titular) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}