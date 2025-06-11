public class Vendedor {
    private long cpf;
    private String nome;
    private double valorVendas;
    private double salarioBase;

    public Vendedor(long cpf, String nome, double valorVendas, double salarioBase ){
        this.cpf = cpf;
        this.nome = nome;
        this.valorVendas = valorVendas;
        this.salarioBase = salarioBase;
    }

    public long getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public String toString() {
        return "CPF ➜ "+this.cpf+"\nNome ➜ "+this.nome+"\nValor de vendas ➜ "+this.valorVendas+"\nSalário base ➜ "+this.salarioBase;
    }

    //Outros métodos
    public double calcularSalario(){
        return salarioBase+valorVendas;
    }
    public double calcularSalario(double bonificacao){
        return (salarioBase+valorVendas)+bonificacao;
    }

    public boolean aumentarSalarioBase(double percentual){
        if (percentual<=0) return false;
        salarioBase += salarioBase*(percentual/100);
        return true;
    }
}
