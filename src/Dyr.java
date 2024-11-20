public abstract class Dyr
{
    protected String navn;
    protected String type;

    public Dyr(String navn, String type){
        this.navn = navn;
        this.type = type;
    }

    public String givLyd()
    {
        return "ubestemt lyd";
    }
}