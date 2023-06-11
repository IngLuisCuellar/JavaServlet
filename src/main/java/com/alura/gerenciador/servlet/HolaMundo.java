package com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Esta clase va a ser un servlet, extiende de un server del tipo http

@WebServlet(urlPatterns = "/hola") //Anotación para agregar el nombre que vamos  usar para llamar al servlet
public class HolaMundo extends HttpServlet {
	
	//Importamos el método service, el cual tiene la request y response como parametros
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		//Lo que se va enviar
		PrintWriter out = resp.getWriter();
		//Imprime en lo que enviamos al navegador
		out.println("<html>");
		out.println("<body>");
		out.println("Hola mundo, felicitaciones por crear tu primer Servlet!");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Se ejecutó el servlet");
		
	}

}
