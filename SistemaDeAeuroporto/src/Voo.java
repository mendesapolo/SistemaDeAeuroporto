
/**
 *
 * @author
 */
public class Voo {

    private int numero_Voo;
    private int capacidade;
    private Reserva lista_Reservas;

    public Voo(int numero_Voo, int capacidade, Reserva lista_Reservas) {
        this.numero_Voo = numero_Voo;
        this.capacidade = capacidade;
        this.lista_Reservas = lista_Reservas;
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

    public Reserva getLista_Reservas() {
        return lista_Reservas;
    }

    public void setLista_Reservas(Reserva lista_Reservas) {
        this.lista_Reservas = lista_Reservas;
    }

    @Override
    public String toString() {
        return "" + numero_Voo ;
    }

 
}
