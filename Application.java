public class Application {
    public static void main(String[] args) {
        Pacote pacote = new Pacote();

        System.out.println(pacote.status()); // Recebido
        pacote.avancar();

        System.out.println(pacote.status()); // Em trânsito
        pacote.avancar();

        System.out.println(pacote.status()); // Entregue
    }
}