package com.gestionservicios.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestionservicios.api.service.comentarioServiceInterface;
import com.gestionservicios.api.service.servicioServiceInterface;

@Controller
@RestController
@RequestMapping("/alumno")
public class alumnoController {
	
	@Autowired
	private servicioServiceInterface servicioService;
	
	@Autowired
	private comentarioServiceInterface comentarioService;

	@GetMapping("index")
	public ModelAndView registerForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/alumno/index");
		return modelAndView;
	}
	
	@GetMapping("/servicios")
	public ModelAndView servicios(Model model) {
		ModelAndView modelAndView = new ModelAndView("/alumno/alumno_servicios");
		modelAndView.addObject("serviciosNoAsignados", servicioService.serviciosListByFamiliaProf(1));
		modelAndView.addObject("serviciosAsignados", servicioService.serviciosListByFamiliaProfAsignados(1));
		return modelAndView;
	}
	
	@GetMapping("/valoraciones")
	public ModelAndView valoraciones(Model model) {
		ModelAndView modelAndView = new ModelAndView("/alumno/alumno_serviciosRealizados");
		modelAndView.addObject("comentarios", comentarioService.comentariosListByIdAlumno(1));
		modelAndView.addObject("servicios", servicioService.serviciosListByFamiliaProf(1));
		return modelAndView;
	}
}
