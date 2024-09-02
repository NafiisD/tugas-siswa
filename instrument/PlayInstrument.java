package instrument;

import java.util.Scanner;

/**
 * PlayInstrument
 */

public class PlayInstrument {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Instrument a = new Instrument();
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setPrice(101.5);
        a.setType("Guitar");
        a.print();
        b.print();
        c.print();
    }
}
