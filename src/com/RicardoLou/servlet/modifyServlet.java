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

/**
 * 18 19 20
 */

@WebServlet("/modify")
public class modifyServlet extends HttpServlet {
    goodsDao goodsDao = new goodsDao();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        goods g = new goods();
        List<goods> goodsList = goodsDao.findById(id);
        g.setId(id);
        g.setComm_num(goodsList.get(0).getComm_num());
        g.setComm_name(goodsList.get(0).getComm_name());
        g.setSale_price(goodsList.get(0).getSale_price());
        req.setAttribute("goods", g);
        req.getRequestDispatcher("/modify.jsp").forward(req, resp);
        FindALLServlet findALLServlet = new FindALLServlet();
        findALLServlet.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        // 这里处理从modify.jsp过来的
        int id = Integer.parseInt(req.getParameter("id"));
        String num = req.getParameter("num");
        String name = req.getParameter("name");
        double price = Double.parseDouble(req.getParameter("price"));
        boolean flag = goodsDao.modifyById(new goods(id, num, name, price));
        System.out.println("是否修改成功：" + (!flag ? "成功" : "失败"));
        FindALLServlet findALLServlet = new FindALLServlet();
        findALLServlet.doPost(req, resp);
    }
}
