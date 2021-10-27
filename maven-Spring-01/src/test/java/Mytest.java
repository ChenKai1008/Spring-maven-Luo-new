import com.chenkai.pojo.Person;
import com.chenkai.pojo.Student;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author chenkai
 **/
public class Mytest {
    @Test
    public void testName() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }

    @Test
    public void testPool() throws SQLException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BasicDataSource basicDataSource = applicationContext.getBean( BasicDataSource.class);
        Connection connection = basicDataSource.getConnection();
        PreparedStatement pst = connection.prepareStatement("SELECT * FROM USER");
        ResultSet resultSet = pst.executeQuery();
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + resultSet.getString(2));
        }
    }
}
