package chaptor01.item02.mainpoint.builder.eduVersion;


/**
 * 생성자에 매개변수가 많다면 빌더를 고려하라.
 *
 * 권한하는 방법 : 빌더 패턴
 *  1. 플루언트 API 또는 메서드 체이닝을 한다.
 *  2. 계층적으로 설계된 클래스와 함께 사용하기 좋다.
 *  3. 점층적 생성자 보다 클라이언트 코드를 일고 쓰기가 훨씬 간결하고, 자바빈즈 보다 훨씬 안전하다. (점층적 생성자는 매개변수들의 순서가 헷갈릴수있다. / setter에 대한 위험성)
 */
public class NutritionFactsForBuilder
{
    private final int servingSize;
    private final int serving;
    private final int calories;
    private final int fat;
    private final
    int sodium;
    private final int carbohyudrate;

    static class Builder
    {
        private final int servingSize;
        private final int servings;

        private int calories;
        private int fat;
        private int sodium;
        private int carbohydrate;

        public Builder(int servingSize, int servings)
        {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories)
        {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat)
        {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium)
        {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate)
        {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFactsForBuilder build()
        {
            return new NutritionFactsForBuilder(this);
        }
    }

    public NutritionFactsForBuilder(Builder builder)
    {
        this.servingSize = builder.servingSize;
        this.serving = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohyudrate = builder.carbohydrate;
    }

    public static void main(String[] args)
    {
         NutritionFactsForBuilder nut = new Builder(240, 8).calories(0).fat(1).sodium(2).carbohydrate(3).build();
    }
}
