package com.github.vladislav719.controller;

import com.github.vladislav719.model.Notebook;
import com.github.vladislav719.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	private NotebookService service;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		System.out.println("START_____________________");
		for (Notebook notebook : service.getAll())
			System.out.println(notebook.getCpu());
		return "hello";
	}
}