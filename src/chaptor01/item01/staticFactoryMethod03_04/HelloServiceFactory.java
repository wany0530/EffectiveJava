package chaptor01.item01.staticFactoryMethod03_04;

/**
 *
 *     정적 팩토리 메소드의 장점 03 : 메소드 타입을 인터페이스로 사용할 수 있다.
 *     아래 코드 처럼 정적 팩토리 메소드를 사용할 때, 타입을 인터페이스를 사용할수 있을뿐더러,
 *     리턴하는 반환하는 객체는 해당 인터페이스를 상속받은 객체들을 리턴 해줄수있다. (KoreanHelloService는 implement로 HelloService를 상속함)
 *
 *     정적 팩토리 메소드의 장점 04 : 메소드 타입이 인터페이스 타입일 때 반환하는 반환타입은,
 *     인터페이스 타입에 얼마든지 호환 가능한 다른 타입들의 인스턴스를 리턴 해도 된다. ( return KoreanHelloService, return EnglishHelloService 처럼)
 * public class HelloServiceFactory
 * {
 *     public static HelloService of(String lang)
 *     {
 *         if("ko".equals(lang))
 *         {
 *             return new KoreanHelloService();
 *         }
 *         else
 *         {
 *             return new EnglishHelloService();
 *         }
 *     }
 * }
 */
public class HelloServiceFactory
{
    public static HelloService of(String lang)
    {
        if ("ko".equals(lang))
        {
            return new KoreanHelloService();
        }
        else
        {
            return new EnglishHelloService();
        }
    }
}
