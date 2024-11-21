package com.RicardoLou.servlet;

import com.RicardoLou.DAO.goodsDao;
import com.RicardoLou.entity.goods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * 11 12 13
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
    goodsDao goodsDao = new goodsDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String num = req.getParameter("num");
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));

        goods g = new goods(num, name, price);
        boolean flag = goodsDao.addGoods(g);
        // 这里false为成功
        System.out.println("是否添加成功：" + (!flag ? "成功" : "失败"));
        FindALLServlet findALLServlet = new FindALLServlet();
        findALLServlet.doPost(req, resp);
    }
}
