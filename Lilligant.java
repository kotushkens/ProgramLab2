package pokemons;

import moves.*;
import pokemons.Petilil;
import ru.ifmo.se.pokemon.Type;

public class Lilligant extends Petilil {
    public Lilligant(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(70.0D, 60.0D, 75.0D, 110.0D, 75.0D, 90.0D);
        this.setMove(new Swagger(), new DoubleTeam(), new Facade(), new Peck() );
    }
    public Lilligant() {
        super();
    }
}
