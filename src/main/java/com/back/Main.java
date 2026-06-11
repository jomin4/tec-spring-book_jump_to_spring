package com.back;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Main {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);

        ServletContextHandler context = new ServletContextHandler();
        context.setContextPath("/");

        context.addServlet(CookieSetServlet.class, "/set-cookie");
        context.addServlet(CookieGetServlet.class, "/get-cookie");

        server.setHandler(context);

        server.start();
        System.out.println("서버 실행: http://localhost:8080");
        server.join();
    }
}