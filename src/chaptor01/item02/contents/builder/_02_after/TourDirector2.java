package chaptor01.item02.contents.builder._02_after;

import chaptor01.item02.contents.builder._01_before.TourPlan2;

import java.time.LocalDate;

public class TourDirector2
{
    private TourPlanBuilder2 tourPlanBuilder;

    public TourDirector2(TourPlanBuilder2 tourPlanBuilder)
    {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan2 cancunTrip()
    {
        return tourPlanBuilder.title("칸쿤여행")
                .nightsAndDay(2, 3)
                .startDate(LocalDate.of(2020, 12,9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐 풀기")
                .addPlan(0, "저녁식사")
                .getPlan();
    }

    public TourPlan2 longBeachTrip()
    {
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }
}
