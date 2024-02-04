package chaptor01.item02.contents.varargs;

import java.util.Arrays;

/**
 * 가변 인수 : 여러 인자를 받을 수 있는 가변적인 argument
 *
 * 1. 가변인수는 메소드에 오직 하나만 선언할 수 있다.
 * 2. 가변인수는 메서드의 가장 마지막 매개변수가 되어야 한다.
 *
 */
public class VaragrsSamples
{
    public void printNumbers(int... numbers)
    {
        System.out.println(numbers.getClass().getCanonicalName()); // 어떤 타입인지 알려주는 메소드 getCanonicalName() -> 여기서는 int[]
        System.out.println(numbers.getClass().getComponentType()); // 해당 배열이 어떤 타입인지. getComponentType() -> 여기서는 int
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void main(String[] args) {
        VaragrsSamples samples = new VaragrsSamples();
        samples.printNumbers(1,20,30,20,39,50);
    }
}
