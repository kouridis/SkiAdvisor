/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kouridis
 */
	
package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class SkiSelect extends HttpServlet {
    public void doPost( HttpServletRequest request, 
                      HttpServletResponse response) 
                      throws IOException, ServletException {

    String c = request.getParameter("level");

    // Now use our Ski Model above 
    SkiExpert ce = new SkiExpert();

    List result = ce.getLevels(c);

    // The results will be passed back (as an attribute) to the JSP view
    // The attribute will be a name/value pair, the value in this case will be a List object 
    request.setAttribute("styles", result);
    RequestDispatcher view = request.getRequestDispatcher("result.jsp");
    view.forward(request, response);
  }
}
