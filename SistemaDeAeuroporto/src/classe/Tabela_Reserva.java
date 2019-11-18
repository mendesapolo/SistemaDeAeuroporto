package classe;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class Tabela_Reserva extends AbstractTableModel{

    private ArrayList<Reserva> lista_reserva;
    String colunas[] = {"Nº ", "Passageiro","Voo","Tipo","Preço"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return lista_reserva.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.lista_reserva.get(rowIndex).getNumReserva();
            case 1:
                return this.lista_reserva.get(rowIndex).getPassageiro();
            case 2:
                return this.lista_reserva.get(rowIndex).getVoo();
            case 3:
                return this.lista_reserva.get(rowIndex).getTipodereserva();
            case 4:
                return this.lista_reserva.get(rowIndex).getPreco();
            default:
                return null;
        }
    }

    public void setListaReserva(ArrayList<Reserva> Lista) {
        this.lista_reserva = Lista;
        fireTableDataChanged();
    }
    
}
