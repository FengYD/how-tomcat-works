package com.feng.tomcat.ch4.connector.http;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

/**
 * @author fengyadong
 * @date 2022/12/30 14:53
 * @Description
 */
public class HttpResponseFacade implements HttpServletResponse {
    private final HttpServletResponse response;

    public HttpResponseFacade(HttpResponse response) {
        this.response = response;
    }

    /**
     * implementation of HttpServletResponse
     */
    public void addCookie(Cookie cookie) {
        response.addCookie(cookie);
    }

    public void addDateHeader(String name, long value) {
        response.addDateHeader(name, value);
    }

    public void addHeader(String name, String value) {
        response.addHeader(name, value);
    }

    public void addIntHeader(String name, int value) {
        response.addIntHeader(name, value);
    }

    public boolean containsHeader(String name) {
        return response.containsHeader(name);
    }

    public String encodeRedirectURL(String url) {
        return response.encodeRedirectURL(url);
    }

    @Deprecated
    public String encodeRedirectUrl(String url) {
        return response.encodeRedirectUrl(url);
    }

    @Deprecated
    public String encodeUrl(String url) {
        return response.encodeUrl(url);
    }

    public String encodeURL(String url) {
        return response.encodeURL(url);
    }

    public void flushBuffer() throws IOException {
        response.flushBuffer();
    }

    public int getBufferSize() {
        return response.getBufferSize();
    }

    public String getCharacterEncoding() {
        return response.getCharacterEncoding();
    }

    @Override
    public String getContentType() {
        return null;
    }

    public Locale getLocale() {
        return response.getLocale();
    }

    public ServletOutputStream getOutputStream() throws IOException {
        return response.getOutputStream();
    }

    public PrintWriter getWriter() throws IOException {
        return response.getWriter();
    }

    @Override
    public void setCharacterEncoding(String s) {

    }

    public boolean isCommitted() {
        return response.isCommitted();
    }

    public void reset() {
        response.reset();
    }

    public void resetBuffer() {
        response.resetBuffer();
    }

    public void sendError(int sc) throws IOException {
        response.sendError(sc);
    }

    public void sendError(int sc, String message) throws IOException {
        response.sendError(sc, message);
    }

    public void sendRedirect(String location) throws IOException {
        response.sendRedirect(location);
    }

    public void setBufferSize(int size) {
        response.setBufferSize(size);
    }

    public void setContentLength(int length) {
        response.setContentLength(length);
    }

    @Override
    public void setContentLengthLong(long l) {

    }

    public void setContentType(String type) {
        response.setContentType(type);
    }

    public void setDateHeader(String name, long value) {
        response.setDateHeader(name, value);
    }

    public void setHeader(String name, String value) {
        response.setHeader(name, value);
    }

    public void setIntHeader(String name, int value) {
        response.setIntHeader(name, value);
    }

    public void setLocale(Locale locale) {
        response.setLocale(locale);
    }

    public void setStatus(int sc) {
        response.setStatus(sc);
    }

    @Deprecated
    public void setStatus(int sc, String message) {
        response.setStatus(sc, message);
    }

    @Override
    public int getStatus() {
        return 0;
    }

    @Override
    public String getHeader(String s) {
        return null;
    }

    @Override
    public Collection<String> getHeaders(String s) {
        return null;
    }

    @Override
    public Collection<String> getHeaderNames() {
        return null;
    }
}