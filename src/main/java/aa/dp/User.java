package aa.dp;

public class User {

    private static final SpellShootable blindSpell = new SpellBlind();
    private static final SpellShootable bindSpell = new SpellBind();

    public static void main(
            final String[] args) {
        Dragon dragon = new Dragon("Dragon1");
        Giant giant = new Giant("Giant1");

        WolfGroup wolfGroup1 = new WolfGroup("WolfGroup1");
        WolfGroup wolfGroup2 = new WolfGroup("WolfGroup2");

        wolfGroup1.add(new Wolf("Wolf1-1"));
        wolfGroup1.add(new Wolf("Wolf1-2"));
        wolfGroup2.add(new Wolf("Wolf2-1"));
        wolfGroup1.add(wolfGroup2);

        blindSpell.spell(wolfGroup1);
        blindSpell.spell(dragon);
        blindSpell.spell(giant);

        bindSpell.spell(dragon);
    }
}
