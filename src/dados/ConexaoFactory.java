package dados;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    public Connection getConnection(){
       try {

           DriverManager.registerDriver(new com.mysql.jdbc.Driver());

           Connection conexao = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/sistemaescolar",
                   "root","");
           return conexao;
       }catch (SQLException e){
           throw new RuntimeException(e);
       }
    }

}
