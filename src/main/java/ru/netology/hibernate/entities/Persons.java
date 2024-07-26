package ru.netology.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity()
public class Persons {
    @EmbeddedId
    private PersonId personId;

    @Column(nullable = false)
    private String phone_number;

    @Column(nullable = false)
    private String city_of_living;
}
