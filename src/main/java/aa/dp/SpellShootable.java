package aa.dp;

// Visitor - Visitor
public interface SpellShootable {

    void spell(WolfGroup target);
    void spell(Wolf target);
    void spell(Giant target);
    void spell(Dragon target);
}
