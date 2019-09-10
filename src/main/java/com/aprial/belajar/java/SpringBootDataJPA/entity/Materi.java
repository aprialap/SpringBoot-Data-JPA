package com.aprial.belajar.java.SpringBootDataJPA.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity @Table(name = "tb_materi")
public class Materi {
    @Id @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(nullable = false, unique = true, length = 10)
    private String kode;

    @Column(nullable = false)
    private String nama;
}
