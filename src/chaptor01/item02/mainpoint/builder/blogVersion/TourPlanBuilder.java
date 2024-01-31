package chaptor01.item02.mainpoint.builder.blogVersion;

import java.time.LocalDate;

public interface TourPlanBuilder
{
    public abstract TourPlanBuilder nightsAndDays(int nights, int days);

    public abstract  TourPlanBuilder title(String title);
    public abstract  TourPlanBuilder startDate(LocalDate startDate);
    public abstract  TourPlanBuilder whereToStay(String whereToStay);
    public abstract  TourPlanBuilder addPlan(int day, String plan);
    public abstract  TourPlan getPlan();
}
