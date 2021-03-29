package aubert.color.model;

public class Color {
    private int red;
    private int green;
    private int blue;
    private String hexValue;

    public Color(int red, int green, int blue) throws IllegalArgumentException{
        if ((red <0 || red >255) || (green <0 || green >255) || (blue<0 || blue >255))
            throw  new IllegalArgumentException("la valeur spécifiée est erronnée");
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Color(String hexColor) throws IllegalArgumentException{
        if (!hexColor.matches("#[a-fA-F0-9]{6}"))
            throw new IllegalArgumentException("Le code couleur est incorrect");
        this.hexValue = hexColor;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }
}
