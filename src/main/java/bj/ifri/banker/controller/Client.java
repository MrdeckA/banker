package bj.ifri.banker.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bj.ifri.banker.service.ClientService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@CrossOrigin(origins = "*")
@Data
@Controller
@RequestMapping("clients")
public class Client {

    @Autowired
    private ClientService clientService;

    @GetMapping("/liste")
    public String getClients(Model model) {
        model.addAttribute("clients", clientService.getClients());
        return "clients/clients";
    }

    @GetMapping("/{clientId}")
    public String getClientDetails(@PathVariable Long clientId, Model model) {

        model.addAttribute("client", clientService.getClient(clientId));

        return "clients/details";
    }

}
