package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Credenciales;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String RedirectLogin() {
		return "redirect:/login";
	}
	@GetMapping("/login")
	public String Login(Model model,
			@RequestParam(name="error", required=false)String error) {
		model.addAttribute("error", error);
		model.addAttribute("credenciales", new Credenciales());
		
		return "login";
	}
	
	@PostMapping("/check")
	public String Check(@ModelAttribute(name="credenciales") Credenciales credenciales) {
		
		if(credenciales.getNombre().equals("paco") && credenciales.getPass().equals("234")) {		
		 return "users";
		} else {
			return "redirect:/login?error";
		}
	}
}
