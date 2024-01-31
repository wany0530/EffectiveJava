package chaptor01.item02.mainpoint.builder.blogVersion;

import java.time.LocalDate;
import java.util.List;

public class TourPlan
{
    private String title; // 여행 제목
    private LocalDate startDate; // 출발 일
    private int nights; // 몇 박
    private int days; // 며칠
    private String whereToStay; // 어디서 머물지
    private List<DetailPlan> plans; // n일차 할 일

    /**
     * 기본 생성자 (필수)
     */
    public TourPlan() {}

    /**
     * 일반적인 여행 계획 생성자
     *
     * @param title 여행 제목
     * @param startDate 출발 일
     * @param nights n박
     * @param days m일
     * @param whereToStay 머물 장소
     * @param plans n일차 할 일
     */
    public TourPlan(String title, LocalDate startDate, int nights, int days, String whereToStay, List<DetailPlan> plans)
    {
        this.title = title;
        this.nights = nights;
        this.days = days;
        this.startDate = startDate;
        this.whereToStay = whereToStay;
        this.plans = plans;
    }

    /**
     * 당일치기 여행 계획 생성자
     *
     * @param title 여행 제목
     * @param startDate 출발 일
     * @param plans 1일차 할 일
     */
    public TourPlan(String title, LocalDate startDate, List<DetailPlan> plans)
    {
        this.title = title;
        this.startDate = startDate;
        this.plans = plans;
    }

    
}

class DetailPlan
{
    private int day;
    private String plan;

    public DetailPlan(int day, String plan) {
        this.day = day;
        this.plan = plan;
    }
}
