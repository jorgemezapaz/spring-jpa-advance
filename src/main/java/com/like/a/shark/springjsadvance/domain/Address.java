package com.like.a.shark.springjsadvance.domain;

import com.like.a.shark.springjsadvance.repository.ClientRepository;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address")
public class Address {
    @Id
    @SequenceGenerator(
            name = "address_sequence",
            sequenceName = "address_sequence",
            allocationSize = 1,
            initialValue = 8100
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "address_sequence"
    )
    private Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "number")
    private String number;
    @ManyToOne(
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(name = "client_id")
    private Client client;
}
