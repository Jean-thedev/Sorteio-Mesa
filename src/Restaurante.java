import java.util.ArrayList;
import java.util.Random;

public class Restaurante {
    private String nome;
    ArrayList<Mesa> mesas = new ArrayList<Mesa>();

    public Restaurante(String nome) {
        this.nome = nome;
    }

    public void adicionarMesa(Mesa me){
        mesas.add(me);
    }

    public Mesa sortearMesa(){
        Random sorteio = new Random();
        int sorteado = sorteio.nextInt(mesas.size());
        return mesas.get(sorteado);
    }

    public void listarMesasCadastradas(){
        for (Mesa mesa : mesas){
            System.out.println();
            System.out.println("Mesa: "+mesa.getNumero());
            System.out.println("Quantidade: "+mesa.getCapacidade());
            System.out.println();
        }
    }



    
}