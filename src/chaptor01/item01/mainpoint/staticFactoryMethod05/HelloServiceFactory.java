package chaptor01.item01.mainpoint.staticFactoryMethod05;

//import chaptor01.item01.mainpoint.staticFactoryMethod03_04.ChineseHelloService;

/**
 *
 *     정적 팩토리 메소드의 장점 05 : 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다. (서비스 제공자 프레임워크)
 *     대표적인 예가 jdbc 드라이버이다.
 *
 *
 *     1번을 에로들어
 *     ServiceLoader<HelloService> loader << 여기를 보면 <HelloService> 부분에 인터페이스만 있고 구현체가 존재하지 않아도 된다는 말 그대로이다.
 *
 *     해당 프로젝트에 반환할 해당 객체(ex: ChineseHelloService.java)가 없더라도,
 *     서비스(다른 프로젝트에서 ChineseHelloService.java를 작성해 여기 프로젝트의 jar파일로 등록)에 올라와 있으면
 *     ServiceLoader<HelloService>에서 HelloService 인터페이스를 상속하는 객체들을 모두 가지고오는데 여기서 아래 코드처럼 ifPresent로 sout을 하면 ChineseHelloService.hello가 출력된다.
 *
 *     즉
 *     자바가 제공하는 정적 팩토리 메서드인 ServiceLoader가 있어서 load 메서드를 통해 다른 구현체를 불러올 수 있다.
 *     이렇게 사용하면 의존성을 줄일 수 있는데, 2번같은경우 ChineseHelloService클래스가 여기 프로젝트에 직접 파일이 존재해야 가능한 기능으로.
 *     의존성이 강하다고 볼수 있다.
 *
 *     의존성이 낮을수록 좋은 코드이다.
 *
 */
public class HelloServiceFactory
{
//    public static void main(String[] args)
//    {
//        1번
//        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
//        Optional<HelloService> options = loader.findFirst();
//        options.ifPresent(h -> {
//            System.out.println(h.hello());
//        });
//
//        2번
//        HelloService helloService = new ChineseHelloService();
//        System.out.println(helloService.hello());
//    }




}
