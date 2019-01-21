import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadnjeSaStringomTest {

    RadnjeSaStringom radnje;
@Test
    public void duzinaStringaTest(){
     radnje = new RadnjeSaStringom();
    assertEquals(5, radnje.duzinaStringa("EmirE#! !"));
}
@Test
    public void karakteriNaParnimTest(){
    radnje = new RadnjeSaStringom();
    radnje.karakteriNaParnoj("EmirE#! !");
    assertEquals("EiE", radnje.karakteriNaParnoj("EmirE#! !"));
}

@Test
    public void karakteriNaNeparnimTest(){
    radnje = new RadnjeSaStringom();
    radnje.karakteriNaNeparnoj("EmirE#! !");
    assertEquals("mr",radnje.karakteriNaNeparnoj("EmirE#! !"));
}
@Test
    public void brojUppercaseKarakteraTest(){
    radnje = new RadnjeSaStringom();
    radnje.brojUppercaseKaraktera("EmirE#! !");
    assertEquals(2, radnje.brojUppercaseKaraktera("EmirE#! !"));
}
    @Test
    public void brojLowercaseKarakteraTest(){
        radnje = new RadnjeSaStringom();
        radnje.brojLowercaseKaraktera("EmirE#! !");
        assertEquals(3, radnje.brojLowercaseKaraktera("EmirE#! !"));
    }
    @Test
    public void nijeSlovoTest(){
        radnje = new RadnjeSaStringom();
        radnje.nijeSlovo("EmirE#! !");
        assertEquals("#!!", radnje.nijeSlovo("EmirE#! !"));
    }


}