package com.org.spring.boot.service.controller;
import com.org.spring.boot.service.model.Contacts;
import org.springframework.web.bind.annotation.*;

@RestController
public class ContactController {

	@GetMapping("contacts")
    public Contacts contacts()
    {
		return new Contacts("Anand","Samy");
    }

}
