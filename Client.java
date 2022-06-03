public class Client {
    
    public static void main(String[] args) throws MarqueNotImplementedException {
        Roue roues[] = {null, null, null, null};
        Moteur moteur;
        Porte portes[] = {null, null};
        Capot capot;

        FabriqueVehicule fabrique = FabriqueVehicule.getInstance("merco");

        roues[0] = fabrique.creerRoue("Droite", "Avant");
        roues[1] = fabrique.creerRoue("Gauche", "Avant");
        roues[2] = fabrique.creerRoue("Droite", "Arriere");
        roues[3] = fabrique.creerRoue("Gauche", "Arriere");

        moteur = fabrique.creerMoteur();

        capot = fabrique.creerCapot("Blue");

        portes[0] = fabrique.creerPorte("Droite");
        portes[1] = fabrique.creerPorte("Gauche");

        Vehicule vehicule = new Vehicule(moteur, capot, roues, portes);

        vehicule.showAssembly();
        
    }
}
