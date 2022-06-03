public abstract class FabriqueVehicule {
    
    public abstract Capot creerCapot(String color);
    public abstract Porte creerPorte(String side);
    public abstract Roue creerRoue(String side, String position);
    public abstract Moteur creerMoteur();

    public static FabriqueVehicule getInstance(String marque) throws MarqueNotImplementedException {
        if(marque.equalsIgnoreCase("lambo"))
            return new FabriqueLambo();
        else if(marque.equalsIgnoreCase("merco"))
            return new FabriqueMerco();
        else
            throw new MarqueNotImplementedException(marque);
    }
}
