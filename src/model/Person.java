package model;

import java.util.Objects;

public class Person {
    private String MemID;
    private String Name;
    private String Address;
    private String Email;
    private String PhnNo;

    Person(){
    }

    public String getMemID() {
        return MemID;
    }

    public void setID(String MemID) {
        this.MemID = MemID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhnNo() {
        return PhnNo;
    }

    public void setPhnNo(String phnNo) {
        PhnNo = phnNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(ID, person.ID) && Objects.equals(Name, person.Name) && Objects.equals(Email, person.Email) && Objects.equals(PhnNo, person.PhnNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, Name, Email, PhnNo);
    }

    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                ", Email='" + Email + '\'' +
                ", PhnNo='" + PhnNo + '\'' +
                '}';
    }
}
public class Member extends Person{
    private String Role;

    Member(){
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Member member = (Member) o;
        return Objects.equals(Role, member.Role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Role);
    }
}
public class Faculty extends Member{
    setRole(Faculty);
}