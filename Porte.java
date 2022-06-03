public abstract  class Porte {
    
    protected String side;

    public Porte(String side){
        this.side = side;
    }
    public abstract void put(int numero);
}
