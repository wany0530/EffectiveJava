package chaptor01.item01.contents.flyweightpattern;

/**
 * [공유하는 객체]이기 때문에 불변으로 선언(final)
 * 생성자로만 선언 + getter 접근
 */

public final class Font
{
    final String family;
    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily()
    {
        return family;
    }

    public int getSize()
    {
        return size;
    }
}
