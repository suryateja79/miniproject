package com.example.OnlineExamination.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class AdminController {

    @Autowired
    private AdminRepository adminRepository ;

    @GetMapping("/admin/{name}")
    public Admin getAdminDetails(@PathVariable("name") String name)
    {
        return this.adminRepository.findByName(name);
    }

    @PostMapping("/admin")
    public Admin addNewAdmin(@RequestBody Admin admin){
        return this.adminRepository.save(admin);}

}
