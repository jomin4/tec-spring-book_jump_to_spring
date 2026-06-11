package com.back;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CookieGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        response.setContentType("text/plain; charset=UTF-8");

        Cookie[] cookies = request.getCookies();

        if (cookies == null) {
            response.getWriter().write("쿠키 없음");
            return;
        }

        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("username")) {
                response.getWriter().write("쿠키 값: " + cookie.getValue());
                return;
            }
        }

        response.getWriter().write("username 쿠키 없음");
    }
}