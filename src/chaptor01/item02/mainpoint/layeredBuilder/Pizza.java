package chaptor01.item02.mainpoint.layeredBuilder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;


/**
 *
 * 추상 메서드 - abstract class : IS A
 * 추상 메서드는 A is a B 라는 특징을 갖는다.
 * 예를 들어서 '강아지는 동물이다', '핸드폰은 전자기기이다' 갖은 경우 우리는 각각 동물, 전자기기를 추상 클래스로 만들고, 각각 강아지, 핸드폰으로 구현하게 된다.
 * 즉, 추상 메서드는 A is a B 라는 특징으로 구제적인 A 가 추상적인 B 에 포함된다 라는 느낌이라고 생각하면 된다.
 *
 * 인터페이스 - interface : HAS A
 * 반면 인터페이스는 A has a B 라는 특징을 갖는다. 예를 들어서 '강아지는 달리는 능력이 있다',
 * '핸드폰은 인터넷 기능이 있다' 라는 것이다.
 * 즉 인터페이스는 A 가 B 라는 기능, 능력을 갖는다에 초점을 갖는다.
 * 만약 추상 클래스의 is a 가 된다면 추상적 개념인 '달린다' 에 강아지가 포함되어야 하는데 실제로는 이렇지 않다.
 * 물론 각각 '달린다', '인터넷' 이라는 추상적인 개념이 있지만, 실제로 달린다에 강아지가 포함되는 것이 아니고, 핸드폰이 인터넷에 포함되지 않는다.
 * 달린다와 인터넷은 강아지와 핸드폰 기능(능력)의 일부분 일 뿐이다.
 *
 * 코드 2-4 계층적으로 설계된 클래스와 잘 어울리는 빌더 패턴 (19쪽)
 *
 * 참고 : 여기서 사용한 '시뮬레이트한 셀프 타입(simulated self-type)' 관용구는
 * 빌더 뿐 아니라 임의의 유동적인 계층구조를 허용한다.
 */
public abstract class Pizza
{
    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>>
    {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping)
        {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        // 하위 클래스는 이 메서드를 재정의(overriding)하여
        // "this"를 반환하도록 해야 한다.
        protected abstract T self();
    }

    public Pizza(Builder<?> builder)
    {
        this.toppings = builder.toppings.clone();
    }
}
