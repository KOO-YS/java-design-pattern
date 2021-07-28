package abstract_factory.factory;

/**
 * 추상적인 공장
 */
public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            // classname : 구체적인 공장의 클래스 이름을 문자열로 지정
            // forName 메소드 : 클래스를 동적으로 읽음
            factory = (Factory) Class.forName(classname).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Class "+classname+" is not found");
            e.printStackTrace();
        }
        return factory;
    }

    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String caption, String author);

}
