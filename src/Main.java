import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Dyr> dyreliste = new ArrayList<Dyr>();

        dyreliste.add(new Pattedyr("Fido", "Hund"));
        dyreliste.add(new Fugl("Ørn", "Fugl"));
        dyreliste.add(new Fisk("Gert K", "Haj"));

        for (Dyr dyr : dyreliste)
        {
            System.out.println(dyr.givLyd());

            if (dyr instanceof KanFlyve)
            {
                ((KanFlyve) dyr).flyv();
            }
            if (dyr instanceof KanSvoemme)
            {
                ((KanSvoemme) dyr).svoem();
            }
        }
    }
}