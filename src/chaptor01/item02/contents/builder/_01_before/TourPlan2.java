package chaptor01.item02.contents.builder._01_before;

import java.time.LocalDate;
import java.util.List;

public class TourPlan2
{
    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan2> plans;

    public TourPlan2() {}

    public TourPlan2(String title, int nights, int days, LocalDate startDate, String whereToStay, List<DetailPlan2> plans)
    {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }

    @Override
    public String toString() {
        return "TourPlan2{" +
                "title='" + title + '\'' +
                ", nights=" + nights +
                ", days=" + days +
                ", startDate=" + startDate +
                ", whereToStay='" + whereToStay + '\'' +
                ", plans=" + plans +
                '}';
    }
}
