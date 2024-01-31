package chaptor01.item02.mainpoint.layeredBuilder;

public class PizzaTest
{
    public static void main(String[] args)
    {
        NewYorkPizza pizza = new NewYorkPizza.Builder(NewYorkPizza.Size.SMALL)
                .addTopping(Pizza.Topping.HAM)
                .addTopping(Pizza.Topping.SAUSAGE)
                .build();

        CalzonePizza calzone = new CalzonePizza.Builder()
                .addTopping(Pizza.Topping.MUSHROOM)
                .addTopping(Pizza.Topping.ONION)
                .sauceInside()
                .build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
