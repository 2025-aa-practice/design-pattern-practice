package aa.dp;

public class Wolf implements IWolf {
    private final String name;

    public Wolf(
            final String name) {
        this.name = name;
    }

    @Override
    public void printWolf() {
		System.out.println(name);
    }

    @Override
    public void hitMagic(
            final SpellShootable spell) {
        spell.spell(this);
    }
}
