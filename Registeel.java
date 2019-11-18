package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Registeel extends Pokemon {
    public Registeel(String name, int level){
        super(name, level);
        this.addType(Type.STEEL);
        this.setStats(80.0D, 75.0D, 150.0D, 75.0D, 150.0D, 50.0D);
        this.setMove(new Rest(),new AerialAce(), new SwordsDance(), new MegaDrain());
    }
    public Registeel(){
        super();
    }
}
