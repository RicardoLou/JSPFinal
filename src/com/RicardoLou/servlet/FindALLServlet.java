package com.RicardoLou.servlet;

import com.RicardoLou.DAO.goodsDao;
import com.RicardoLou.entity.goods;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Objects;


/**
 * 7
 */
@WebServlet("/findAll")
public class FindALLServlet extends HttpServlet {
    goodsDao goodsDao = new goodsDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<goods> goodsList = goodsDao.findALL();
        req.setAttribute("goodsList", goodsList);
        req.getRequestDispatcher("/list.jsp").forward(req, resp);
    }
}
