package chaptor01.item02.mainpoint.builder.blogVersion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * 빌더 패턴이란?
 * 생성과 관련된 디자인 패턴으로, 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법
 *
 * 정의
 * 1. GoF 디자인 패턴 중 생성 패턴에 해당한다.
 * 2. 빌더 패턴은 복잡한 객체를 생성하는 클래스와, 표현하는 클래스를 분리하여, 동일한 절차에서도 서로다른 표현을 생성하는 방법을 제공한다.
 * 3. 생성해야하는 객체가 Optional한 속성을 많이 가질 때 더 좋다.
 *
 * 해결하고자 하는 문제.
 * 핵심은 객체를 생성할 때 생성자(Constructor)만 사용할 때 발생할 수 있는 문제를 개선하기 위해 고안됐다.
 * 이전에 알아본 생성 패턴과 비교하자면, 팩토리 메소드 패턴이나 추상 팩토리 패턴에서는 생성해야하는 클래스에 대한 속성 값이 많을 때 아래와 같은 이슈들이 있다.
 * 1. 클라이언트 프로그램에서 팩토리 클래스를 호출할 때 Optional한 인자가 많아지면, 타입과 순서에 대한 관리가 어려워져 에러 발생 확률이 높아진다.
 * 2. 경우에 따라 필요 없는 파라미터들에 대해서 팩토리 클래스에 일일이 NULL 값을 넘겨줘야한다.
 * 3. 생성해야 하는 sub class가 무거워지고 복잡해짐에 따라 팩토리 클래스 또한 복잡해진다.
 *
 * 빌더 패턴은 이러한 문제들을 해결하기 위해 별도의 Builder 클래스를 만들어
 * 필수 값에 대해서는 생성자를 통해, 선택적인 값들에 대해서는 메소드를 통해
 * step-by-step으로 값을 입력받은 후에 build() 메소드를 통해 최종적으로 하나의 인스턴스를 return하는 방식이다.
 *
 */

public class DefaultTourBuilder implements TourPlanBuilder
{
    private String title;
    private LocalDate startDate;
    private int nights;
    private int days;
    private String whereToStay;
    private List<DetailPlan> plans;

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days)
    {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder title(String title)
    {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay)
    {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan)
    {
        if(this.plans == null)
            this.plans = new ArrayList<>();

        this.plans.add(new DetailPlan(day, plan));
        return this;
    }

    @Override
    public TourPlan getPlan()
    {
        return new TourPlan(title, startDate, days, nights, whereToStay, plans);
    }
}