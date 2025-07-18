package aa.dp;

public class SpellBlind implements SpellShootable {
    @Override
    public void spell(WolfGroup target) {
        System.out.println("Cast blind to wolf group.");
        for(IWolf wolf:target.getWolfs()) {wolf.hitMagic(this);}
    }
    @Override
    public void spell(Wolf target) {
        System.out.println("The wolf is blinded, but it can still smell.");
    }

    @Override
    public void spell(Giant target) {
        System.out.println("Cast blind to Giant.");
        System.out.println("The giant is blind.");
    }

    @Override
    public void spell(Dragon target) {
        System.out.println("Cast blind to dragon.");
        System.out.println("The dragon is blind.");
    }

}
