package com.example.dz_10_servlet_app_laptop;

import com.example.dz_10_servlet_app_laptop.entity.NewsItem;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "NewsServlet", value = "/news")
public class NewsServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<NewsItem> news = new ArrayList<>();

        NewsItem news1 = new NewsItem();
        news1.setId(1);
        news1.setTitle("New Ultrabook Series Released");
        news1.setShortDescription("Lenovo, a leading laptop manufacturer, has just unveiled its latest ultrabook series, " +
                "featuring sleek designs and powerful performance. The new line includes models with high-resolution " +
                "displays and extended battery life, making them ideal for professionals and students on the go.");
        news1.setImageUrl("https://www.notebookcheck.net/uploads/tx_jppageteaser/900X3E_010_right-angle-45_mineral_ash_black_02.jpg");

        NewsItem news2 = new NewsItem();
        news2.setId(2);
        news2.setTitle("Innovative Cooling Technology");
        news2.setShortDescription("Acer has introduced a groundbreaking cooling technology in its gaming laptops. " +
                "The new cooling system efficiently dissipates heat, ensuring smoother gaming experiences with " +
                "reduced thermal throttling. Gamers can now enjoy extended hours of high-performance gaming " +
                "without overheating concerns.");
        news2.setImageUrl("https://i0.wp.com/www.coolingindia.in/wp-content/uploads/2022/01/innovative-cooling-technology.jpg?fit=792%2C612&ssl=1");

        NewsItem news3 = new NewsItem();
        news3.setId(3);
        news3.setTitle("Apple MacBook Pro Gets a Major Upgrade");
        news3.setImageUrl("https://www.dpreview.com/files/p/articles/2895714205/Apple_Unleashed_00098.jpeg");
        news3.setShortDescription("Apple has announced significant enhancements to its MacBook Pro lineup. " +
                "The new models come with Apple's custom-designed M1X processors, delivering exceptional speed and efficiency." +
                " They also feature a mini-LED display for stunning visuals and improved battery life, " +
                "making them a top choice for creative professionals.");

        news.add(news1);
        news.add(news2);
        news.add(news3);

        request.setAttribute("news", news);
        request.getRequestDispatcher("/news.jsp").forward(request,response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<Integer, String> newsFull = new HashMap<>();
        String news1 = "Lenovo, a leading laptop manufacturer, has just unveiled its latest ultrabook series, " +
                "featuring sleek designs and powerful performance. The new line includes models with high-resolution " +
                "displays and extended battery life, making them ideal for professionals and students on the go.";
        String news2 = "Acer has introduced a groundbreaking cooling technology in its gaming laptops. " +
                "The new cooling system efficiently dissipates heat, ensuring smoother gaming experiences with reduced " +
                "thermal throttling. Gamers can now enjoy extended hours of high-performance gaming without overheating concerns.";
        String news3 = "Apple has announced significant enhancements to its MacBook Pro lineup. " +
                "The new models come with Apple's custom-designed M1X processors, delivering exceptional speed and efficiency. " +
                "They also feature a mini-LED display for stunning visuals and improved battery life, " +
                "making them a top choice for creative professionals.";
        newsFull.put(1, news1);
        newsFull.put(2, news2);
        newsFull.put(3, news3);

        String newsId = request.getParameter("newsId");
        int newsIdInt = Integer.parseInt(newsId);
        String fullNews = newsFull.get(newsIdInt);
        request.setAttribute("fullNews", fullNews);
        request.getRequestDispatcher("/fullNews.jsp").forward(request, response);
    }
}
