
import java.sql.*;
import java.util.*;

public class InsertCRUD {
    
    public static void main(String[] args) {
        String status = "Nada aconteceu";
        try {
        Connection conn = App.conectar();
        String strSqlInsert = "INSERT INTO `teste`.`tbl_usuarios` (`usuario`, `senha`) VALUES ('teste', 'teste');";
        Statement stmSql = null;
        stmSql = conn.createStatement();
        stmSql.addBatch(strSqlInsert);
        stmSql.executeBatch();
        status = ("Ok! Tabela criada");
        stmSql.close();
        } catch (SQLException e) {
            status = "Erro SQLException: " + e;
        } catch (Exception e) {
            status = "Erro exception: " + e;
        }
        System.out.println(status);
    }
}
