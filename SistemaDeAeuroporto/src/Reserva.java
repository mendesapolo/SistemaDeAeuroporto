
public class Reserva {

    private String numReserva;
    private Passageiro passageiro;
    private Voo voo;
    private String tipodereserva; //(1ra classe, executiva, económica)
    private double preco;

    public Reserva(String numReserva, Passageiro passageiro, Voo voo, String tipodereserva, double preco) {
        this.numReserva = numReserva;
        this.passageiro = passageiro;
        this.voo = voo;
        this.tipodereserva = tipodereserva;
        this.preco = preco;
    }

    public String getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(String numReserva) {
        this.numReserva = numReserva;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public String getTipodereserva() {
        return tipodereserva;
    }

    public void setTipodereserva(String tipodereserva) {
        this.tipodereserva = tipodereserva;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return getNumReserva();
    }

}
