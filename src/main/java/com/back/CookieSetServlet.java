package com.back;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class CookieSetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response) throws IOException {

        Cookie cookie = new Cookie("username", "minseok");
        cookie.setPath("/");
        cookie.setMaxAge(60 * 10);

        response.addCookie(cookie);
        response.setContentType("text/plain; charset=UTF-8");

        response.getWriter().write("쿠키 저장 완료");
    }
}