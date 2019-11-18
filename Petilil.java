package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Petilil extends Pokemon {
    public Petilil(String name, int level) {
        super(name, level);
        setType(Type.GRASS);
        setStats(45.0D, 35.0D, 50.0D, 70.0D, 50.0D, 30.0D);
        this.setMove(new Swagger(), new DoubleTeam(), new Facade());
    }
    public Petilil() {
        super();
    }
}
