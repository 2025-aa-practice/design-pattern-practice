package aa.dp;

public class SpellBlind implements SpellShootable {
    @Override
    public void spell(WolfGroup target) {
        System.out.println(target.getName() + " --> Cast blind to wolf group.");

        for(IWolf wolf:target.getWolfs()) {
            wolf.hitMagic(this);
        }
    }
    @Override
    public void spell(Wolf target) {
        System.out.println(target.getName() + " --> The wolf is blinded, but it can still smell.");
    }

    @Override
    public void spell(Giant target) {
        System.out.println(target.getName() + " --> Cast blind to Giant.");
        System.out.println(target.getName() + " --> The giant is blind.");
    }

    @Override
    public void spell(Dragon target) {
        System.out.println(target.getName() + " --> Cast blind to dragon.");
        System.out.println(target.getName() + " --> The dragon is blind.");
    }

}
