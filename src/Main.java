import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        List<Dyr> dyreliste = new ArrayList<Dyr>();

        dyreliste.add(new Hund("Fido", "Hund"));
        dyreliste.add(new Falk("Ørn", "Fugl"));
        dyreliste.add(new Haj("Gert K", "Haj"));

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