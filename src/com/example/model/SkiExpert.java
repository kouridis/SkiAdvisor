/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kouridis
 */
	
package com.example.model;

import java.util.*;

public class SkiExpert {
    public List getLevels(String level) {

     List levels = new ArrayList();

     if (level.equals("beginner")) {
       levels.add("latte");
       levels.add("cappuccino");
     }
     else if (level.equals("intermediate")) {
       levels.add("latte");
       levels.add("cappuccino");
       levels.add("frappuccino");
     }
     else if (level.equals("experienced")) {
       levels.add("frappuccino");
     }
     return(levels);
   }
}
