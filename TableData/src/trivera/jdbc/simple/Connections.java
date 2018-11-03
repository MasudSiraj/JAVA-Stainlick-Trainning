package trivera.jdbc.simple;


import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Properties;

public abstract class Connections {

    private static Properties properties;

    public static Connection getConnection() throws SQLException {
        String url = properties.getProperty("url");
        String username = properties.getProperty("username");
        String password= properties.getProperty("password");
        return DriverManager.getConnection(url, username, password);

    }

    public static Collection<Employee> runSql(String sql) throws SQLException{
        PreparedStatement statement = getConnection().prepareStatement(sql);
        ResultSet rs = statement.executeQuery();

        Collection<Employee> results = new ArrayList<>();

        while(rs.next()){
            results.add(    new Employee(   rs.getInt("EMPID"),
                                            rs.getString("FIRSTNAME"),
                                            rs.getString("LASTNAME"),
                                            rs.getDouble("SALARY"))
                            );
        }

        return results;

    }


    public static void save(Employee employee) throws SQLException{
        String insertSQL = "INSERT INTO employee (EMPID, FIRSTNAME, LASTNAME, SALARY) VALUES(?,?,?,?)";
        PreparedStatement statement = getConnection().prepareStatement(insertSQL);
        statement.setInt(       1, employee.getId() );
        statement.setString(    2, employee.getfName());
        statement.setString(    3, employee.getlName());
        statement.setDouble(    4, employee.getSalary());

        int rowsModified = statement.executeUpdate();

        System.out.println(rowsModified + " were added");
    }

    public static void setConfiguration(Properties properties) {
        Connections.properties = properties;
    }


}
