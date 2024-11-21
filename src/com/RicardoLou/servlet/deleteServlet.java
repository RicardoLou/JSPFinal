package com.RicardoLou.servlet;


import com.RicardoLou.DAO.goodsDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/del")
public class deleteServlet extends HttpServlet {
    goodsDao goodsDao = new goodsDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        boolean flag = goodsDao.deleteById(id);
        System.out.println("是否删除成功：" + (!flag ? "成功" : "失败"));
        FindALLServlet findALLServlet = new FindALLServlet();
        findALLServlet.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
