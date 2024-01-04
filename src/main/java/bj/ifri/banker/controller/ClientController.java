
package bj.ifri.banker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import bj.ifri.banker.model.Client;
import bj.ifri.banker.service.ClientService;

import org.springframework.ui.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@RequestMapping("clients")
@CrossOrigin(origins = "*")
@Data
@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/liste")
    public String listClients(Model model) {
        // model.addAttribute("clients", clientService.getClients());
        return "home";
    }


    // @GetMapping("/createClient")
    // public String createClient(Model model) {
    // Client e = new Client();
    // model.addAttribute("client", e);
    // return "formNewClient";
    // }

    // @GetMapping("/updateClient/{id}")
    // public String updateClient(@PathVariable("id") final Integer id, Model model)
    // {
    // return "formUpdateClient";
    // }

    // @GetMapping("/deleteClient/{id}")
    // public ModelAndView deleteClient(@PathVariable("id") final int id) {
    // return new ModelAndView("redirect:/");
    // }

}