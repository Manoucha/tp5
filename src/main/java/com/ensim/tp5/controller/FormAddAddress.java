package com.ensim.tp5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormAddAddress {

	@GetMapping("/formAddadress")
	public String requestForm(Model model) {
		return "formAddadress";
	}
}
