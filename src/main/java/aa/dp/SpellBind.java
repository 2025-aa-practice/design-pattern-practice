package aa.dp;

public class SpellBind implements SpellShootable {
    @Override
    public void spell(WolfGroup target) {
        System.out.println("Cast bind to wolf group.");
        for(IWolf wolf:target.getWolfs()) {
            wolf.hitMagic(this);
        }
    }

    @Override
    public void spell(Wolf target) {
        System.out.println(target.getName() + " --> The wolf is binded.");
    }

    @Override
    public void spell(Giant target) {
        System.out.println(target.getName() + " --> Cast bind to Giant.");
        System.out.println(target.getName() + " --> The giant is binded");
    }

    @Override
    public void spell(Dragon target) {
        System.out.println(target.getName() + " --> Cast bind to Giant.");
        System.out.println(target.getName() + " --> The dragon cannot be binded.");
    }

}
