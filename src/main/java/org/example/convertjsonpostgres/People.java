package org.example.convertjsonpostgres;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Type;

@Entity
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class People {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;
    @Convert(converter = AddressAttributeConverter.class)
    @Column(name = "address", length = 500,columnDefinition = "jsonb")
    private Address address;
}
