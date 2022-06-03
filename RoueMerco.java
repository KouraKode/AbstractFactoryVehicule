public class RoueMerco extends Roue {
    
    public RoueMerco(String side, String position) {
        super(side, position);
    }

    public void bringUp(int numero) {
        System.out.println("Montage du pneu "+ numero +" de la MERCO effectué avec succès !");
    }
}
