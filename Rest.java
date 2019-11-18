package moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.restore();
        pokemon.addEffect(new Effect().turns(2).condition(Status.SLEEP));
    }

    @Override
    protected String describe() {
        return "Надо немного отдохнуть (2 хода)";
    }
}
