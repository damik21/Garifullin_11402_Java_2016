package sample.entities;


/**
 * Created by Damir on 03.05.2016.
 */
public class PersonalEntity extends GeneralUserEntity {



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

    private String profession;

    private Integer salary;

    private String phone;

}
