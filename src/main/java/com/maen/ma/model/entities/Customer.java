package com.maen.ma.model.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

//Entidad: Objeto que contiene atributos particulares.
@Getter //Getter de los atributos.
@Setter //Setter de los atributos.
@Builder
@AllArgsConstructor //Constructor con parametros.
@NoArgsConstructor //Constructor sin parametros.
@Entity //Definir que es una entidad(Objecto).
@Table(name = "Customer") //Mapeo hacia la tabla de la DB.
public class Customer implements Serializable {

    //Atributos.
    @Id
    @Column(name = "id_customer")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    private String email;
    @Column(name = "registration_date")
    private Date registrationDate;
}