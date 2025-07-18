package aa.dp;

import java.util.Objects;

public class Giant implements Monster {
    private final String name;

    public Giant(
            final String name) {
        this.name = Objects.requireNonNull(name);
    }

    @Override
    public void hitMagic(
            final SpellShootable spell) {
        spell.spell(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
