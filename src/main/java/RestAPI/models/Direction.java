package RestAPI.models;

import javax.persistence.*;

@Entity
@Table(name = "directions")
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
