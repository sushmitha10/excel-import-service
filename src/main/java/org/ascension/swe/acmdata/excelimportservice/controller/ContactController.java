package org.ascension.swe.acmdata.excelimportservice.controller;


import org.ascension.swe.acmdata.excelimportservice.domain.Contact;
import org.ascension.swe.acmdata.excelimportservice.domain.Contact1;
import org.ascension.swe.acmdata.excelimportservice.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.Media;
import java.util.List;

@RequestMapping(value = "contact")
@RestController
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class ContactController {

    @Autowired
    private ContactService contactService;

    @RequestMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String save(@RequestBody Contact1 contact){
        return contactService.saveContactData(contact);
    }

    @RequestMapping(value = "readAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Contact> getAll(){
        return contactService.getContactData();
    }
}
