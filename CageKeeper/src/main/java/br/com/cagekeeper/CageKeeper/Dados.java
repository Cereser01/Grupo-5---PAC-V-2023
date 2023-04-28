package br.com.cagekeeper.CageKeeper;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Dados {
    @Id
    private Long id;
    private List Dados;
}
