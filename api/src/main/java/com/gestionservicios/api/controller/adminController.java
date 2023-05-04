package com.gestionservicios.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.gestionservicios.api.DTO.empresaDTO;
import com.gestionservicios.api.DTO.familiaProfesionalDTO;
import com.gestionservicios.api.service.alumnoServiceInterface;
import com.gestionservicios.api.service.empresaServiceInterface;
import com.gestionservicios.api.service.familiaProfServiceInterface;

@Controller
@RestController
public class adminController {
	
	@Autowired
	private alumnoServiceInterface alumnoService;
	
	@Autowired
	private empresaServiceInterface empresaService;
	
	@Autowired
	private familiaProfServiceInterface familiaProfService;
	
	@GetMapping("admin/alumnos")
	public ModelAndView alumnos(Model model) {
		ModelAndView modelAndView = new ModelAndView("/admin/admin_alumnos");
		modelAndView.addObject("alumnos", alumnoService.alumnosList());
	    return modelAndView;
	}	
	
	@GetMapping("admin/empresas")
	public ModelAndView empresas(Model model) {
		ModelAndView modelAndView = new ModelAndView("/admin/admin_empresas");
		modelAndView.addObject("empresas", empresaService.empresasList());
	    return modelAndView;
	}	
	
	@GetMapping("admin/familiasProf")
	public ModelAndView familiasProf(Model model) {
		ModelAndView modelAndView = new ModelAndView("/admin/admin_familiasProf");
		modelAndView.addObject("familiasProf", familiaProfService.familiasProfList());
	    return modelAndView;
	}	
	
	@GetMapping("admin/createEmpresaForm")
	public ModelAndView createEmpresaForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/admin/admin_createEmpresaForm");
	    return modelAndView;
	}
	
	@PostMapping("admin/createEmpresa")
	public void createEmpresa(@ModelAttribute("empresa") empresaDTO empresaDto) {
		empresaService.save(empresaDto);
	}
	
	@GetMapping("admin/updateEmpresaForm")
	public ModelAndView updateEmpresaForm(@RequestParam(name="idEmpresa") Integer id, Model model) {
		ModelAndView modelAndView = new ModelAndView("/admin/admin_updateEmpresaForm");
		modelAndView.addObject("empresa", empresaService.getEmpresaById(id));
	    return modelAndView;
	}
	
	@PostMapping("admin/updateEmpresa")
	public void updateEmpresa(@ModelAttribute("empresa") empresaDTO empresaDto) {
		empresaService.update(empresaDto);
	}
	
	@GetMapping("admin/createFamiliaProfForm")
	public ModelAndView createFamiliaProfForm(Model model) {
		ModelAndView modelAndView = new ModelAndView("/admin/admin_createfamiliaProfForm");
	    return modelAndView;
	}
	
	@PostMapping("admin/createFamiliaProf")
	public void createFamiliaProf(@ModelAttribute("FamiliaProfesional") familiaProfesionalDTO familiaProfDto) {
		familiaProfService.save(familiaProfDto);
	}
	
	@GetMapping("admin/updateFamiliaProfForm/{idfamiliaprofesional}")
	public ModelAndView updateFamiliaProfForm(@RequestParam(name="idfamiliaprofesional") Integer id, Model model) {
		ModelAndView modelAndView = new ModelAndView("/admin/admin_updateFamiliaProfForm");
		modelAndView.addObject("familiaProfesional", familiaProfService.getFamiliaProfById(id));
	    return modelAndView;
	}
	
	@PostMapping("admin/updateFamiliaProf")
	public void updateFamiliaProf(@ModelAttribute("familiaProfesional") familiaProfesionalDTO familiaProfDto) {
		familiaProfService.update(familiaProfDto);
	}
	
	@DeleteMapping("admin/deleteAccount/{id}")
	public void delete(@RequestParam Integer id) {
		alumnoService.deleteAlumnoById(id);
	}
}
