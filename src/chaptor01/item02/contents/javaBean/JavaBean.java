package chaptor01.item02.contents.javaBean;

import java.io.*;
import java.util.Base64;

/**
 * 자바빈이란? 재사용 가능한 소프트웨어 컴포넌트
 * 1. 아규먼트 없는 기본 생성자 [아규먼트란 : function(x,y){return x+y} 메소드가 있을때 function(x,y)의 x, y는 매개변수라고 하고 f(3,4)라고 했을떄 3,4가 아규먼트이다.]
 * 2. getter와 setter 메소드 이름 규약
 * 3. Serializable 인터페이스 구현
 *
 * 하지만 실제로 오늘날 자바빈 스팩 중에서도 getter와 setter가 주로 쓰는 이유는?
 *  1. JPA나 스프링과 같은 여러 프레임워크에서 리플렉션을 통해 특정 객체의 값을 조회하거나 설정하기 때문이다.
 */

public class JavaBean implements Serializable
{
    private String name;
    private String email;
    private int age;

    public JavaBean() {}

    public JavaBean(String name, String email, int age)
    {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
//TODO : 직렬화

//        JavaBean member = new JavaBean("김배민", "deliverykim@hanmail.net", 26);
//        byte[] serializedMember;
//        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
//            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
//                oos.writeObject(member);
//                // serializedMember -> 직렬화된 member 객체
//                serializedMember = baos.toByteArray();
//            }
//        }
//        // 바이트 배열로 생성된 직렬화 데이터를 base64로 변환
//        System.out.println(Base64.getEncoder().encodeToString(serializedMember));

// TODO : 역 직렬화

//        String base64Member = "rO0ABXNyACtjaGFwdG9yMDEuaXRlbTAyLmNvbnRlbnRzLmphdmFCZWFuLkphdmFCZWFubCvgmXdR5ucCAANJAANhZ2VMAAVlbWFpbHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wABG5hbWVxAH4AAXhwAAAAGnQAF2RlbGl2ZXJ5a2ltQGhhbm1haWwubmV0dAAJ6rmA67Cw66+8";
//        byte[] serializedMember = Base64.getDecoder().decode(base64Member);
//        try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
//            try (ObjectInputStream ois = new ObjectInputStream(bais)) {
//                // 역직렬화된 Member 객체를 읽어온다.
//                Object objectMember = ois.readObject();
//                JavaBean member = (JavaBean) objectMember;
//                System.out.println(member);
//            }
//        }

// member객체를 csv로 변환
//        String csv = String.format("%s,%s,%d",member.getName(), member.getEmail(), member.getAge());
//        System.out.println(csv);

//        JavaBean member2 = new JavaBean("김배민2", "deliverykim@naver.com", 27);
// member객체를 json으로 변환
//        String json = String.format(
//                "",
//                member2.getName(), member2.getEmail(), member2.getAge());
//        System.out.println(json);
    }
}
