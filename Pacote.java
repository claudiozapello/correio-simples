public class Pacote {
    private EstadoPacote estado = new Recebido();

    public void avancar() { estado = estado.avancar(); }
    public String status() { return estado.descricao(); }
}
