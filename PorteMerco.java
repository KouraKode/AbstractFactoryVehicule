public class PorteMerco extends Porte{
    
    public PorteMerco(String side) {
        super(side);
    }

    public void put(int numero){
        System.out.println("Montage de la porte "+ numero +" de la MERCO effectué avec succès !");   
    }
}
