package edu.Task_9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeRepository repo;

    // Home page mapping
    @GetMapping("/")
    public String home() {
        return "home";   // loads home.html
    }

    // Handle employee search request
    @GetMapping("/employee")
    public String getEmployee(@RequestParam("id") int id, Model model) {

        Employee emp = repo.findById(id);

        if (emp == null) {
            model.addAttribute("error", "Employee not found for ID: " + id);
        } else {
            model.addAttribute("emp", emp);
        }

        return "employee";   // loads employee.html
    }
}