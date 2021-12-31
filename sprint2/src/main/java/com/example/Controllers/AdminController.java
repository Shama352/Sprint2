package com.example.Controllers;

import java.util.List;

import com.example.Core.Driver;
import com.example.Services.AdminService;
import com.example.Services.DriverService;
import com.example.Services.IDriverService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AdminController {
    private AdminService Admin = new AdminService();
	private IDriverService dlist = new DriverService();


	@GetMapping("/driver/Unverflist")
    public List<Driver> getAll() {
        return dlist.getPendingList();
    }


    @PostMapping("/admin/verify/{name}")
    public int verify(@PathVariable String name) {
         return Admin.verify(dlist.getdriver(name));
    }
}
