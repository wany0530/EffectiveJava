package chaptor01.item01.mainpoint.staticFactoryMethod01;

/**
 *
 *     정적 팩토리 메[소드의 장점 01 : 이름을 가질수 있다. (동일한 시그니처의 생성자를 두개 가질 수 없다.)
 *     한마디로 아래 코드는 생성자 2개 모두 매개변수가 동일한 타입일때 같이 둘수가 없기때문에.
 *     생성자에 이름을 주는 방식으로 static factory method로 고려할수있다.
 *
 *     private boolean prime;
 *     private boolean urgent;
 *     private Product product;
 *
 *     public Order(Product product, boolean prime)
 *     {
 *         this.product = product;
 *         this.prime = prime;
 *     }
 *
 *     public Order(Product product, boolean urgent)
 *     {
 *         this.product = product;
 *         this.urgent = urgent;
 *     }
 *
 */



public class StaticFactoryMethod01
{
    private boolean prime;
    private boolean urgent;
    private Product product;

    public static StaticFactoryMethod01 primeStaticMethod01(Product product)
    {
        StaticFactoryMethod01 order = new StaticFactoryMethod01();
        order.prime = true;
        order.product = product;

        return order;
    }

    public static StaticFactoryMethod01 urgentStaticMethod01(Product product)
    {
        StaticFactoryMethod01 order = new StaticFactoryMethod01();
        order.urgent = true;
        order.product = product;

        return order;
    }
}

class Product
{

}
