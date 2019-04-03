
public class RegistrationPlate {
    // don't change the code which is already given to you

    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!
    private final String regCode;
    private final String country;

    public RegistrationPlate(String country, String regCode) {
        this.regCode = regCode;
        this.country = country;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;
        RegistrationPlate compared = (RegistrationPlate) obj;
        if (this.regCode.equals(compared.regCode) == false) return false;
        if (this.country.equals(compared.country) == false) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return this.regCode.hashCode() + this.country.hashCode();
    }
}
