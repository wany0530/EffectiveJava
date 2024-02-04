package chaptor01.item02.contents.builder._02_after;

import chaptor01.item02.contents.builder._01_before.TourPlan2;

import java.time.LocalDate;

/**
 * 빌더 패턴 : 동일한 프로세스를 거쳐 다양한 구성의 인스턴스를 만드는 방법
 *
 * 복잡한 객체를 만드는 프로세스를 독립적으로 분리할 수 있다. -> 즉 객체를 만드는 관정에서 복잡한 프로세스를 별도의 클래스로 분리시키는.
 */
public interface TourPlanBuilder2
{
    TourPlanBuilder2 nightsAndDay(int nights, int days);
    TourPlanBuilder2 title(String title);
    TourPlanBuilder2 startDate(LocalDate localDate);
    TourPlanBuilder2 whereToStay(String whereToStay);
    TourPlanBuilder2 addPlan(int day, String plan);
    TourPlan2 getPlan();
}
