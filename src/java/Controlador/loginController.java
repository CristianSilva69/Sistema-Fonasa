
package Controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Modelo.Usuario;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Lenovo 2019 Y730
 */
@WebServlet(name = "loginController", urlPatterns = {"/loginController"})
public class loginController extends HttpServlet {

   @EJB    
   Servicio.loginService service;
  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     
        HttpSession sesion = request.getSession(true);
        String usuario = request.getParameter("txtusuario");
        String clave = request.getParameter("txtclave");
        System.out.println("usuario: " + usuario + "clave :" + clave);
        Usuario user = service.logeado(usuario, clave);
        
          if (user != null) {
            sesion.setAttribute("usuarioActual", user.getNombreUsuario());
            System.out.println("datos :" + user.getIdTipoUsuario());
            switch (user.getIdTipoUsuario()) {

                case "1":
                    response.sendRedirect("home.html");
                    return;
                case "2":
                    response.sendRedirect("home.html");
                    return;
                case "3":
                    response.sendRedirect("cajero_1.html");
                    return;
                case "4":
                    response.sendRedirect("cajero_2.html");

            }

        } else {
            request.setAttribute("error", "Usuario no Encontrado");
            request.getRequestDispatcher("index.html").forward(request, response);
        }
        
    }

   
}
