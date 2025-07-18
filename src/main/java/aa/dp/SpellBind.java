package aa.dp;

public class SpellBind implements SpellShootable {
    @Override
    public void spell(WolfGroup target) {
        System.out.println("늑대 무리에게 발묶기 마법을 사용합니다.");
        for(IWolf wolf:target.getWolfs()) {wolf.hitMagic(this);}
    }

    @Override
    public void spell(Wolf target) {
        System.out.println("늑대의 발이 묶였습니다.");
    }

    @Override
    public void spell(Giant target) {
        System.out.println("거인에게 발묶기 마법을 사용합니다.");
        System.out.println("거인의 발이 묶였습니다.");
    }

    @Override
    public void spell(Dragon target) {
        System.out.println("용에게 발묶기 마법을 사용합니다.");
        System.out.println("하늘을 나는 용은 발이 묶이지 않습니다..");
    }

}
