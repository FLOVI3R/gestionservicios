package com.gestionservicios.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.gestionservicios.api.DTO.alumnoDTO;
import com.gestionservicios.api.DTO.loginUserDTO;
import com.gestionservicios.api.models.alumno;
import com.gestionservicios.api.service.alumnoServiceInterface;
import com.gestionservicios.api.service.servicioServiceInterface;

@Controller
@RestController
@RequestMapping("/api")
public class authController {

	@Autowired
	private alumnoServiceInterface alumnoService;
	
	@Autowired
	private servicioServiceInterface servicioService;

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
	@ResponseBody
	public ModelAndView registerAccount(alumnoDTO alumnoDto) {
		alumnoService.save(alumnoDto);
		return new ModelAndView("/auth/login");
	}
	
	@GetMapping("/loginForm")
	public ModelAndView loginForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/auth/login");
	    return modelAndView;
	}
	
	@PostMapping("/login")
	@ResponseBody 
	public void loginAccount(loginUserDTO loginUserDto, Model model) {
		alumno a = alumnoService.loginAccount(loginUserDto);
		if(a != null) {
			if(a.getRole().equals("admin")) {
				
			} else {
				
			}
		} else {
			loginForm(model);
		}
	}
}
