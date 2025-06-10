public class Comissionado extends Vendedor{
    private double percComissao;

    //Construtor
    public Comissionado(long cpf, String nome, double valorVendas, double salarioBase ,double percComissao){
        super(cpf, nome, valorVendas, salarioBase);
        this.percComissao = percComissao;
    }

    //Getters e setters
    public double getPercComissao() {
        return percComissao;
    }
    public void setPercComissao(double percComissao) {
        this.percComissao = percComissao;
    }

    //To string
    public String toString() {
        return super.toString()+"\nPercentual de comissão ➜ "+percComissao;
    }
}
