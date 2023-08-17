package com.example.demo.entities.concretes;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Table(name = "Invoice")
@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor

public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column(name = "amount")
    private int amount;
    @Column(name = "processDate")
    private String processDate;
    @Column(name = "billType" )
    private String billType;
}
