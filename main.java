import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon registeel = new Registeel("regel", 1);
        Pokemon petilil = new Petilil("petya", 1);
        Pokemon liligant = new Lilligant("lili", 1);
        Pokemon chikorita = new Chikorita("chika", 1);
        Pokemon bayleef = new Bayleef("bay", 1);
        Pokemon meganium = new Meganium("mega", 1);

        b.addAlly(registeel);
        b.addAlly(petilil);
        b.addAlly(liligant);
        b.addFoe(chikorita);
        b.addFoe(bayleef);
        b.addFoe(meganium);
        b.go();
    }
}

