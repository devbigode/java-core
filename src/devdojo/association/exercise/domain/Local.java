package devdojo.association.exercise.domain;

public class Local {
    private String address;

    public Local(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Local{" +
                "address='" + address + '\'' +
                '}';
    }
}
