package aa.dp;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class WolfGroup implements IWolf {
    private final List<IWolf> wolfs;

    public WolfGroup() {
        this.wolfs = new ArrayList<>();
    }

    void add(
            final IWolf wolf) {
    	wolfs.add(wolf);
    }

    void remove(
            final IWolf wolf) {
    	wolfs.remove(wolf);
    }

    public List<IWolf> getWolfs() {
        return wolfs;
    }

    @Override
    public void hitMagic(SpellShootable spell) {
        wolfs.forEach(wolf -> wolf.hitMagic(spell));
    }

	@Override
	public void printWolf() {
    	System.out.println(getClass().getSimpleName() + " contains : ");
    	wolfs.forEach(IWolf::printWolf);
	}
}
