import com.chenkai.pojo.Person;
import com.chenkai.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenkai
 **/
public class Mytest {
    @Test
    public void testName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Student student = applicationContext.getBean("student", Student.class);
        System.out.println(student);
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
