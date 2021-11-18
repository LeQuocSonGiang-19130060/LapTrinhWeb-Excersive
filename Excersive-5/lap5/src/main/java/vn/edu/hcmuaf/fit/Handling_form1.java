package vn.edu.hcmuaf.fit;

import vn.edu.hcmuaf.fit.service.User_Form1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Handling_form1", value = "/Handling_form1")
public class Handling_form1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("form-1-name");
        String email = request.getParameter("form-1-email");
        String phone= request.getParameter("form-1-phone");
        String service = request.getParameter("form-1-service");
        String mess = request.getParameter("form-1-mess");

        User_Form1.getSingleton().addMessage(name,email, phone, service,mess);

        request.getRequestDispatcher("form.jsp").forward(request,response);
    }
}
