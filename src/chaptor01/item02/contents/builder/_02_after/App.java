package chaptor01.item02.contents.builder._02_after;

import chaptor01.item02.contents.builder._01_before.TourPlan2;
import chaptor01.item02.mainpoint.builder.blogVersion.TourPlan;

public class App
{
    public static void main(String[] args) {
        TourDirector2 director = new TourDirector2(new DefaultTourBuilder2());
        TourPlan2 cancunPlan = director.cancunTrip();
        System.out.println(cancunPlan);
    }
}
