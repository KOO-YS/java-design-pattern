package builder;

/**
 * Builder 클래스로 선언되어 있는 메소드를 사용해 문서를 만든다
 * -> Director는 실제로 동작하는 것이 TextBuilder인지 HTMLBuilder인지 모른다
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {  
        // Builder가 매개변수로 들어오지만 Builder 인스턴스가 아닌 하위 클래스의 인스턴스가 전달될 예정
        // -> 하위 클래스의 종류에 따라 구체적인 문서의 형식이 정해진다
        this.builder = builder;
    }

    public void construct() {       // 문서 구축

        builder.makeTitle("Greeting");                      // 타이틀
        builder.makeString("morning and afternoon");        // 문자열
        builder.makeItems(new String[]{                     // 개별 항목
                "good morning",
                "hello"
        });
        builder.makeString("evening");                      // 별도의 문자열
        builder.makeItems(new String[]{                     // 별도의 개별 항목
                "hello",
                "good night",
                "good bye"
        });
        builder.close();                                    //  문서를 완성시킨다
    }
}
