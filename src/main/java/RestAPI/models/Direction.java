package RestAPI.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "directions")
@Data
public class Direction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "direction_id")
    private long id;

    @Column(name = "Title")
    private String title;

    @Column(name = "Description")
    private String description;

    public Direction() {
    }

    public Direction(String title, String description) {
        this.title = title;
        this.description = description;
    }
}