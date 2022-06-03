public abstract class Roue {
    
    protected String side, position;

    public Roue(String side, String position){
        this.side = side;
        this.position = position;
    }

    public abstract void bringUp(int numero);
}
