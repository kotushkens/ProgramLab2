package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.*;

public class Chikorita extends Bayleef {
        public Chikorita(String name, int level){
            super(name, level);
            this.addType(Type.GRASS);
            this.setStats(45.0D, 49.0D, 65.0D, 49.0D, 65.0D, 45.0D);
            this.setMove(new Swagger(), new DoubleEdge());
        }
        public Chikorita(){
            super();
        }
}
