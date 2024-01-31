package chaptor01.item02.mainpoint.constructAndJavaBeans.constructorchaning;

/**
 *
 * 아이템 2. 생성자에 매개변수가 많다면 빌더를 고려하라.
 *  정적 팩터리와 생성자에 선택적 매개변수가 많을 때 고려할 수 있는 방안
 *  대안1: 점층적 생성자 패턴 또는 생성자 체이닝
 *  매개변수가 늘어나면 클라이언트 코드를 작성하거나 읽기 어렵다
 *
 *  매개변수가 많다면 코드가 더러워지니, this()를 이용해서 생성자 체이닝을 해보자. 매개변수가 적은 쪽에서 -> 매개변수가 많은 쪽의 생성자를 this로 호출한다.
 *  이것을 점층적 생성자 패턴.
 *  문제점 : 인스턴스를 만들때 파라미터의 타입이 뭔지 어떤건지 알수가 없다. 그래서 intelij에서 ctrl+p로 알수있다ㅋ
 *
 */

public class NutritionFacts
{
    private final int servingSize; //   (mL, 1회 제공량)    필수
    private final int servings; //      (회, 총 n회 제공량)  필수
    private final int calories; //      (1회 제공량당)       선택
    private final int fat; //            (g/1회 제공량)      선택
    private final int sodium; //         (mg/1회 제공량)     선택
    private final int carbohydrate; //   (g/회 제공량)       선택

    public NutritionFacts(int servingSize, int servings)
    {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = 0;
//        this.fat = 0;
//        this.sodium = 0;
//        this.carbohydrate = 0;
        this(servingSize, servings, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories)
    {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = calories;
//        this.fat = 0;
//        this.sodium = 0;
//        this.carbohydrate = 0;
        this(servingSize, servings, calories, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat)
    {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = calories;
//        this.fat = fat;
//        this.sodium = 0;
//        this.carbohydrate = 0;
        this(servingSize, servings, calories, fat, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium)
    {
//        this.servingSize = servingSize;
//        this.servings = servings;
//        this.calories = calories;
//        this.fat = fat;
//        this.sodium = sodium;
//        this.carbohydrate = 0;
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public NutritionFacts(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate)
    {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }
}
