/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.web;

/**
 *
 * @author kouridis
 */

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class Login extends HttpServlet {
    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
    }
 
    protected void doPost(HttpServletRequest request,
                    HttpServletResponse response) throws ServletException, IOException {

            String username = request.getParameter("username");
            String password = request.getParameter("password");
    }
    
}
