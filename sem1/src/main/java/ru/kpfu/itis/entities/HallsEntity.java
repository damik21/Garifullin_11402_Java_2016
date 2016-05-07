package ru.kpfu.itis.entities;

import javax.persistence.*;

/**
 * Created by Damir on 29.04.2016.
 */
@Entity
@Table(name = "halls")
public class HallsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "places", nullable = false)
    private Integer places;

    @Column(name = "name", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlaces() {
        return places;
    }

    public void setPlaces(Integer places) {
        this.places = places;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HallsEntity that = (HallsEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (places != null ? !places.equals(that.places) : that.places != null) return false;
        return name != null ? name.equals(that.name) : that.name == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (places != null ? places.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }
}
