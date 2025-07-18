package aa.dp;

public class Dragon implements Monster{

    @Override
    public void hitMagic(SpellShootable spell) {
        spell.spell(this);
    }
}
