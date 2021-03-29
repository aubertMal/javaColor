package aubert.color.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorTest {
    private Color color= new Color(153,51,102);

    @Test
    public void testGetRed(){
        assertEquals(153, color.getRed());
    }

    @Test
    public void testGetGreen(){
        assertEquals(51, color.getGreen());
    }

    @Test
    public void testGetBlue(){
        assertEquals(102, color.getBlue());
    }
}
