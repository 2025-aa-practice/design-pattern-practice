package aa.dp;

import java.util.Objects;

public class Dragon implements Monster {
    private final String name;

    public Dragon(
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
