public abstract class Fugl extends Dyr
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

    public void flyv()
    {
        System.out.println(navn + " flyver gennem luften");
    }
}