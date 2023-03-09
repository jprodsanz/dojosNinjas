package com.pablo.mvc.dojosninjas.controllers;

import com.pablo.mvc.dojosninjas.models.Ninja;
import com.pablo.mvc.dojosninjas.services.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/ninja")
public class NinjaController {
    @Autowired
    private NinjaService ninjaServ;

    @GetMapping("/")
    public String index(Model model ) {
        // retrieves all Ninjas from DB
        List<Ninja> allNinjas = ninjaServ.findAll();
        // Stores [ ] in model
        model.addAttribute("allNinjas", allNinjas);
        return "NinjaDisplay.jsp";
    }

    @GetMapping("/new")
    public String newNinja(@ModelAttribute("ninja") Ninja newNinja) {
        return "NewNinja.jsp";
    }

    @PostMapping("/new")
    public String createNinja(@Valid @ModelAttribute("ninja") Ninja newNinja, BindingResult result) {
        if (result.hasErrors()) {
            return "NewNinja.jsp";
        }
        ninjaServ.create(newNinja);
        return "redirect:/";
    }
}








//    // Automatic Dependency injection via Autowired
//    @Autowired
//    NinjaService ninjaServ;
//
//    @Autowired
//    DojoService dojoServ;
//
//    // Renders jsp when creating a ninja
//    @GetMapping("/ninja/create")
//    public String newNinja(@ModelAttribute("ninja")
//                           Ninja ninja, Model model){
//        model.addAttribute("allDojos", dojoServ.findAll());
//        return "NewNinja.jsp";
//    }
//    // Delivers form data to SQL if valid
//    @PostMapping("/ninja/create")
//    public String create(@Valid @ModelAttribute("ninja")
//                         Ninja ninja, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            model.addAttribute("allDojos", dojoServ.findAll());
//            return "newNinja.jsp";
//        } else {
//            ninjaServ.create(ninja);
//            return "redirect:/";
//        }
//    }


