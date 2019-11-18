package moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce() {
        super(Type.FLYING, 60.0D,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().stat(Stat.ACCURACY, 100));
    }

    @Override
    protected String describe() {
        return "Астанавитесь, пока твоя остановка не стала последней (100% точность)";
        }
}
