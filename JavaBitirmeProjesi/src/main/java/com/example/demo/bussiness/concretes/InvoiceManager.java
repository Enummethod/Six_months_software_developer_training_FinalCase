package com.example.demo.bussiness.concretes;

import com.example.demo.bussiness.abstracts.InvoiceService;
import com.example.demo.bussiness.requests.CreateInvoiceRequest;
import com.example.demo.bussiness.responses.GetAllInvoicesResponse;

import java.util.List;

public class InvoiceManager implements InvoiceService {
    @Override
    public List<GetAllInvoicesResponse> getAll() {
        return null;
    }

    @Override
    public void add(CreateInvoiceRequest createInvoiceRequest) {

    }
}
