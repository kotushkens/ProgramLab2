package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge() {
        super(Type.NORMAL, 120, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.addEffect(new Effect().stat(Stat.HP, (int) Math.round(damage / 3)));
    }
    @Override
    protected String describe() {
        return "Я ударил не только тебя, но и себя (на 1/3)";
    }
}
