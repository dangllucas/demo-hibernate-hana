package com.example.demo;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "DEMO")
public class DemoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "HANS")
    private String hans;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHans() {
        return hans;
    }

    public void setHans(String hans) {
        this.hans = hans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemoEntity that = (DemoEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(hans, that.hans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hans);
    }
}
