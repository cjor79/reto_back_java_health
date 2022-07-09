package co.com.sofka.javahealth;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

 class BFITest {
    @Test
     void getFemaleBFI() throws Exception{
        BFIFactory BFIFactory = new BFIFactory();
        double igc = BFIFactory.getBFI(22, 'f', 27);
        assertEquals(27.21,igc,0.2);
    }

    @Test
     void getMaleBFI() throws Exception{
        BFIFactory BFIFactory = new BFIFactory();
        double igc = BFIFactory.getBFI(27.68, 'm', 23);
        assertEquals(22.30,igc,0.2);
    }

    @Test
     void getOtherBFI() throws Exception{
        BFIFactory BFIFactory = new BFIFactory();
        double igc = BFIFactory.getBFI(27.68, 'o', 23);
        assertEquals(0,igc,0.2);
    }
}
