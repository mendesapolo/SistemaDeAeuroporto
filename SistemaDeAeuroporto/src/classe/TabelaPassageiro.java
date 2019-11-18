package classe;



import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;


public class TabelaPassageiro extends AbstractTableModel {

    ArrayList<Passageiro> passageiros;
    private String[] colunas = {"Nome do Passageiro", " NÚMERO DO PASSAPORTE"};

    
    public ArrayList<Passageiro> getPassageiros() {
        return passageiros;
    }

    public void setInfrator(ArrayList<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }

    @Override
    public int getRowCount() {
        return passageiros.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public String getColumnName(int column) {
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return this.passageiros.get(rowIndex).getNome();
            case 1:
                return passageiros.get(rowIndex).getNum_Passaporte();

            default: {
                return null;
            }

        }
    }

    public void setListaPassageiro(ArrayList<Passageiro> passageiros) {
        this.passageiros= passageiros;
        fireTableDataChanged();
   
    } 
}
