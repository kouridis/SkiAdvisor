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

public class Logout extends HttpServlet {
    protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
        
	}
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.invalidate();
        RequestDispatcher view = request.getRequestDispatcher("index.html");
        view.forward(request, response);
    }
    
}
