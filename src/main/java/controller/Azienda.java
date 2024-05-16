package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Dipendente;
import model.Fattorino;

import java.io.IOException;
import java.util.ArrayList;

public class Azienda extends HttpServlet {

    private ArrayList<Dipendente> dipendenti = new ArrayList<Dipendente>();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Fattorino f = new Fattorino("Niccolo");
		dipendenti.add(f);
		resp.getWriter().print(dipendenti);
    }

}
