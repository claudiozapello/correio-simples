public class EmTransito implements EstadoPacote {
    public EstadoPacote avancar() { return new Entregue(); }
    public String descricao() { return "Pacote em trânsito"; }
}