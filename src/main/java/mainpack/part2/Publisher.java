package mainpack.part2;

public class Publisher {
    private String name;
    private String city;

    public Publisher(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("издательство не должно быть пустой ссылкой");
        this.name = name;
    }

    public void setCity(String city) {
        if (city == null)
            throw new IllegalArgumentException("город не должно быть пустой ссылкой");
        this.city = city;
    }


}
