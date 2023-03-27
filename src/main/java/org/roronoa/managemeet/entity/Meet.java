package org.roronoa.managemeet.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Meet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meet_seq")
    @SequenceGenerator(name = "meet_seq",allocationSize = 1)
    @Column(nullable = false,unique = true)
    private Integer id;
    @NotNull
    @NotEmpty
    @Column(nullable = false,unique = true)
    private String reference;
    private LocalDate dateMeet;
    @ManyToOne
    private Company company;
    @NotNull @NotEmpty
    @Column(nullable = false)
    private String commercial;
    @NotNull
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusMeet status;
}
