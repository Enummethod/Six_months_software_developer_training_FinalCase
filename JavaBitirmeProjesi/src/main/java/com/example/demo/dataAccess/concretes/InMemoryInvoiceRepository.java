package com.example.demo.dataAccess.concretes;

import com.example.demo.dataAccess.abstracts.InvoiceRepository;
import com.example.demo.entities.concretes.Invoice;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryInvoiceRepository extends InvoiceRepository {
    List<Invoice> invoces;

    public InMemoryInvoiceRepository(){
        invoces = new ArrayList<Invoice>();
        invoces.add(new Invoice(1,256,"01.02.1996","Telefon"));
        invoces.add(new Invoice(2,240,"01.03.2021","İnternet"));
        invoces.add(new Invoice(2,240,"01.05.2022","Su"));
    }

    @Override
    public List<Invoice>findAll(){
        return invoces;
    }
}
