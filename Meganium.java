package pokemons;
import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Meganium extends Pokemon {
    public Meganium(String name, int level){
            super(name, level);
            this.addType(Type.GRASS);
            this.setStats(80.0D, 82.0D, 100.0D, 83.0D, 100.0D, 80.0D);
            this.setMove(new Swagger(), new DoubleEdge(), new DefenseCurl(), new DoubleKick());
        }
        public Meganium(){
            super();
        }
}