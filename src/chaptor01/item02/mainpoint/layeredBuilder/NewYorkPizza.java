package chaptor01.item02.mainpoint.layeredBuilder;

import java.util.Objects;

public class NewYorkPizza extends Pizza
{
    public enum Size {SMALL, MEDIUM,  LARGE}
    private final Size size;

    static class Builder extends Pizza.Builder<NewYorkPizza.Builder>
    {
        private final Size size;

        public Builder(Size size)
        {
            this.size = Objects.requireNonNull(size);
        }

        @Override
        public NewYorkPizza build()
        {
            return new NewYorkPizza(this);
        }

        @Override
        protected Builder self()
        {
            return this;
        }
    }

    public NewYorkPizza(Builder builder)
    {
        super(builder);
        this.size = builder.size;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        return sb.append(toppings).append("로 토핑한").append(size).append("사이즈인 뉴욕 피자입니다.").toString();
    }
}
