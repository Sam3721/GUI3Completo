package co.edu.udistrital.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.udistrital.model.Directorio;
import co.edu.udistrital.model.Persona;
import co.edu.udistrital.view.VentanaPrincipal;

public class Controller implements ActionListener{

	private VentanaPrincipal vista;
	private Directorio datos;
	
	
	public Controller() {
		vista = new VentanaPrincipal();
		datos= new Directorio();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPd().getLista_genero().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando=e.getActionCommand();
		
		if (comando.equals("LISTA1")) {
			vista.getPd().getLista_personas().removeActionListener(this);
			vista.getPd().getLista_personas().removeAllItems();
			vista.getPd().getLista_genero().removeItem("Buscar...");
			String generoBuscar= (String)vista.getPd().getLista_genero().getSelectedItem();
			for(Persona x: datos.getDirectorio()) {
				if(x.getGenero().equals(generoBuscar)) {
					vista.getPd().getLista_personas().addItem(x.getNombre());
				}
			}
			
			vista.getPr().getEnombre2().setText("");
			 vista.getPr().getEciudad2().setText("");
			 vista.getPr().getEtel2().setText("");
			 vista.getPr().getEmail2().setText("");
			 vista.getPim().cambiarImagen("");
			
			vista.getPd().getLista_personas().addActionListener(this);
		}else if(comando.equals("LISTA2")) {
		 String nombreBuscar= (String)vista.getPd().getLista_personas().getSelectedItem();
		 Persona encontrada=null;
		 for(Persona x: datos.getDirectorio()) {
			 if(x.getNombre().equals(nombreBuscar)) {
				 encontrada=x;
			 }
		 }
		 vista.getPr().getEnombre2().setText(encontrada.getNombre());
		 vista.getPr().getEciudad2().setText(encontrada.getCiudad());
		 vista.getPr().getEtel2().setText(encontrada.getTelefono());
		 vista.getPr().getEmail2().setText(encontrada.getEmail());
		 vista.getPim().cambiarImagen(encontrada.getArchivoFoto());

		}
	}
}





