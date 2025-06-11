public class Main {
    public static void main(String[] args) {
        //Implementando as 3 classes
        Vendedor v1 = new Vendedor(121212121L, "EU", 1200, 1200);
        Externo e1 = new Externo(000002121L, "AAAAA", 2200, 4022, 88, 44);
        Comissionado c1 = new Comissionado(121212121L, "VOCÊ", 3200, 1600, 4.8);

        System.out.println("\n-- Vendedor --\n"+v1);
        System.out.println("\nSalário calculado = "+v1.calcularSalario());

        System.out.println("\n-- Externo --\n"+e1);
        System.out.println("\nSalário calculado = "+e1.calcularSalario());

        System.out.println("\n-- Comissionado --\n"+c1);
        System.out.println("\nSalário calculado = "+c1.calcularSalario());
    }
}