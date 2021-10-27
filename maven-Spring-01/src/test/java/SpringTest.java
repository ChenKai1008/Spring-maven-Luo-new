import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author chenkai
 **/
//测试类
@RunWith(SpringJUnit4ClassRunner.class)
//获取beans.xml文本对象
@ContextConfiguration("/applicationContext.xml")
public class SpringTest {
    @Autowired
    private BasicDataSource basicDataSource;


    @Test
    public void test1() throws SQLException {
        Connection connection = basicDataSource.getConnection();
        try {
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM user ");
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
