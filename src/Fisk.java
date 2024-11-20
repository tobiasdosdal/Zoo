public abstract class Fisk extends Dyr implements KanSvoemme
{
    public Fisk(String navn, String type)
    {
        super(navn, type);
    }

    public String givLyd()
    {
        return "Blob blob";
    }

    public void svoem()
    {
        System.out.println(navn + " svømmer gennem vandet");
    }
}