package com.gestionservicios.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestionservicios.api.DTO.comentarioDTO;
import com.gestionservicios.api.DTO.empresaDTO;
import com.gestionservicios.api.DTO.servicioDTO;
import com.gestionservicios.api.service.comentarioServiceInterface;
import com.gestionservicios.api.service.servicioServiceInterface;

@Controller
@RestController
public class empresaController {
	
	@Autowired
	private servicioServiceInterface servicioService;
	
	@Autowired
	private comentarioServiceInterface comentarioService;
	
	@GetMapping("empresa/servicios")
	public ModelAndView servicios(Model model, @Param("keyWord") String keyWord) {
		ModelAndView modelAndView = new ModelAndView("/empresa/empresa_servicios");
		modelAndView.addObject("servicios", servicioService.serviciosList(keyWord));
		modelAndView.addObject("keyWord", keyWord);
	    return modelAndView;
	}	
	
	@GetMapping("empresa/createServicioForm")
	public ModelAndView createServicioForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/empresa/empresa_createServicioForm");
	    return modelAndView;
	}	
	
	@PostMapping("empresa/createServicio")
	@ResponseBody
	public void createServicio(servicioDTO servicioDto) {
		servicioService.save(servicioDto);
	}
	
	@GetMapping("empresa/updateServicioForm/{id}")
	public ModelAndView updateServicioForm(Model model, @PathVariable Integer id) {
		ModelAndView modelAndView = new ModelAndView("/empresa/empresa_updateServicioForm");
		modelAndView.addObject("servicio", servicioService.getServicioById(id));
	    return modelAndView;
	}
	
	@PostMapping("empresa/updateServicio")
	@ResponseBody
	public void updateServicio(servicioDTO servicioDto) {
		servicioService.updateServicio(servicioDto);
	}
	
	@GetMapping("empresa/deleteServicio/{id}")
	public void deleteServicio(@PathVariable Integer id) {
		servicioService.deleteServicio(id);
	}
	
	@GetMapping("empresa/comentarServicioForm/{idservicios}")
	public ModelAndView comentarServicioForm(Model model, @PathVariable Integer idservicios) {
		ModelAndView modelAndView = new ModelAndView("/empresa/empresa_comentarServicioForm");
		modelAndView.addObject("idservicios", idservicios);
		return modelAndView;
	}
	
	@PostMapping("empresa/comentarServicio")
	@ResponseBody
	public void comentarServicio(comentarioDTO comentarioDto) {
		comentarioService.comentarServicio(comentarioDto);
	}
}
