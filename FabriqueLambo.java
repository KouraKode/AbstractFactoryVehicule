public class FabriqueLambo extends FabriqueVehicule {

    @Override
    public Capot creerCapot(String color) {
        return new CapotLambo(color);
    }

    @Override
    public Porte creerPorte(String side) {
        return new PorteLambo(side);
    }

    @Override
    public Roue creerRoue(String side, String position) {
        return new RoueLambo(side, position);
    }

    @Override
    public Moteur creerMoteur() {
        return new MoteurLambo();
    }
}
