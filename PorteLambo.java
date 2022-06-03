public class PorteLambo extends Porte {
    
    public PorteLambo(String side) {
        super(side);
    }

    public void put(int numero){
        System.out.println("Montage de la porte "+ numero +" de la LAMBO effectué avec succès !");
    }
}
