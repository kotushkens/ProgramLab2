package moves;

import ru.ifmo.se.pokemon.*;

public class DoubleKick extends PhysicalMove {
    public DoubleKick(){
        super(Type.FIGHTING, 30.0D, 100.0D, 0, 2);
    }

    @Override
    protected String describe() {
        return "ETO KONETS, VSE RABOTAET. FINISH/ YAA SPATKI";
    }
}
