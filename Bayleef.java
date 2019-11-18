package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bayleef extends Meganium {
        public Bayleef(String name, int level){
            super(name, level);
            this.addType(Type.GRASS);
            this.setStats(60.0D, 62.0D, 80.0D, 63.0D, 80.0D, 60.0D);
            this.setMove(new Swagger(), new DoubleEdge(), new DefenseCurl());
        }
        public Bayleef(){
            super();
        }
}