package chaptor01.item02.contents.builder._02_after;

import chaptor01.item02.contents.builder._01_before.DetailPlan2;
import chaptor01.item02.contents.builder._01_before.TourPlan2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DefaultTourBuilder2 implements TourPlanBuilder2
{
    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan2> plans;

    @Override
    public TourPlanBuilder2 nightsAndDay(int nights, int days)
    {
        this.nights = nights;
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder2 title(String title)
    {
        this.title = title;
        return this;
    }

    @Override
    public TourPlanBuilder2 startDate(LocalDate startDate)
    {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder2 whereToStay(String whereToStay)
    {
        this.whereToStay = whereToStay;
        return this;
    }

    @Override
    public TourPlanBuilder2 addPlan(int day, String plan)
    {
        if(this.plans == null)
            this.plans = new ArrayList<>();

        this.plans.add(new DetailPlan2(day, plan));

        return this;
    }

    @Override
    public TourPlan2 getPlan()
    {
        return new TourPlan2(title, nights, days, startDate, whereToStay, plans);
    }
}
