package br.padroes.objectPool;

import java.sql.Connection;

public class Main {
    public static void main(String args[]) {
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/fapi_web",
                "sa", "secret");

        Connection con = pool.checkOut();

        pool.checkIn(con);

    }
}
