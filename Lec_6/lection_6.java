package Lec_6;

public class lection_6 {
    int Id;
    int Salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        String res = String.format("%s %s %d %d", firstName, lastName, Salary, Id);
        return res;
    }

    @Override
    public boolean equals(Object o) {
        lection_6 t = (lection_6) o;
        return Id == t.Id && firstName == t.firstName;
    }

    @Override
    public int hashCode() {
        return Id;
    }
}
