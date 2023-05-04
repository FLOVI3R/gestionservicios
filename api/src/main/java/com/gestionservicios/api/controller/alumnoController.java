package com.gestionservicios.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RestController
@RequestMapping("/alumno")
public class alumnoController {

	@GetMapping("index")
	public ModelAndView registerForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/alumno/index");
		return modelAndView;
	}
}
