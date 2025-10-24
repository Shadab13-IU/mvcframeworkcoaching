/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author shadab
 */
public class Check implements Model{

    @Override
    public void businessLogic(HttpServletRequest request, HttpServletResponse Response) {
        String fname=request.getParameter("fn");
        String lname=request.getParameter("ln");
        System.out.println(fname+" "+lname);
    }
    
}
