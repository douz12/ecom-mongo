package com.ecom.controller;

import com.ecom.document.Category;
import com.ecom.repository.CategoryRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomePageController {
    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping("/")
    public String loadIndex(ModelMap modelMap) {
        modelMap.addAttribute("category", categoryRepository.findId("i1000"));

        return "index";
    }
}
