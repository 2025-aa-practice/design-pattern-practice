package aa.dp;

public class User {

    private static final SpellShootable blindSpell = new SpellBlind();
    private static final SpellShootable
            bindSpell = new SpellBind();

    public static void main(
            final String[] args) {
        Monster dragon = new Dragon();
        Monster giant = new Giant();

        WolfGroup wolfGroup1 = new WolfGroup();
        WolfGroup wolfGroup2 = new WolfGroup();

        wolfGroup1.add(new Wolf("Wolf1-1"));
        wolfGroup1.add(new Wolf("Wolf1-2"));
        wolfGroup2.add(new Wolf("Wolf2-1"));
        wolfGroup1.add(wolfGroup2);
        wolfGroup1.printWolf();

        blindSpell.spell(wolfGroup1);
    }
}
