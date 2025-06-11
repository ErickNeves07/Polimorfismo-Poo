public class Main {
    public static void main(String[] args) {
        Vendedor v1 = new Vendedor(121212121L, "EU", 1200, 1200);
        System.out.println(v1.aumentarSalarioBase(-10));
        System.out.println(v1);
    }
}