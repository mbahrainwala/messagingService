package ca.mustafa.behrainwala.messagingService.database.dbo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity(name="items")
@Getter
@Setter
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", length=512, nullable = false, unique = true)
    private String title;

    @Column(name="description", length=4000)
    private String description;
}
