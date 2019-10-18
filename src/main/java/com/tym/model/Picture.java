package com.tym.model;
import com.google.gson.annotations.Expose;
import javax.persistence.*;

@Entity
@Table(name = "pictures")
public class Picture {

    @Expose
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(columnDefinition = "text")
    private String strBase64;
    @Expose
    @Column(nullable = false)
    private String description;

    public Picture() {
    }

    public Picture(String strBase64, String description) {
        this.strBase64 = strBase64;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStrBase64() {
        return strBase64;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
