package aa.dp;

public class SpellBlind implements SpellShootable {
    @Override
    public void spell(WolfGroup target) {
        System.out.println("늑대 무리에게 눈멀기 마법을 사용합니다.");
        for(IWolf wolf:target.getWolfs()) {wolf.hitMagic(this);}
    }
    @Override
    public void spell(Wolf target) {
        System.out.println("늑대의 눈이 멀었지만 냄새를 맡습니다.");
    }

    @Override
    public void spell(Giant target) {
        System.out.println("거인에게 눈멀기 마법을 사용합니다.");
        System.out.println("거인은 눈이 멀었습니다.");
    }

    @Override
    public void spell(Dragon target) {
        System.out.println("용에게 눈멀기 마법을 사용합니다.");
        System.out.println("용은 눈이 멀었습니다.");
    }

}
