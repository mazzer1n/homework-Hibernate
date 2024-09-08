package ru.malyarov.maxim.EntityManager.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;
import ru.malyarov.maxim.EntityManager.type.HouseType;
import jakarta.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
public class House {
    @Id
    @GeneratedValue
    private Long id;

    @NotEmpty
    private String name;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date construction;

    @NotNull
    private Integer numberOrFloors;

    @Enumerated(EnumType.STRING)
    private HouseType type;

    @ManyToOne
    private Street street;

}
