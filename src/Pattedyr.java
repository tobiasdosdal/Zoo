public class Pattedyr extends Dyr
{
    public Pattedyr(String navn, String type)
    {
        super(navn, type);
    }

    @Override
    public String givLyd()
    {
        return "Pattedyr givs lyd";
    }
}
