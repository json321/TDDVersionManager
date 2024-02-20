import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class VesrionManagerTest {

    private final VesrionManager vers = new VesrionManager();

    @Test
    @DisplayName("add 100")
    public void majeur() {
        vers.majeur();
        assertEquals(100, vers.getVersion() );
    }

    @Test
    @DisplayName("add 10")
    public void mineur() {
        vers.mineur();
        assertEquals(10,vers.getVersion() );
    }

    @Test
    @DisplayName("add 1")
    public void patch() {
        vers.patch();
        assertEquals(1, vers.getVersion());
    }

    @Test
    @DisplayName("test getteur")
    public void getVersion() {
        assertEquals(0, vers.getVersion());
    }

    @Test
    @DisplayName("test setter")
    public void setVersion() {
        vers.setVersion(777);
        assertEquals(777, vers.getVersion());

    }

    @Test
    @DisplayName("test majeur triple")
        public void triple() {
        
        vers.majeur();
        vers.majeur();
        vers.majeur();
        assertEquals(300, vers.getVersion());
    }



}