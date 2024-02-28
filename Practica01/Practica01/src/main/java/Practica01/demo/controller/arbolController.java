package Practica01.demo.controller;

import Practica01.demo.service.arbolService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class arbolController {
    
    @Autowired
    private arbolService arbolService;

    @GetMapping("/arboles")
    public String listarArboles(Model model) {
        try {
            var arboles = arbolService.getarbol(false);
            model.addAttribute("arboles", arboles);
            model.addAttribute("totalArboles", arboles.size());
        } catch (Exception e) {
            log.error("Error al obtener la lista de árboles", e);
            model.addAttribute("error", "Se produjo un error al obtener la lista de árboles.");
        }
        return "arbol/listado";
    }
}
