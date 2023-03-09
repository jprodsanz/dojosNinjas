package com.pablo.mvc.dojosninjas.controllers;
import com.pablo.mvc.dojosninjas.models.Dojo;
import com.pablo.mvc.dojosninjas.models.Ninja;
import com.pablo.mvc.dojosninjas.services.DojoService;
import com.pablo.mvc.dojosninjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DojoController {
    @Autowired
    private DojoService dojoServ;
    @Autowired
    private NinjaService ninjaServ;

    @GetMapping("/")
    public String index(Model model) {
        // retrieves all Dojos from DB
        List<Dojo> allDojos = dojoServ.findAll();
        // stores list in model
        model.addAttribute("allDojos", allDojos);
        model.addAttribute("allNinjas", allDojos);

        return "index.jsp";
    }
    @GetMapping("/dojo/new")
    public String newDojo (@ModelAttribute("newDojo") Dojo newDojo) {
        return "NewDojo.jsp";
    }
    @PostMapping("/dojo/new")
    public String createDojo(@Valid @ModelAttribute("newDojo") Dojo newDojo, BindingResult result) {
        if (result.hasErrors()) {
            return "NewDojo.jsp";
        }
        else {
            dojoServ.create(newDojo);
            return "redirect:/";
        }
    }
//
//    @GetMapping("/dojo/create")
//    public String newDojo(@ModelAttribute("dojo") Dojo dojo) {
//        return "NewDojo.jsp";
//    }
//    @PostMapping("/dojo/create")
//    public String create(@Valid @ModelAttribute("dojo")Dojo dojo, BindingResult result) {
//        if (result.hasErrors()) {
//            return "NewDojo.jsp";
//        }else {
//            dojoServ.create(dojo);
//            return "redirect:/";
//        }
//    }
//    @GetMapping("/dojo/{id}/view")
//    public String findOneById(@PathVariable("id") Long id, Model model) {
//        System.out.println("Dojo" + id + "selected");
//        model.addAttribute("dojo", dojoServ.findOneById(id));
//        return "OneDojo.jsp";
//    }
//    @GetMapping("/dojo/all")
//    public String allDojos(Model model) {
//        model.addAttribute("allDojos", dojoServ.findAll());
//        return "AllDojos.jsp";
//    }
//
//    @DeleteMapping("/dojo/{id}")
//    public String delete(@PathVariable("id")Long id) {
//        dojoServ.delete(id);
//        return "redirect:/dojo/all";
//    }
}
