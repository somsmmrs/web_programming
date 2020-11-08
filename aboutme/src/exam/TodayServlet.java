package exam;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TodayServlet")
public class TodayServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html;charset=UTF-8");
      
      PrintWriter out = response.getWriter();
      out.println("<a href=\"./index.html\">메인으로</a>");
      out.println("<br>");
      out.println("<h1 style=\"text-align:center;\">");
      response.getWriter().append("현재시각: ");
      
      LocalDateTime currentDateTime = LocalDateTime.now();
       DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
       String dtString = currentDateTime.format(dateTimeFormatter);
       
      response.getWriter().append(dtString);
      out.println("</h1>");
   
   }

}