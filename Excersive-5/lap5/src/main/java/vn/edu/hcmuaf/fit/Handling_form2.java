package vn.edu.hcmuaf.fit;

import vn.edu.hcmuaf.fit.service.Checking;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "Handling_form2", value = "/Handling_form_2")
public class Handling_form2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String form_1_username  = request.getParameter("form-2-username");
        String form_1_password  = request.getParameter("form-2-password");
        if(Checking.getInstance().checkInfo(form_1_username,form_1_password)){
            response.sendRedirect("/lap5/index.jsp");
        }else{
            request.setAttribute("error", "Your username or password is incorrect!");
            request.getRequestDispatcher("form.jsp").forward(request,response);
        }

    }
}
