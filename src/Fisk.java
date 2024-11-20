interface KanSvoemme
{
    public void svoem();
}

public class Fisk extends Dyr implements KanSvoemme
{
    public Fisk(String navn, String type)
    {
        super(navn, type);
    }

    @Override
    public String givLyd()
    {
        return "Blob blob";
    }

    @Override
    public void svoem()
    {
        System.out.println(navn + " svømmer gennem vandet");
    }
}