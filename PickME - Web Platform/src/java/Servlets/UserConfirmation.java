package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserConfirmation extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String fname = "Deeptha";
        String confirmId = "jbkjBJKSBKjsnkajdNKJSAB%3D";
        
  
        out.print("<html>" +
"    <head>" +
"        <title>Pickme.lk</title>" +
"        <style type='text/css'>" +
"            body{" +
"                font-family:Segoe UI;" +
"                color:#333333;" +
"            }" +
"            .container-div{" +
"                padding:5px;" +
"                border-radius:5px;" +
"                border:1px solid darkgray;" +
"                background-color:#eeeeee;" +
"            }" +
"            .header-div{" +
"                background-color:#ffffff;" +
"                border-radius:4px;" +
"                padding:5px;" +
"                box-shadow:inset 0px 0px 2px 0px;" +
"                -moz-box-shadow:inset 0px 0px 2px 0px;" +
"                -webkit-box-shadow:inset 0px 0px 2px 0px;" +
"                -o-box-shadow:inset 0px 0px 2px 0px;" +
"            }" +
"            h2 small{" +
"                color:darkgray;" +
"            }" +
"            a.btn{" +
"                padding:5px;background-color:#41BC5E;border-radius:4px;border:1px solid #41BC5E;font-size:14px;color:white;" +
"            }" +
"            a.btn:hover{" +
"                background-color:#2BD36D;color:white;border:1px solid darkgray;" +
"            }" +
"            h5{" +
"                background-color:rgb(180,40,40);" +
"                text-align:center;" +
"                border-radius:4px;" +
"                color:white;" +
"            }" +
"        </style>" +
"    </head>" +
"    <body>" +
"        <div class='container-div'>" +
"            <div class='header-div'>" +
"                <h2>Pickme.lk <small>anytime.anywhere</small></h2>" +
"            </div>" +
"            <h4>Hello   fname  ,</h4>" +
"            <p>Your User Account has been created successfully.</p>" +
"            <p>To Continue Registration Please confirm your Email by Clicking on Confirmation Link.</p>" +
"            <a target='_blank' class='btn' href='http://localhost:8080/Pickme.lk/UserConfirmation.jsp?  confirmId  '>Confirm Email</a>" +
"            <p>If in your Browser dosen't work this URL, Please copy this ID : <b><i>  confirmId  </i></b> </p><p>And Confirm in <a href='http://localhost:8080/Pickme.lk/UserConfirmation.jsp'>Confirmation Page</a></p>" +
"            <p><small>Note : This Link will expire in 2 Days. If this link is Expired Please <a target='_blank' href='http://localhost:8080/Pickme.lk/UserConfirmation.jsp'>Resend</a> Confirmation Link.</small></p>" +
"            <p>" +
"            </p>" +
"            <p>Stay with Us - <i>Thank you !</i></p>" +
"            <h4>Pickme.lk - <small>anytime.anywhere.</small></h4>" +
"            <h5>-Do not reply-</h5>" +
"        </div>" +
"    </body>" +
"</html>");
    }
}
