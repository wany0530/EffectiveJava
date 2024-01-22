package chaptor01.item01.contents.flyweightpattern;

/**
 * 1. 싱글톤 패턴이랑 차이가 뭘까
 *      1-1 싱글톤 패턴은 클래스 자체가 오직 1개의 인스턴스만 허용
 *      1-2 플라이웨이트 패턴은 싱글톤이 아닌 클래스를 팩토리에서 제어
 */
public class Client
{
    public static void main(String[] args)
    {
//        Charactor c1 = new Charactor('h', "white", "Nanum", 12);
//        Charactor c2 = new Charactor('e', "white", "Nanum", 12);
//        Charactor c3 = new Charactor('l', "white", "Nanum", 12);
//        Charactor c4 = new Charactor('l', "white", "Nanum", 12);
//        Charactor c5 = new Charactor('o', "white", "Nanum", 12);

        FontFactory fontFactory = new FontFactory();
        Charactor c1 = new Charactor('h', "white", fontFactory.getFont("nanum:12"));
        Charactor c2 = new Charactor('e', "white", fontFactory.getFont("nanum:12"));
        Charactor c3 = new Charactor('l', "white", fontFactory.getFont("nanum:12"));
        Charactor c4 = new Charactor('l', "white", fontFactory.getFont("nanum:12"));
        Charactor c5 = new Charactor('o', "white", fontFactory.getFont("nanum:12"));
    }
}
