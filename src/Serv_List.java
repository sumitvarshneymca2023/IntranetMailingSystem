
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class Serv_List extends HttpServlet
{

    public Serv_List()
    {
        scon = null;
        newfol = null;
        f1 = null;
        uname = null;
        sub = null;
        from = null;
        date1 = null;
        folder = null;
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        try
        {
            scon = getServletContext();
            HttpSession httpsession = httpservletrequest.getSession(true);
            uname = httpsession.getValue("name").toString();
            ServletOutputStream servletoutputstream = httpservletresponse.getOutputStream();
            servletoutputstream.println("<html><head><title>Welcome To Intranet Mailing System</title><!--mstheme--><link rel=stylesheet href='copy1111.css'>");
            servletoutputstream.println("<meta name=Microsoft Theme content=copy-of-industrial 1111>");
            servletoutputstream.println("</head><body leftmargin=0 background='INDTEXTB.JPG' Topmargin=0><!--table cellpadding=16 align=center-->");
           
            servletoutputstream.println("<center><pre><i><b><a href=Serv_Inbox target=in2><img src='ims%20images/INBOX.JPG' border=0 width=108 height=40></a>");
            servletoutputstream.println("<a href=Serv_Compose target=in2><img src='ims%20images/COMPOSE.JPG' border=0 width=108 height=40></a></b></i><font color=#FFFFFF>1</font><i><b>");
            servletoutputstream.println("<a href=Serv_Option target=in2><img src='ims%20images/Options.jpg' border=0 width=108 height=40 lowsrc=Images%20Raj/Options.jpg></a><font color=#FFFFFF>1</font>");
            servletoutputstream.println("<pre><i><b><a href=Serv_Logout target=_parent><img src='ims%20images/Logout.jpg' border=0 width=108 height=36></a></b></i></pre><center>");
            	
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }
    }

    ServletContext scon;
    String newfol;
    String f1;
    String uname;
    String sub;
    String from;
    String date1;
    String folder;
}