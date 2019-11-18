
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Lenovo
 */
public class Tabela_Voo extends AbstractTableModel {

    ArrayList<Voo> voo;
    String colunas[] = {"Nº DO VOO ", "CAPACIDADE", "LISTA DE RESERVAS"};

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public int getRowCount() {
        return voo.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.voo.get(rowIndex).getNumero_Voo();
            case 1:
                return this.voo.get(rowIndex).getCapacidade();
            case 2:
                return this.voo.get(rowIndex).getLista_Reservas();
            default:
                return null;
        }
    }

    public void setListaVoo(ArrayList<Voo> Lista) {
        this.voo = Lista;
        fireTableDataChanged();
    }

}
