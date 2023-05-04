package com.gestionservicios.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestionservicios.api.service.alumnoServiceInterface;

@Controller
@RestController
@RequestMapping("/admin")
public class adminController {

	@Autowired
	private alumnoServiceInterface alumnoService;
	
	@GetMapping("dashboard")
	public ModelAndView registerForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/admin/dashboard");
		modelAndView.addObject("alumnos", alumnoService.alumnosList());
	    return modelAndView;
	}
}
