package chaptor01.item01.contents.flyweightpattern;

public class Charactor
{
    private char value;
    private String color;
    private Font font;

    public Charactor(char value, String color, Font font)
    {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
