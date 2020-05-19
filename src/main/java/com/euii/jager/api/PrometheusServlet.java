package com.euii.jager.api;

import io.prometheus.client.exporter.MetricsServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class PrometheusServlet extends MetricsServlet {

    public HttpServletResponse servletGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
        return response;
    }
}
