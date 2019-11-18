package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

@Override
protected void applySelfEffects(Pokemon pokemon) {
    Status pokemonCondition = pokemon.getCondition();
    if (pokemonCondition.equals(Status.BURN) || pokemonCondition.equals(Status.POISON) || pokemonCondition.equals(Status.PARALYZE)) {
        pokemon.addEffect(new Effect().stat(Stat.HP, 2));
    }
}

@Override
protected String describe() {
    return "Я восстанавливаюсь!!!";
    }
}



