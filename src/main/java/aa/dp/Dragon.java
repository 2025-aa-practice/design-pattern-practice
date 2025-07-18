package aa.dp;

public class Dragon implements Monster{

    @Override
    public void hitMagic(
            final SpellShootable spell) {
        spell.spell(this);
    }
}
