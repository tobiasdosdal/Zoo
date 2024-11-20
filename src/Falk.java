interface KanFlyve {
    public void flyv();
}

public class Falk extends Fugl implements KanFlyve
{
    public Falk(String navn, String type)
    {
        super(navn, type);
    }

    @Override
    public String givLyd(){
        return super.givLyd();
    }
}
