package classe;

import java.util.ArrayList;


public class Voo {

    private int numero_Voo;
    private int capacidade;
    private ArrayList<Reserva> lista_Reservas;

    public Voo(int numero_Voo, int capacidade) {
        this.numero_Voo = numero_Voo;
        this.capacidade = capacidade;
        this.lista_Reservas = new ArrayList<>();
    }

    public int getNumero_Voo() {
        return numero_Voo;
    }

    public void setNumero_Voo(int numero_Voo) {
        this.numero_Voo = numero_Voo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public ArrayList<Reserva> getLista_Reservas() {
        return lista_Reservas;
    }

    public void setAdicionarReserva(Reserva reserva) {
        this.lista_Reservas.add(reserva);
    }

    @Override
    public String toString() {
        return "" + numero_Voo ;
    }

 
}
