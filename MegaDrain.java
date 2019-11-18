package moves;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain() {
        super(Type.GRASS, 40.0D, 100.0D);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.addEffect(new Effect().stat(Stat.HP, (int) Math.round(-damage / 2)));
    }

    @Override
    protected String describe() {
        return "Произошел вампиризм 50%";
    }
}
