package ru.fischerski.shamalnotepad.db.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "space")
public class Space {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "space_id", nullable = false)
    private Long spaceId;

    @Column(name = "space_name", unique = true)
    private String spaceName;

    @Column(name = "editors")
    private String editors;

    @Column(name = "viewers")
    private String viewers;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Space)) return false;
        Space space = (Space) o;
        return Objects.equals(spaceId, space.spaceId) && Objects.equals(spaceName, space.spaceName) && Objects.equals(editors, space.editors) && Objects.equals(viewers, space.viewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spaceId, spaceName, editors, viewers);
    }
}
