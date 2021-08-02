package facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 데이터베이스 이름을 지정하고 그것에 대응하는 Properties를 작성하는 클래스
 */
public class Database {
    private Database() {        // new 에서 인스턴스를 생성시키지 않기 위한 private 선언

    }
    public static Properties getProperties(String dbname) {     // dbname에서 properties를 얻는다
        String fileName = dbname+".txt";
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream(fileName));
        } catch (IOException e) {
            System.out.println("Warning : "+fileName+" is not found");
        }
        return prop;
    }




}
