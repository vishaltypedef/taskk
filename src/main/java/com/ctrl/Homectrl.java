package com.ctrl;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Todo;

@Controller
public class Homectrl {
	@Autowired
	ServletContext context;
	@RequestMapping("/home")
	public String home(Model m) {
		String str = "view";
		m.addAttribute("page", str);
		List<Todo> list=(List<Todo>)context.getAttribute("list");
		m.addAttribute("todos",list);
		return "home";
	}

	@RequestMapping("/add")
  public String add(Model m)
  {
	  String str="add";
	  Todo t=new Todo();
	  m.addAttribute("page", str);
	  m.addAttribute("todo", t);
	  return "home";
  }

	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String save(@ModelAttribute("todo") Todo t, Model m)
	{   t.setDate(new Date());
	   List<Todo> list=(List<Todo>)context.getAttribute("list");
	   list.add(t);
	   m.addAttribute("msg","Successfully Added");
		return "home";
	}
}
