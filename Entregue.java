public class Entregue implements EstadoPacote {
    public EstadoPacote avancar() { return this; } // já está final
    public String descricao() { return "Pacote entregue"; }
}