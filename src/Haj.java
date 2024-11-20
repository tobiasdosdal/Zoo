interface KanSvoemme
{
    public void svoem();
}

public class Haj extends Fisk implements KanSvoemme
{
    public Haj(String navn, String type){
        super(navn, type);
    }

    @Override
    public String givLyd(){
        return "Haj siger blob blob haps";
    }
}
