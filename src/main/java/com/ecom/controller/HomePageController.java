package com.ecom.controller;

import com.ecom.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePageController {
    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/")
    public String loadIndex(ModelMap modelMap) {
        modelMap.addAttribute("category", categoryRepository.findOne("i1000"));
        return "index";
    }
}
