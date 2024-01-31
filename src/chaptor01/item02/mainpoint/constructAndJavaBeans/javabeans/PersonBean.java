package chaptor01.item02.mainpoint.constructAndJavaBeans.javabeans;

import java.io.Serializable;


/**
 *
 * 자바빈즈 패턴
 * • 완전한 객체를 만들려면 메서드를 여러번 호출해야 한다. (일관성이 무너진 상태가 될 수도 있다.)
 * • 클래스를 불변으로 만들 수 없다 (왜냐하면 setter를 사용해서 값을 주고있기 때문에)
 *
 * 자바빈은 기본(default)패키지 이외의 특정 패키지에 속해 있어야 한다.
 * 클래스는 인자(Argument)가 없는 기본 생성자(Default constructor)를 갖는다.
 * 클래스의 멤버 변수는 프로퍼티(Properties)라고 하며 private 접근 제한자를 가져야 한다.
 * 클래스의 프로퍼티들은 Getter/Setter를 통해 접근할 수 있어야 한다.
 * Getter/setter의 접근 제한자는 public이어야 한다.
 * Getter의 이름은 get{프로퍼티 이름} 이며, Setter의 이름은 set{프로퍼티 이름}이다
 * Read Only인 경우 Setter는 없을 수 있다.
 * Getter의 경우 파라미터가 존재하지 않아야 하며, setter의 경우 하나 이상의 파라미터가 존재한다.
 * 프로퍼티의 타입이 Boolean인 경우 is로 시작할 수 있다.
 *
 * 자바빈즈의 대안으로 빌더가 있다. 이부분은 뒤에 내용에서.
 */


public class PersonBean implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name;
    private boolean coding;

    // 기본 생성자
    public PersonBean() {}

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public boolean isCoding()
    {
        return this.coding;
    }

    public void setCoding(boolean coding)
    {
        this.coding = coding;
    }



    public static void main(String[] args)
    {
        PersonBean person = new PersonBean();
        person.setName("Bob");
        person.setCoding(true);

        System.out.print(person.getName());
        System.out.println(person.isCoding() ? " [coding]" : ""); //Bob [coding]
    }
}
