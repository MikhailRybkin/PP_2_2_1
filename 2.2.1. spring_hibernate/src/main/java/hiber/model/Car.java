package hiber.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @Column(name = "cars_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int carsId;

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getCarsId() {
        return carsId;
    }

    public void setCarsId(int carsId) {
        this.carsId = carsId;
    }

    @Override
    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
