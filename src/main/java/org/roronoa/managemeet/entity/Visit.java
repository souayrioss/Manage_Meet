package org.roronoa.managemeet.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Visit {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meet_seq")
    @SequenceGenerator(name = "meet_seq",allocationSize = 1)
    @Column(nullable = false,unique = true)
    private Integer id;
    @NotNull
    @NotEmpty
    @Column(nullable = false,unique = true)
    private String reference;
    @Lob
    @NotNull @NotEmpty
    @Column(nullable = false)
    private String resume;
    @OneToOne
    private FeedBack feedBack;
    @OneToOne
    private Meet meet;
}
