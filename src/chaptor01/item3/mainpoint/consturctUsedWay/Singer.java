package chaptor01.item3.mainpoint.consturctUsedWay;


/**
 * 아이템3. 생성자나 열거타입으로 싱글턴임을 보증하라.
 *
 * 첫번째 방법 : private 생성자 + public static final 필드
 *
 * 장점 : 간결하고 싱글턴임을 API에 들어낼 수 있다.
 *
 * 단점 1 : 싱글톤을 사용하는 클라이언트 코드를 테스트하기 어려워진다. (이 Concert라는 클라스 자체가 singer의 클라이언트 코드라고 보면 됨)
 *          즉 이 오퍼레이션 자체가 외부 네트워크를 거쳐 다른 api를 호출하거나 되게 연산이 오래걸리는 오퍼레이션일 경우 매우 비효율 적이기때문에.
 *          interface를 통해 테스트를 진행하면 된다.
 * 단점 2 : 리플렉션으로 private 생성자를 호출할 수 있다.
 * 단점 3 : 역직렬화 할 때, 새로운 인스턴스가 생길 수 있다.
 *
 */
public class Singer
//public class Singer implements ISinger
{
    public static final Singer INSTANCE = new Singer();

    private Singer() {}

    public void leaveTheBuilding()
    {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing()
    {
        System.out.println("i'll have a blue~ Christmas without you~");
    }

    public static void main(String[] args)
    {
        Singer elvis = Singer.INSTANCE;
        elvis.leaveTheBuilding();
    }
}

class OtherSinger
{
    private static final OtherSinger instance = new OtherSinger();

    private OtherSinger() {}

    public static OtherSinger getInstance()
    {
        return instance;
    }

    public void leaveTheBuilding()
    {
        System.out.println("Whoa baby, I'm outta here!");
    }

    public void sing()
    {
        System.out.println("i'll have a blue~ Christmas without you~");
    }

    public static void main(String[] args)
    {
        OtherSinger otherElvis = OtherSinger.getInstance();
        otherElvis.leaveTheBuilding();
    }
}

class CoverSinger implements ISinger
{
    @Override
    public void leaveTheBuilding()
    {
        System.out.println("Whoa baby, I'm outta here!");
    }

    @Override
    public void sing()
    {
        System.out.println("i'll have a blue~ Christmas without you~");
    }

    public static void main(String[] args)
    {
        OtherSinger otherElvis = OtherSinger.getInstance();
        otherElvis.leaveTheBuilding();
    }
}
