package chaptor01.item02.mainpoint.layeredBuilder;

public class CalzonePizza extends Pizza
{
    private final boolean sauceInside;

    static class Builder extends Pizza.Builder<CalzonePizza.Builder>
    {
        private boolean sauceInside = false;

        public Builder sauceInside()
        {
            sauceInside = true;
            return this;
        }

        @Override
        public CalzonePizza build()
        {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self()
        {
            return this;
        }
    }
    public CalzonePizza(Builder builder)
    {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return String.format("%s로 토핑한 칼초네 피자 (소스는 %s)", toppings, sauceInside ? "안" : "바깥");
    }
}
