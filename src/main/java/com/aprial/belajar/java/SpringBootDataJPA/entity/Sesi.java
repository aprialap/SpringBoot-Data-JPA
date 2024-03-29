package com.aprial.belajar.java.SpringBootDataJPA.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Sesi {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Temporal(TemporalType.DATE)
    private Date mulai;

    @Temporal(TemporalType.DATE)
    private Date sampai;

    @ManyToOne
    @JoinColumn(name = "id_materi", nullable = false)
    private Materi materi;

    @ManyToMany
    @JoinTable(
            name="peserta_pelatihan",
            joinColumns = @JoinColumn(name = "id_sesi"),
            inverseJoinColumns = @JoinColumn(name = "id_peserta")
    )
    private List<Peserta> daftarPeserta = new ArrayList<>();


}
