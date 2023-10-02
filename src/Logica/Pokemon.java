package Logica;

public abstract class Pokemon {

    protected int numPokedex;
    protected int temporada;
    protected String nombre;
    protected String peso;
    protected String sexo;
    
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
}
