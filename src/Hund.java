public class Hund extends Pattedyr
{
    public Hund(String navn, String type)
    {
        super(navn, type);
    }

    @Override
    public String givLyd(){
        return "Vuf!";
    }
}
