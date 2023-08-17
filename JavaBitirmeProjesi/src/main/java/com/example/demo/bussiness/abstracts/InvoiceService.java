package com.example.demo.bussiness.abstracts;

import com.example.demo.bussiness.requests.CreateInvoiceRequest;
import com.example.demo.bussiness.responses.GetAllInvoicesResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InvoiceService {
    List<GetAllInvoicesResponse> getAll();
    void add(CreateInvoiceRequest createInvoiceRequest);

}
