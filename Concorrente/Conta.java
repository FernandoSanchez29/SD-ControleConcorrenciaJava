
public class Conta {
    
    private double saldo = 0;
    
    /** Creates a new instance of Conta */
    public Conta() { // Correção realizada nesta linha, foi retirado o parâmetro recebimdo pelo método
        this.saldo = saldo;
        System.out.println("Conta criada. Saldo inicial: R$" + saldo);
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}