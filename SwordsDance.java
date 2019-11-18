package moves;

import ru.ifmo.se.pokemon.*;

public class SwordsDance extends SpecialMove {
    public SwordsDance() {
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().turns(2).stat(Stat.ATTACK, 2));
    }
    @Override
    public String describe(){
        return "Да прибудет со мной сила!(+2 к атаке)";
    }
}

