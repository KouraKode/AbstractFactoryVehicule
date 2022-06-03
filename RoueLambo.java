public class RoueLambo extends Roue {
    
    public RoueLambo(String side, String position) {
        super(side, position);
    }

    public void bringUp(int numero) {
        System.out.println("Montage du pneu "+ numero +" de la LAMBO effectué avec succès !");
    }
}
