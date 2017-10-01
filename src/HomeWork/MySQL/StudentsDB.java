package HomeWork.MySQL;

import com.google.common.collect.ImmutableList;

import java.sql.*;
import java.util.List;

public class StudentsDB {

    // JDBC URL, username and password of MySQL server
    private static final String url = "jdbc:mysql://localhost:3306/test";
    private static final String user = "root";
    private static final String password = "WERger86";

    private static List<String> studentList = ImmutableList.of("Kravchuk", "Malishev", "Rozhkov", "Ivanov", "Sting", "Tom");


    public static void main(String[] args) {



        try (Connection connection = DriverManager.getConnection(url, user, password);){
            Statement statement = connection.createStatement();
            statement.execute("create table students (id int primary key auto_increment, firstname varchar(50), lastname varchar(50));");
            PreparedStatement preparedStatement = connection.prepareStatement("insert into students (firstname) values (?);");

            for (String student : studentList){
                preparedStatement.setString(1,student);
                preparedStatement.executeUpdate();
            }

            statement.execute("create table progress (students_id int, foreign key (students_id) references students (id), physics int, math int, programming int);");
            statement.execute("insert into progress (students_id, physics, math, programming) values (1,5,5,5);");
            statement.execute("insert into progress (students_id, physics, math, programming) values (2,4,5,4);");
            statement.execute("insert into progress (students_id, physics, math, programming) values (3,4,4,4);");
            statement.execute("insert into progress (students_id, physics, math, programming) values (4,2,2,2);");
            statement.execute("insert into progress (students_id, physics, math, programming) values (5,3,3,3);");
            statement.execute("insert into progress (students_id, physics, math, programming) values (6,2,4,5);");

            ResultSet resultSet = statement.executeQuery("select * from students where id in  (select students_id from progress where math = 3);");
            while (resultSet.next()){
                String firstName = resultSet.getString("firstname");
                System.out.println(firstName + " has 3 in math");
            }

            statement.execute("update progress set programming = 3 where students_id = 1");

            ResultSet resultSet2 = statement.executeQuery("select * from students where id in  (select students_id from progress where physics > programming);");
            while (resultSet2.next()){
                String firstName = resultSet2.getString("firstname");
                System.out.println(firstName + " has physics > programming");
            }

        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }

}
