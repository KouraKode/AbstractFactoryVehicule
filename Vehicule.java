public class Vehicule{

    private Moteur moteur;
    private Capot capot;
    private Roue[] roues;
    private Porte[] portes;

    public Vehicule(Moteur moteur, Capot capot, Roue[] roues, Porte[] portes){
        this.moteur = moteur;
        this.capot = capot;
        this.roues = roues;
        this.portes = portes;
    }
    
    public void showAssembly(){
        System.out.println();
        System.out.println("________Assemblage Vehicule________");
        System.out.println();
        System.out.println("Moteur..........");
        moteur.assembly();
        System.out.println("Capot...........");
        capot.cover();
        System.out.println("Roue1............");
        for (int i = 0; i < roues.length; i++) {   
            System.out.println("Roue "+ roues[i].position+" "+roues[i].side+"............");
            roues[i].bringUp(i+1);
        }
        for (int i = 0; i < portes.length; i++) {
            System.out.println("Porte "+portes[i].side+"...........");
            portes[i].put(i+1);   
        }
        System.out.println();
        System.out.println("________Vechicule fabriqué avec succes________");
        System.out.println();
    }
}
