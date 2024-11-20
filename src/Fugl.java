interface KanFlyve {
    public void flyv();
}

public class Fugl extends Dyr implements KanFlyve
{
    public Fugl(String navn, String type)
    {
        super(navn, type);
    }

    @Override
    public String givLyd()
    {
        return "Pip Pip";
    }

    @Override
    public void flyv()
    {
        System.out.println(navn + " flyver gennem luften");
    }
}