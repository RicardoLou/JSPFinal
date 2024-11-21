package com.RicardoLou.DAO;

import com.RicardoLou.entity.goods;
import com.RicardoLou.util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class goodsDao {
    public List<goods> findALL(){
        List<goods> result = new ArrayList<>();
        try {
            Connection connection = JDBCUtil.getConnection();
            Statement statement = connection.createStatement();
            String sql = "select * from comm";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next()) {
                goods g = new goods();
                g.setId(resultSet.getInt("id"));
                g.setComm_num(resultSet.getString("comm_num"));
                g.setComm_name(resultSet.getString("comm_name"));
                g.setSale_price(resultSet.getDouble("sale_price"));
                result.add(g);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
    public List<goods> findById(int id) {
        List<goods> result = new ArrayList<>();
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "select * from comm where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                goods g = new goods();
                g.setId(resultSet.getInt("id"));
                g.setComm_num(resultSet.getString("comm_num"));
                g.setComm_name(resultSet.getString("comm_name"));
                g.setSale_price(resultSet.getDouble("sale_price"));
                result.add(g);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public boolean addGoods(goods g){
        boolean flag;
        try {
            Connection connection = JDBCUtil.getConnection();
            // 需要设置自增
            String sql = "insert into comm(comm_num, comm_name, sale_price) values (?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, g.getComm_num());
            statement.setString(2, g.getComm_name());
            statement.setDouble(3, g.getSale_price());
            flag = statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
    public boolean deleteById(int id) {
        boolean flag;
        try {
            Connection connection = JDBCUtil.getConnection();
            // 需要设置自增
            String sql = "delete from comm where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            flag = statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
    public boolean modifyById(goods g) {
        boolean flag;
        try {
            Connection connection = JDBCUtil.getConnection();
            String sql = "update comm set comm_num = ?, comm_name = ?, sale_price=? where id = ?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, g.getComm_num());
            statement.setString(2, g.getComm_name());
            statement.setDouble(3, g.getSale_price());
            statement.setInt(4, g.getId());
            flag = statement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return flag;
    }
}
