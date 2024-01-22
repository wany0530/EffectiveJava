package chaptor01.item01.contents.flyweightpattern;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. FontFactory의 getFont() 메소드를 통해 Font 생성하게 되면, HashMap에 데이터가 있는지 먼저 검사하게 된다.
 * 2. 기존에 저장해둔 Font 인스턴스가 있다면, 새로 생성하지 않고 기존 인스턴스를 반환해준다.
 */

public class FontFactory
{
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font)
    {
        if(cache.containsKey(font))
        {
            return cache.get(font);
        }
        else
        {
            String[] split = font.split(":");
            Font newfont = new Font(split[0], Integer.parseInt(split[1])); //폰트이름, 폰트사이즈 분리
            cache.put(font, newfont);
            return newfont;
        }
    }
}
