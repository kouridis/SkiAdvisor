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
            levels.add("Soft flex");
            levels.add("Foam or soft wood cores");
            levels.add("Capped constructions");
        }
        else if (level.equals("intermediate")) {
            levels.add("Medium or stiff flex");
            levels.add("Strong wood cores");
            levels.add("Sandwich sidewall construction");
        }
        else if (level.equals("experienced")) {
            levels.add("Stiff or very stiff flex");
            levels.add("Very strong wood cores");
            levels.add("Sandwich sidewall construction");
        }
        return(levels);
    }
}