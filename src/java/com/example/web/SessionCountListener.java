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

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class SessionCountListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent event) {
		System.out.println("A new session is created");
	}
 
	public void sessionDestroyed(HttpSessionEvent event) {
		System.out.println("session is destroyed");
	}
}
