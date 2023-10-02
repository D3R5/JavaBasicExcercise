package Logica;

public class EjercicioIntegrador {

    public static void main(String[] args) {
        Squirtle squirtle = new Squirtle();
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Pikachu pikachu = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarHidrobomba();
        bulbasaur.atacarAraniazo();
        bulbasaur.atacarDrenaje();
        charmander.atacarAraniazo();
        charmander.atacarLanzallamas();
        pikachu.atacarAraniazo();
        pikachu.atacarImpactrueno();
    }
    
}
