package ClassWork.JDBC;

import org.h2.jdbcx.JdbcDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by java6 on 28.09.17.
 */
public class JDBCMain {
    public static void main(String[] args) {
        JdbcDataSource dataSource = new JdbcDataSource();
        dataSource.setURL("jdbc:h2:~/test");
        dataSource.setUser("");
        dataSource.setPassword("");

        try (Connection connection = dataSource.getConnection()){
            Statement statement = connection.createStatement();


//            statement.execute("CREATE TABLE Students (id int identity, FirstName varchar(255), LastName varchar(255))");

            statement.execute("INSERT INTO Students (id,FirstName,LastName) VALUES(1,Kravchuk,Andrey)");







        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
