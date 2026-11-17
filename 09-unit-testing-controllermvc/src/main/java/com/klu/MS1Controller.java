package com.klu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/ms1")
public class MS1Controller
{

    private final MS1Service service;

    public MS1Controller(MS1Service service)
    {
        this.service = service;
    }

    @GetMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b)
    {
        int result = service.add(a, b);
        return "MS 1.1 - Addition = " + result;
    }
}
