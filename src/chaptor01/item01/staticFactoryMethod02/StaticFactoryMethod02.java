package chaptor01.item01.staticFactoryMethod02;
/**
 *     정적 팩토리 메소드의 장점 02 : 호출할 때마다 인스턴스를 새로 생성하지 않아도 된다.
 *     대표적인 예로 Boolean.valueOF(boolean boolean) 메서드는 객체를 아예 생성하지 않는다.
 *
 *     반복되는 요청에 같은 객체를 반환하는식으로 정적 팩토리 방식의 클래스는 언제 어느 인스턴스를 살아 있게 할지를 철저히 통제할 수 있다.
 *
 *     public static void main(String[] args)
 *     {
 *         System.out.println(new StaticFactoryMethod02());
 *         System.out.println(new StaticFactoryMethod02());
 *         System.out.println(new StaticFactoryMethod02());
 *     }
 */
public class StaticFactoryMethod02
{
    private StaticFactoryMethod02() {} //기본 생성자가 private로 필수로 되어있어야한다.

    private static final StaticFactoryMethod02 STATIC_FACTORY_METHOD_02 = new StaticFactoryMethod02();

    public static StaticFactoryMethod02 getInstance()
    {
        return STATIC_FACTORY_METHOD_02;
    }
}
