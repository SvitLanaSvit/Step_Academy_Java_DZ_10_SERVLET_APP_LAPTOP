package com.example.dz_10_servlet_app_laptop;

import com.example.dz_10_servlet_app_laptop.entity.LaptopManufacturer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "LenovoServlet", value = "/history")
public class LenovoHistoryServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LaptopManufacturer lenovo = new LaptopManufacturer();
        lenovo.setName("Lenovo");
        lenovo.setDevelopmentHistory("Lenovo is a Chinese multinational technology company that was founded in 1984. " +
                "It has a rich history of producing high-quality laptops and other electronic devices.");
        lenovo.setImageUrls(List.of("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR53n1_rcQ8NHxdgJIiZcsD4vU7_c4REVHtqw&usqp=CAU",
                "https://www.pbs-business.de/uploads/pbs-business/news/Lenovo_620.jpg"));
        lenovo.setExternalResourceLink("https://de.wikipedia.org/wiki/Lenovo");

        request.setAttribute("lenovo", lenovo);
        request.getRequestDispatcher("/history.jsp").forward(request, response);
    }
}
