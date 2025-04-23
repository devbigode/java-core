package devdojo.association.domain;

public class Student {
    private String name;
    private long RA;
    private String room;

    public Student(String name, long RA, String room) {
        this.name = name;
        this.RA = RA;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getRA() {
        return RA;
    }

    public void setRA(long RA) {
        this.RA = RA;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", RA=" + RA +
                ", room='" + room + '\'' +
                '}';
    }
}
