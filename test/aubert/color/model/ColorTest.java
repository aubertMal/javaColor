package aubert.color.model;

import org.junit.After;
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

    @After
    public void tearDown() {
        color = null;
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
        assertEquals(70, color.getGreen());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongGreen(){
        color.setGreen(300);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongRed(){
        color.setRed(300);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongBlue(){
        color.setBlue(300);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongColorWithBlue(){
        color = new Color(150, 20,350);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongColorWithGreen(){
        color = new Color(150, 300,20);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongColorWithRed(){
        color = new Color(300, 20,150);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColorCodeMissingSharp(){
        color = new Color("FFFFFF");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetColorCodeMissingColor(){
        color = new Color("#FFFF");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongColorCode(){
        color = new Color("#FFFFMM");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetWrongColorCodeLegth(){
        color = new Color("#FF");
    }

    @Test
    public void testGetColorCode(){
        color = new Color ("#993366");
        assertEquals("#993366", color.getHexValue());
    }

    @Test
    public void testSetColorCode(){
        color.setHexValue("#336699");
        assertEquals("#336699", color.getHexValue());
    }

    @Test
    public void testToString(){
        assertEquals("[value=#993366, r=153, g=51, b=102]",color.toString("#993366"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToStringWrongColorCodeWithoutSharp(){
        assertEquals("[value=#993366, r=153, g=51, b=102]",color.toString("993366"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToStringWrongColorCodeWithWrongRed(){
        assertEquals("[value=#MM3366, r=153, g=51, b=102]",color.toString("#MM3366"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToStringWrongColorCodeWithWrongGreen(){
        assertEquals("[value=#99MM66, r=153, g=51, b=102]",color.toString("#99MM66"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testToStringWrongColorCodeWithWrongBlue(){
        assertEquals("[value=#9933MM, r=153, g=51, b=102]",color.toString("#993366MM"));
    }
}
