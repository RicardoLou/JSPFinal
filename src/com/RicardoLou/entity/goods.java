package com.RicardoLou.entity;

/**
 * 第四题：JavaBean
 * 做到这里记得把右键lib文件夹 add as library（添加为库）
 */
public class goods {
    private int id;
    private String comm_num;
    private String comm_name;
    private double sale_price;

    public goods() {
    }

    public goods(String comm_num, String comm_name, double sale_price) {
        this.comm_num = comm_num;
        this.comm_name = comm_name;
        this.sale_price = sale_price;
    }

    public goods(int id, String comm_num, String comm_name, double sale_price) {
        this.id = id;
        this.comm_num = comm_num;
        this.comm_name = comm_name;
        this.sale_price = sale_price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComm_num() {
        return comm_num;
    }

    public void setComm_num(String comm_num) {
        this.comm_num = comm_num;
    }

    public String getComm_name() {
        return comm_name;
    }

    public void setComm_name(String comm_name) {
        this.comm_name = comm_name;
    }

    public double getSale_price() {
        return sale_price;
    }

    public void setSale_price(double sale_price) {
        this.sale_price = sale_price;
    }
}
