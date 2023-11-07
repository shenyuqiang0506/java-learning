package com.interface_;

/**
 * @Author 申宇强
 * @Date 2023/11/7 16:01
 */
public class Interface03 {
    public static void main(String[] args) {
        MysqlDB mysqlDB = new MysqlDB();
        t(mysqlDB);
        OracleDB oracleDB = new OracleDB();
        t(oracleDB);
    }

    public static void t(DBInterface dbInterface) {
        dbInterface.connect();
        dbInterface.close();
    }
}
