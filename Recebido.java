public class Recebido implements EstadoPacote {
    public EstadoPacote avancar() { return new EmTransito(); }
    public String descricao() { return "Pacote recebido"; }
}