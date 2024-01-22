package chaptor01.item01.contents.reflect;

import chaptor01.item01.mainpoint.staticFactoryMethod03_04.HelloService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 *
 * 원리
 * 클래스의 정보는 클래스 로더가 jvm에 들어있는 클래스 로더가 읽어드리고, 해당 정보를 메모리 어딘가에 둔다.
 * 그 정보가 곧 그렇게 읽어드린 클래스의 정보가 곧 거울에 비친 모습이라고 보면된다.
 * 그안에는 어떤 Construct, Method, Field들이 있는지 아주 자세하게 거의 모든 정보들이 담겨져 있다.(private까지)
 *
 * 1. 클래스로더를 통해 읽어온 클래스 정보("거울에 반사"된 정보)를 사용하는 기술
 * 2. 리플렉션을 사용해 클래스를 읽어오거나, 인스턴스를 만들거나, 메소드를 실행하거나, 필드값을 가져오거나 변경하는 것이 가능하다.
 *
 * 3. 언제사용할까?
 *      3-1 특정 애노테이션이 붙어있는 필드 또는 메소드 읽어오기(JUnit, Spring)
 *      3-2 특정 이름 패턴에 해당하는 메소드 목록 가져와 호출하기 (getter, setter)
 */
public class Reflect
{
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
        Class<?> aClass = Class.forName("chaptor01.item01.mainpoint.staticFactoryMethod03_04.KoreanHelloService");
        Constructor<?> constructor = aClass.getConstructor();
        HelloService helloService = (HelloService) constructor.newInstance(); //해당 클래스의 특정 인스턴스를 만들수 있다. 사기다 이건.
//        System.out.println(helloService.hello());

//        해당 클래스에 있는 정보들을 몰랐을때는, getDeclared를 통해 알수있다. 심지어 Private 필드, 메소드도 알 수 있다.
//
//        메소드를 몰랐을 때,
//        aClass.getDeclaredMethods();

//        변수를 몰랐을 때,
//        aClass.getDeclaredFields();
    }
}
