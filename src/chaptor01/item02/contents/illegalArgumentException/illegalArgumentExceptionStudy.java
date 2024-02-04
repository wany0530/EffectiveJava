package chaptor01.item02.contents.illegalArgumentException;

import java.time.LocalDate;

/**
 * illegalArgumentException : 잘못된 인자를 넘겨 받았을 때 사용할 수 있는 기본 런타임 예외.
 *
 * 질문 1) checked exception과 unchecked exception의 차이는?
 *      답변 1-1) unchecked exception 들은 모두 Runtime Exception을 상속받았기 때문에, 개발자들이 직접 예외처리를 하지 않아도 된다.
 *               즉 프로그래밍적인 에러고, 그리고 복구할 수 있는 방법이 없기때문에 unchecked Exception이다.
 *
 *      답변 1-2) checked Exception이 발생했을때는 우리는 2가지를 대안이 있다.
 *               (1) try~catch block으로 잡아서 처리하거나, (2) Checked Exception을 throw를 통해 던져야한다.
 *
 * 질문 2) 간혹 메서드 선언부에 unchecked exception을 선언하는 이유는?
 *      답변 2) 클라이언트한테 직접 알려주고 싶을 때 너가 이런 파라미터를 이런 값으로 넘기면 이런 Exception이 발생할 수 있어라고 명시적으로 알려주고 싶을 때 선언할 수 있다.
 *
 * 질문 3) checked Exception은 왜 사용할까?
 *      그 에러가 발생했을 때, 클라이언트 코드가 어떤 후속 작업을 해주길 바라는 경우에 checked Exception을 쓰는것이 맞다. 그렇게 해서 클라이언트에게 어떤 액션을 강요하는것이다.
 *      그 예외가 발생했을 때 이러이러한 부가적인 작업을 할 수 있게끔 가령 커넥션 에러가 났을 때, 꼭 반드시 리트라이를 하게끔 강제하고 싶다.
 *
 * 과제1) 자바의 모든 RuntimeException 클래스 이름 한번씩 읽어보기.
 * 과제2) 이 링크에 있는 글을 꼭 읽으세요.
 *
 */

public class illegalArgumentExceptionStudy
{
    public void updateDeliveryDate(LocalDate deliveryDate)
    {
        if(deliveryDate.isBefore(LocalDate.now()))
        {
            throw new IllegalArgumentException("deliveryDate can't be earlier than " + LocalDate.now());
        }
    }
}
