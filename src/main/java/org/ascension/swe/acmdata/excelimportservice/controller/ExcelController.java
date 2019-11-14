package org.ascension.swe.acmdata.excelimportservice.controller;

import org.ascension.swe.acmdata.excelimportservice.repository.ExcelRepository;
import org.ascension.swe.acmdata.excelimportservice.domain.RequestModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "excel")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
public class ExcelController {
    @Autowired
    ExcelRepository excelRepository;

    @PostMapping(value = "save", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)

    public String save(@RequestBody List<RequestModel> requestModel) {
    excelRepository.saveAll(requestModel);

        return "success";
    }



    @GetMapping(value = "/",  produces = MediaType.APPLICATION_JSON_VALUE)

    public Iterable<RequestModel> get() {
        return excelRepository.findAll();
    }

}
