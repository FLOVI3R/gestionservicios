package com.gestionservicios.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestionservicios.api.DTO.alumnoDTO;
import com.gestionservicios.api.service.alumnoServiceInterface;

@Controller
@RestController
@RequestMapping("/api/auth")
public class authController {

	private alumnoServiceInterface alumnoService;

	public authController(alumnoServiceInterface alumnoService) {
		super();
		this.alumnoService = alumnoService;
	}
	
	@ModelAttribute("alumno")
	public alumnoDTO register() {
		return new alumnoDTO();
	}
	
	@GetMapping("/registerForm")
	public ModelAndView registerForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/auth/register");
	    return modelAndView;
	}
	
	@PostMapping("/registerAccount")
	public ModelAndView registerAccount(@ModelAttribute("alumno") alumnoDTO alumnoDto) {
		alumnoService.save(alumnoDto);
		return new ModelAndView("/auth/login");
	}
	
	@GetMapping("/loginForm")
	public ModelAndView loginForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/auth/login");
	    return modelAndView;
	}
	
	@PostMapping("loginAccount")
	public ModelAndView loginAccount() {
		return null;
	}
}
