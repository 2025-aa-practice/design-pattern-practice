package aa.dp;

import java.util.List;
import java.util.Objects;

public class WolfGroup implements IWolf {
    private final List<IWolf> wolfs;


    public WolfGroup(
            final List<IWolf> wolfs) {
        this.wolfs = Objects.requireNonNull(wolfs);
    }

    void add(
            final IWolf wolf) {

    }

    void remove(
            final IWolf wolf) {

    }

    @Override
    public void hitMagic() {

    }

    public List<IWolf> getWolfs() {
        return wolfs;
    }
}
