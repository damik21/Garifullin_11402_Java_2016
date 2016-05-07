package ru.kpfu.itis.entities;

import javax.persistence.*;

/**
 * Created by Damir on 03.05.2016.
 */
@Entity
@Table(name = "personal")
public class PersonalEntity extends GeneralUserEntity {

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalEntity that = (PersonalEntity) o;

        if (!profession.equals(that.profession)) return false;
        if (!salary.equals(that.salary)) return false;
        return phone.equals(that.phone);

    }

    @Override
    public int hashCode() {
        int result = profession.hashCode();
        result = 31 * result + salary.hashCode();
        result = 31 * result + phone.hashCode();
        return result;
    }

    public String getProfession() {

        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "profession", nullable = false)
    private String profession;

    @Column(name = "salary", nullable = false)
    private Integer salary;

    @Column(name = "phone", nullable = false)
    private String phone;

}
