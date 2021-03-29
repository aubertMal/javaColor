package aubert.color.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorTest {
    private Color color;

    @Before
    @Test
    public void testColor(){
        color = new Color(153,51,102);
    }

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

    @Test
    public void testSetBlue(){
        color.setBlue(56);
        assertEquals(56, color.getBlue());
    }

    @Test
    public void testSetRed(){
        color.setRed(70);
        assertEquals(70, color.getRed());
    }

    @Test
    public void testSetGreen(){
        color.setGreen(70);
        assertEquals(25, color.getGreen());
    }
}
