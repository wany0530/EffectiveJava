package chaptor01.item01.contents.enumeration;

/**
 * 0. 열거 타입은 인스턴트가 하나만 만들어짐을 보장한다.
 * 1. 상수 목록을 담을 수 있는 데이터 타입.
 * 2. 특정한 변수가 가질  수 있는 값을 제한할 수 있다. (중요) 타입-세이프티(Type-Safety)를 보장할 수 있다.
 * 3. 싱글톤 패턴을 안전하게 구현하는 방법 중 하나로 Enum을 쓰는 방법이 있다.
 *
 * 4. 질문1) 특정 enum 타입이 가질 수 있는 모든 값을 순회하며 출력하라.
 *      정답 1) Arrays.stream(Enumeration.values()).forEach(System.out::println);
 *
 * 5. 질문2) enum은 자바의 클래스처럼 생성자, 메소드, 필드를 가질 수 있는가?
 *      정답 2) YES
 *
 * 6. 질문3) enum의 값은 == 연산자로 동일성을 비교할 수 있는가?
 *      정답 3) YES
 *
 * 7. 과제) enum을 key로 하용하는 Map을 정의하세요. 또는 enum을 담고 있는 Set을 만들어 보세요.
 *      Map ) Map<Enumeration, Integer> map = new EnumMap<>(Enumeration.class);
 *      Set ) EnumSet<Enumeration> set = EnumSet.allOf(Enumeration.class);
 */
public enum Enumeration
{
    PREPARING(1), SHIPPED(2), DELIVERING(3), DELIVERED(4);

    private int number;

    Enumeration(int num)
    {
        this.number = num;
    }
}
