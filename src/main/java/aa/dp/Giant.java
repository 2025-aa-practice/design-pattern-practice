package aa.dp;

public class Giant implements Monster {
    @Override
    public void hitMagic(
            final SpellShootable spell) {
        spell.spell(this);
    }
}
