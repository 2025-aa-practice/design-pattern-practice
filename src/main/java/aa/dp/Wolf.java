package aa.dp;

public class Wolf implements IWolf {
    @Override
    public void hitMagic(SpellShootable spell) {
        spell.spell(this);
    }
}
