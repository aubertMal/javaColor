package aubert.color.model;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.assertEquals;
//
//public class ColorTest {
//    private Color color;
//
//    @Before
//    @Test
//    public void testColor(){
//        color = new Color(153,51,102);
//    }
//
//    @After
//    public void tearDown() {
//        color = null;
//    }
//
//    @Test
//    public void testGetRed(){
//        assertEquals(153, color.getRed());
//    }
//
//    @Test
//    public void testGetGreen(){
//        assertEquals(51, color.getGreen());
//    }
//
//    @Test
//    public void testGetBlue(){
//        assertEquals(102, color.getBlue());
//    }
//
//    @Test
//    public void testSetBlue(){
//        color.setBlue(56);
//        assertEquals(56, color.getBlue());
//    }
//
//    @Test
//    public void testSetRed(){
//        color.setRed(70);
//        assertEquals(70, color.getRed());
//    }
//
//    @Test
//    public void testSetGreen(){
//        color.setGreen(70);
//        assertEquals(70, color.getGreen());
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetWrongGreen(){
//        color.setGreen(300);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetWrongRed(){
//        color.setRed(300);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetWrongBlue(){
//        color.setBlue(300);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetWrongColorWithBlue(){
//        color = new Color(150, 20,350);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetWrongColorWithGreen(){
//        color = new Color(150, 300,20);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetWrongColorWithRed(){
//        color = new Color(300, 20,150);
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetColorCodeMissingSharp(){
//        color = new Color("FFFFFF");
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetColorCodeMissingColor(){
//        color = new Color("#FFFF");
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetWrongColorCode(){
//        color = new Color("#FFFFMM");
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testSetWrongColorCodeLegth(){
//        color = new Color("#FF");
//    }
//
//    @Test
//    public void testGetColorCode(){
//        color = new Color ("#993366");
//        assertEquals("#993366", color.getHexValue());
//    }
//
//    @Test
//    public void testSetColorCode(){
//        color.setHexValue("#336699");
//        assertEquals("#336699", color.getHexValue());
//    }
//
//    @Test
//    public void testToString(){
//        assertEquals("[value=#993366, r=153, g=51, b=102]",color.toString("#993366"));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testToStringWrongColorCodeWithoutSharp(){
//        assertEquals("[value=#993366, r=153, g=51, b=102]",color.toString("993366"));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testToStringWrongColorCodeWithWrongRed(){
//        assertEquals("[value=#MM3366, r=153, g=51, b=102]",color.toString("#MM3366"));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testToStringWrongColorCodeWithWrongGreen(){
//        assertEquals("[value=#99MM66, r=153, g=51, b=102]",color.toString("#99MM66"));
//    }
//
//    @Test(expected = IllegalArgumentException.class)
//    public void testToStringWrongColorCodeWithWrongBlue(){
//        assertEquals("[value=#9933MM, r=153, g=51, b=102]",color.toString("#993366MM"));
//    }
//}
//***********************TESTS PETER************************
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ColorTest {

    // [value=#D58D35, r=213, g=141, b=53]
    private Color color;

    @Before
    public void setUp() {
        color = new Color(213, 141, 53);
    }

    @After
    public void tearDown() {
        color = null;
    }

    // -----------------------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------------------

    // -------------------------------------
    // Constructor Color(r, g, b)
    @Test
    public void test_constructor_RGB() {
        assertEquals("getRed() est incorrect", 213, color.getRed());
        assertEquals("getGreen() est incorrect", 141, color.getGreen());
        assertEquals("getBlue() est incorrect", 53, color.getBlue());
        assertEquals("getHexValue() est incorrect", "#D58D35", color.getHexValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_RGB_with_red_value_smaller_than_0_Exception() {
        color = new Color(-3, 141, 53);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_RGB_with_red_value_bigger_than_255_Exception() {
        color = new Color(264, 141, 53);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_RGB_with_green_value_smaller_than_0_Exception() {
        color = new Color(213, -31, 53);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_RGB_with_green_value_bigger_than_255_Exception() {
        color = new Color(213, 421, 53);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_RGB_with_blue_value_smaller_than_0_Exception() {
        color = new Color(213, 141, -132);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_RGB_with_blue_value_bigger_than_255_Exception() {
        color = new Color(213, 141, 533);
    }

    // -------------------------------------
    // Constructor Color(hexValue)
    @Test
    public void test_constructor_HexValue() {
        color = new Color("#D58D35");
        assertEquals("getRed() est incorrect", 213, color.getRed());
        assertEquals("getGreen() est incorrect", 141, color.getGreen());
        assertEquals("getBlue() est incorrect", 53, color.getBlue());
        assertEquals("getHexValue() est incorrect", "#D58D35", color.getHexValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_HexValue_with_null_value_Exception() {
        color = new Color(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_HexValue_with_wrong_value_1_Exception() {
        color = new Color("A26F76");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_HexValue_with_wrong_value_2_Exception() {
        color = new Color("#a26F76");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_HexValue_with_wrong_value_3_Exception() {
        color = new Color("#G26F76");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_HexValue_with_wrong_value_4_Exception() {
        color = new Color("#A26F7");
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_constructor_HexValue_with_wrong_value_5_Exception() {
        color = new Color("#A26F71E");
    }

    // -----------------------------------------------------------------------------
    // Override methods
    // -----------------------------------------------------------------------------
    @Test
    public void testToString_not_null() {
        assertNotNull(color.toString());
    }

    @Test
    public void testToString() {
        assertEquals("toString() est incorrect", "[value=#D58D35, r=213, g=141, b=53]", color.toString());
    }

    // -----------------------------------------------------------------------------
    // Getters
    @Test
    public void testGetRed() {
        assertEquals("getRed() est incorrect", 213, color.getRed());

        assertEquals("getGreen() est incorrect", 141, color.getGreen());
        assertEquals("getBlue() est incorrect", 53, color.getBlue());
        assertEquals("getHexValue() est incorrect", "#D58D35", color.getHexValue());
    }

    @Test
    public void testGetGreen() {
        assertEquals("getGreen() est incorrect", 141, color.getGreen());

        assertEquals("getRed() est incorrect", 213, color.getRed());
        assertEquals("getBlue() est incorrect", 53, color.getBlue());
        assertEquals("getHexValue() est incorrect", "#D58D35", color.getHexValue());
    }

    @Test
    public void testGetBlue() {
        assertEquals("getBlue() est incorrect", 53, color.getBlue());

        assertEquals("getRed() est incorrect", 213, color.getRed());
        assertEquals("getGreen() est incorrect", 141, color.getGreen());
        assertEquals("getHexValue() est incorrect", "#D58D35", color.getHexValue());
    }

    @Test
    public void testGetHexValue() {
        assertEquals("getHexValue() est incorrect", "#D58D35", color.getHexValue());

        assertEquals("getRed() est incorrect", 213, color.getRed());
        assertEquals("getGreen() est incorrect", 141, color.getGreen());
        assertEquals("getBlue() est incorrect", 53, color.getBlue());
    }

    // -----------------------------------------------------------------------------
    // Setters
    // -----------------------------------------------------------------------------

    // -------------------------------------
    // RED
    @Test
    public void testSetRed() {
        color.setRed(25);
        assertEquals("getRed() est incorrect", 25, color.getRed());

        assertEquals("getGreen() est incorrect", 141, color.getGreen());
        assertEquals("getBlue() est incorrect", 53, color.getBlue());
        assertEquals("getHexValue() est incorrect", "#198D35", color.getHexValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRed_with_value_bigger_than_255_Exception() {
        color.setRed(425);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetRed_with_value_smaller_than_0_Exception() {
        color.setRed(-12);
    }

    // -------------------------------------
    // GREEN
    @Test
    public void testSetGreen() {
        color.setGreen(215);
        assertEquals("getGreen() est incorrect", 215, color.getGreen());

        assertEquals("getRed() est incorrect", 213, color.getRed());
        assertEquals("getBlue() est incorrect", 53, color.getBlue());
        assertEquals("getHexValue() est incorrect", "#D5D735", color.getHexValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGreen_with_value_bigger_than_255_Exception() {
        color.setGreen(615);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetGreen_with_value_smaller_than_0_Exception() {
        color.setGreen(-132);
    }

    // -------------------------------------
    // BLUE
    @Test
    public void testSetBlue() {
        color.setBlue(134);
        assertEquals("getBlue() est incorrect", 134, color.getBlue());

        assertEquals("getRed() est incorrect", 213, color.getRed());
        assertEquals("getGreen() est incorrect", 141, color.getGreen());
        assertEquals("getHexValue() est incorrect", "#D58D86", color.getHexValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBlue_with_value_bigger_than_255_Exception() {
        color.setBlue(731);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetBlue_with_value_smaller_than_0_Exception() {
        color.setBlue(-1);
    }

    // -------------------------------------
    // HEX VALUE
    @Test
    public void testSetHexValue() {
        color.setHexValue("#A26F76");
        assertEquals("getHexValue() est incorrect", "#A26F76", color.getHexValue());

        assertEquals("getRed() est incorrect", 162, color.getRed());
        assertEquals("getGreen() est incorrect", 111, color.getGreen());
        assertEquals("getBlue() est incorrect", 118, color.getBlue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHexValue_with_null_value_Exception() {
        color.setHexValue(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHexValue_with_wrong_value_1_Exception() {
        color.setHexValue("A26F76");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHexValue_with_wrong_value_2_Exception() {
        color.setHexValue("#a26F76");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHexValue_with_wrong_value_3_Exception() {
        color.setHexValue("#G26F76");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHexValue_with_wrong_value_4_Exception() {
        color.setHexValue("#A26F7");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetHexValue_with_wrong_value_5_Exception() {
        color.setHexValue("#A26F71E");
    }
}