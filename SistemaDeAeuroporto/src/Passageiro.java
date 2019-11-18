package visual;
/**
 *
 * @author
 */
public class Passageiro {
  
   private String  nome;
   private String  num_Passaporte;

    public Passageiro(String nome, String num_Passaporte) {
        this.nome = nome;
        this.num_Passaporte = num_Passaporte;
    }
   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNum_Passaporte() {
        return num_Passaporte;
    }

    public void setNum_Passaporte(String num_Passaporte) {
        this.num_Passaporte = num_Passaporte;
    }

    @Override
    public String toString() {
        return "" + nome ;
    }
   
}
