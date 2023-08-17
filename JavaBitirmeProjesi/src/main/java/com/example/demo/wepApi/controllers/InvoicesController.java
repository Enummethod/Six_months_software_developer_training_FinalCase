package com.example.demo.wepApi.controllers;

import com.example.demo.bussiness.abstracts.InvoiceService;
import com.example.demo.bussiness.requests.CreateInvoiceRequest;
import com.example.demo.bussiness.responses.GetAllInvoicesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
public class InvoicesController {
    private InvoiceService invoiceService;

    @Autowired
    public InvoicesController(InvoiceService invoiceService){
        super();
        this.invoiceService=invoiceService;
    }

    @GetMapping("/getall")
    public List<GetAllInvoicesResponse>getAll(){
        return invoiceService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody()CreateInvoiceRequest createInvoiceRequest){
        this.invoiceService.add(createInvoiceRequest);
    }

}
