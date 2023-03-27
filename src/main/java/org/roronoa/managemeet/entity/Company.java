package org.roronoa.managemeet.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
    @SequenceGenerator(name = "company_seq",allocationSize = 1)
    @Column(nullable = false,unique = true)
    private Integer id;

    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String reference;
    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String name;

    @NotNull
    @NotEmpty
    @Column(nullable = false,unique = true)
    private String address;

    @Valid
    @OneToMany(mappedBy = "company")
    private Set<Meet> meets;

    @OneToOne
    @JoinColumn(name = "city_id")
    private City city;
}
