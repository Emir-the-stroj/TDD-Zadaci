import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KonverterTest {
    Konverter tester;

    @Test
    public void konvertovanjeKilaUFunte (){
      tester = new Konverter();
        assertEquals(tester.kilogrameUFunte(100, 2.204), 220,4);
        assertEquals(tester.kilogrameUFunte(0, 2.204), 0);
    }

    @Test
    public void konvertovanjeFuntiUKile (){
        tester = new Konverter();
        assertEquals(tester.funteUKIlograme(50.00, 2.204), 22, 68);
        assertEquals(tester.kilogrameUFunte(0, 2.204), 0);
    }
    @Test
    public void konvertovanjeCentiUInche (){
        tester = new Konverter();
        assertEquals(tester.centiUInche(50.00, 2.54),19,68);
        assertEquals(tester.centiUInche(0, 2.54),0);
    }

    @Test
    public void konvertovanjeInchiUCente (){
        tester = new Konverter();
        assertEquals(tester.inchiUCente(50.00, 2.54), 127);
        assertEquals(tester.inchiUCente(0, 2.54),0);
    }

    @Test
    public void konvertovanjeCelzijusaUFahrenheit (){
        tester = new Konverter();
        assertEquals(tester.celzijusiUFahrenheite(50.00, 1.8000, 32.00), 122);
        assertEquals(tester.celzijusiUFahrenheite(0, 1.8000, 32.00),32);
    }

    @Test
    public void konvertovanjeFahrenheitaUCelzijus (){
        tester = new Konverter();
        assertEquals(tester.fahrenheitUCelzijus(50.00, 32.00, 1.8000),10);
        assertEquals(tester.fahrenheitUCelzijus(0, 32.00, 1.8000),-17,77);
    }


}
