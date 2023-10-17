package com.example.dz_10_servlet_app_laptop;

import com.example.dz_10_servlet_app_laptop.entity.LaptopInfo;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "LenovoInfoServlet", value = "/lenovo")
public class LenovoInfoServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LaptopInfo info = new LaptopInfo();
        info.setName("Lenovo");
        info.setHeadquartersCountry("China");
        info.setLogoUrl("https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Lenovo-Logo.svg/2560px-Lenovo-Logo.svg.png");
        info.setNumberOfEmployees(6000);
        info.setBriefInformation("Lenovo is a Chinese multinational technology company that was founded in 1984. " +
                "It has a rich history of producing high-quality laptops and other electronic devices.");

        request.setAttribute("lenovo", info);
        request.getRequestDispatcher("/lenovo.jsp").forward(request,response);
    }
}
