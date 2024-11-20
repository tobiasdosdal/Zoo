public class Main
{
    public static void main(String[] args)
    {
        Dyr hund = new Pattedyr("Fido", "Hund");
        Dyr falk = new Fugl("Ørn", "Fugl");
        Dyr haj = new Fisk("Gert K", "Haj");

        System.out.println(hund.givLyd());
        System.out.println(falk.givLyd());
        System.out.println(haj.givLyd());

        if (falk instanceof KanFlyve) {
            ((KanFlyve)falk).flyv();
        }
        if (haj instanceof KanSvoemme) {
            ((KanSvoemme)haj).svoem();
        }
    }
}