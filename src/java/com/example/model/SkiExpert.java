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
            levels.add("soft flex");
            levels.add("foam or soft wood cores");
            levels.add("capped constructions");
        }
        else if (level.equals("intermediate")) {
            levels.add("medium or stiff flex");
            levels.add("strong wood cores");
            levels.add("sandwich sidewall construction");
        }
        else if (level.equals("experienced")) {
            levels.add("stiff or very stiff flex");
            levels.add("very strong wood cores");
            levels.add("sandwich sidewall construction");
        }
        return(levels);
    }
}