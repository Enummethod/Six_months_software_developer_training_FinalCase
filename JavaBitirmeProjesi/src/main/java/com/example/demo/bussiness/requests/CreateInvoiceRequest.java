package com.example.demo.bussiness.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateInvoiceRequest {

        private int amount;
        private String billType;
        private String processDate;

}
