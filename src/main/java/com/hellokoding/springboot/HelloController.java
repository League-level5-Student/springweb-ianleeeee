package com.hellokoding.springboot;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @RequestMapping("/wow")
    public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
        model.addAttribute("name", scramb(name.toLowerCase()));
        return "hello";
    }
    public static String scramb(String name) {
		char []c = name.toCharArray();
		ArrayList<Character> l = new ArrayList();
		for (char character : c) {
			l.add(character);
		}
		Collections.shuffle(l);
		String finalS = "";
		for (Character x : l) {
			finalS+=x;
		}
		return finalS;
	}
   
}
