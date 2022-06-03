public class FabriqueMerco extends FabriqueVehicule {

    @Override
    public Capot creerCapot(String color) {
        return new CapotMerco(color);
    }

    @Override
    public Porte creerPorte(String side) {
        return new PorteMerco(side);
    }

    @Override
    public Roue creerRoue(String side, String position) {
        return new RoueMerco(side, position);
    }

    @Override
    public Moteur creerMoteur() {
        return new MoteurMerco();
    }

}
