public class App {
    public static void main(String[] args) throws Exception {
        
        Restaurante re1 = new Restaurante("Tortas OwO");
        Mesa me1 = new Mesa(1, 2);
        Mesa me2 = new Mesa(2, 3);
        Mesa me3 = new Mesa(3, 4);
        Mesa me4 = new Mesa(4, 5);
        Mesa me5 = new Mesa(5, 6);

        re1.adicionarMesa(me1);
        re1.adicionarMesa(me2);
        re1.adicionarMesa(me3);
        re1.adicionarMesa(me4);
        re1.adicionarMesa(me5);
        
        re1.listarMesasCadastradas();

        Mesa mesaSorteada = re1.sortearMesa();
        System.out.println("Mesa: " + mesaSorteada.getNumero() + ", Quantidade: "+mesaSorteada.getCapacidade());

        

    }
}
