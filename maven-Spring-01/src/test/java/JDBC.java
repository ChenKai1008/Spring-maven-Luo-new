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
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JDBC {
    @Autowired
    private BasicDataSource basicDataSource;
    public int id = 7;
    public String username = "尝试";
    public String name = "尝试";
    public String password = "尝试";

    /**
     * add
     *
     * @throws SQLException
     */
    @Test
    public void Test1() throws SQLException {
        Connection conn = basicDataSource.getConnection();
        PreparedStatement pst = conn.prepareStatement("INSERT INTO user(id,username,name,password) VALUE(?,?,?,?)");
        pst.setInt(1, id);
        pst.setString(2, username);
        pst.setString(3, name);
        pst.setString(4, password);
        int i = pst.executeUpdate();
        if (i > 0) {
            System.out.println("插入成功...");
        } else {
            System.out.println("插入失败...");

        }
    }

    /**
     * update
     *
     * @throws SQLException
     */
    @Test
    public void Test2() throws SQLException {
        Connection conn = basicDataSource.getConnection();
        PreparedStatement pst = conn.prepareStatement("UPDATE user SET username = ?,name=?,password=? WHERE id=?");
        pst.setString(1, username + "1");
        pst.setString(2, name + "1");
        pst.setString(3, password + "1");
        pst.setInt(4, id);
        int i = pst.executeUpdate();
        if (i > 0) {
            System.out.println("更新成功...");
        } else {
            System.out.println("更新失败...");
        }
    }

    /**
     * del
     *
     * @throws SQLException
     */
    @Test
    public void Test3() throws SQLException {
        Connection conn = basicDataSource.getConnection();
        PreparedStatement pst = conn.prepareStatement("DELETE FROM user WHERE id=?");
        pst.setInt(1, id);
        int i = pst.executeUpdate();
        if (i > 0) {
            System.out.println("删除成功...");
        } else {
            System.out.println("删除失败...");
        }
    }

    /**
     * Query
     *
     * @throws SQLException
     */
    @Test
    public void Test4() throws SQLException {
        Connection conn = basicDataSource.getConnection();
        PreparedStatement pst = conn.prepareStatement("SELECT * FROM USER");
        ResultSet res = pst.executeQuery();
        while (res.next()) {
            System.out.println(res.getInt(1) + "" + res.getString(2) + " " + res.getString(3));
        }
    }
}
