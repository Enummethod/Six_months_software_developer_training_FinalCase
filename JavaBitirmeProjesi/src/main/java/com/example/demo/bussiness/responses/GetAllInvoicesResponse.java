package com.example.demo.bussiness.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllInvoicesResponse {
        private long id;
        private int amount;
        private String processDate;
        private String billType;
}
