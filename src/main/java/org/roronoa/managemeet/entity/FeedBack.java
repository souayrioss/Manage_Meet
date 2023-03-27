package org.roronoa.managemeet.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FeedBack {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "feed_seq")
    @SequenceGenerator(name = "feed_seq",allocationSize = 1)
    @Column(nullable = false,unique = true)
    private Integer id;
    @NotNull
    @NotEmpty
    @Column(nullable = false,unique = true)
    private String uuid;

    @NotNull
    @NotEmpty
    @Column(nullable = false)
    private String message;



}
