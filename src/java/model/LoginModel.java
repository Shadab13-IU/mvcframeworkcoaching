/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author shadab
 */
public class LoginModel implements Model{

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void businessLogic(HttpServletRequest request,HttpServletResponse response){
        try {
            request.getRequestDispatcher("/WEB-INF/view/afterLogin.jsp").forward(request,response);
        } catch (ServletException ex) {
            System.getLogger(LoginModel.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        } catch (IOException ex) {
            System.getLogger(LoginModel.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    
}
