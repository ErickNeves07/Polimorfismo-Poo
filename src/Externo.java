public class Externo extends Vendedor{
        private double kmPercorridos;
        private int numeroVendas;

        //Construtor
        public Externo(long cpf, String nome, double valorVendas, double salarioBase ,double kmPercorridos, int numeroVendas){
            super(cpf, nome, valorVendas, salarioBase);
            this.kmPercorridos = kmPercorridos;
            this.numeroVendas = numeroVendas;
        }

        //Getters e setters
        public double getKmPercorridos() {
            return kmPercorridos;
        }
        public int getNumeroVendas() {
            return numeroVendas;
        }

        public void setKmPercorridos(double kmPercorridos) {
            this.kmPercorridos = kmPercorridos;
        }
        public void setNumeroVendas(int numeroVendas) {
            this.numeroVendas = numeroVendas;
        }

        //To string
        public String toString() {
            return super.toString()+"\nQuilômetros percorridos  ➜ "+kmPercorridos+"\nNúmero de vendas ➜ "+numeroVendas;
        }
}


