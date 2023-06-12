package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class NuevaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nueva Empresa Registrada");
		
	 	String nombreEmpresa = request.getParameter("nombre");
	 	
	 	Empresa empresa = new Empresa();
	 	
	 	empresa.setNombre(nombreEmpresa);
	 	
	 	DB baseDeDatos = new DB();
	 	baseDeDatos.agregarEmpresa(empresa);
		
		//Despachando la request --> llamar al jsp 
	 	
	 	RequestDispatcher rd = request.getRequestDispatcher("/nuevaEmpresaRegistrada.jsp"); //Ordenes
	 	
	 	request.setAttribute("empresa", empresa.getNombre()); //Agrega al request un atributo que es el nombre de la empresa
	 														  //Jsp lo busca a traves de "empresa
	 	rd.forward(request, response); //Envío
	 	
	   
	 	
	}

}
