package org.example;
import java.sql.*;
import java.util.*;

public class MySQLClass {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","password");

            System.out.println("Database connection Success"+con);

            Statement stm = con.createStatement();

            String query = "insert into employee ;";
            ResultSet resultSet = stm.executeQuery(query);

            /*
            String query = "select * from customers";

            ResultSet resultSet = stm.executeQuery(query);

            while (resultSet.next()){
                System.out.println(resultSet.getInt("customerNumber")+" - "+ resultSet.getString("customerName"));
            }*/


            String query = "select * from orders";

            ResultSet resultSet = stm.executeQuery(query);
            ResultSetMetaData data = resultSet.getMetaData();
            int columCount = data.getColumnCount();
            System.out.println("Number of Columns: "+ columCount);
            for (int i = 1; i<=columCount;i++){
                System.out.print(data.getColumnName(i)+" ");
                System.out.println();
            }
            while (resultSet.next()){
                //System.out.println(resultSet.getInt("customerNumber")+" "+ resultSet.getDate("orderDate")+" "+resultSet.getInt("orderNumber")+" "+);
            }



            resultSet.close();
            stm.close();
            con.close();

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}