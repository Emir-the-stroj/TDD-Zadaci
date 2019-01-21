import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RacunskeOperacijeTest {

    RacunskeOperacije operacije;

    @Test
    public void sabiranjeTest(){
        operacije = new RacunskeOperacije();
        assertEquals(9, operacije.sabiranje(5,4));
    }
    @Test
    public void oduzimanjeTest(){
        operacije = new RacunskeOperacije();
        assertEquals(4, operacije.oduzimanje(9,5));
    }

    @Test
    public void mnozenjeTest (){
        operacije = new RacunskeOperacije();
        assertEquals(20, operacije.mnozenje(5,4));
    }

    public void dijeljenjeTest (){
        operacije = new RacunskeOperacije();
        assertEquals(6, operacije.dijeljenje(48,8));
    }
}