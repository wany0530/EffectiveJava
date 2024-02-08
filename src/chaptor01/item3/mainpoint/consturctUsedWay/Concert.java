package chaptor01.item3.mainpoint.consturctUsedWay;


/**
 * 이 Concert라는 클라스 자체가 singer의 클라이언트 코드이다.
 */
public class Concert
{
    private boolean lightsOn;
    private boolean mainStateOpen;

    private Singer singer;

    public Concert(Singer singer)
    {
        this.singer = singer;
    }

    public void perform()
    {
        this.mainStateOpen = true;
        this.lightsOn = true;

        singer.sing();
    }

    public boolean isLightsOn()
    {
        return lightsOn;
    }

    public boolean isMainStateOpen()
    {
        return mainStateOpen;
    }
}

class CoverConcert
{
    private boolean lightsOn;
    private boolean mainStateOpen;

    private ISinger singer;

    public CoverConcert(ISinger singer)
    {
        this.singer = singer;
    }

    public void perform()
    {
        this.mainStateOpen = true;
        this.lightsOn = true;

        singer.sing();
    }

    public boolean isLightsOn()
    {
        return lightsOn;
    }

    public boolean isMainStateOpen()
    {
        return mainStateOpen;
    }

    public static void main(String[] args)
    {
        CoverConcert concert = new CoverConcert(new CoverSinger());
        concert.perform();

        System.out.println("콘서트 조명 is ON? :" + concert.isLightsOn());
        System.out.println("메인 스테이지 is open? :" + concert.isMainStateOpen());
    }
}
