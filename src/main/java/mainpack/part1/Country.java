package mainpack.part1;

public class Country {

    public static final int POPULATION_UNKNOWN = 0;

    private String name;
    private int square;
    private int population;
    private String capitalName;
    private int capitalPopulation;


    public Country(String name, int square, int population, String capitalName, int capitalPopulation) {
        this.name = name;
        this.square = square;
        this.population = population;
        this.capitalName = capitalName;
        this.capitalPopulation = capitalPopulation;
    }

    public Country(String name, int square, int population) {
        this(name, square, population, null, POPULATION_UNKNOWN);
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        if (name == null)
            throw new IllegalArgumentException("name can't be null.");
        this.name = name;
    }

    public int getSquare() {
        return square;
    }


    public void setSquare(int square) {
        if (square <= 0)
            throw new IllegalArgumentException("square must be greater than 0");
        this.square = square;
    }


    public int getPopulation() {
        return population;
    }


    public void setPopulation(int population) {
        if (population <= 0)
            throw new IllegalArgumentException("population must be greater than 0");
        this.population = population;
    }


    public String getCapitalName() {
        return capitalName;
    }

    public void setCapital(String name, int population) {
        if (name != null) {
            if (population <= 0 && population != POPULATION_UNKNOWN)
                throw new IllegalArgumentException("population must be greater than zero");


            this.capitalName = name;
            this.capitalPopulation = population;
        } else {
            this.capitalName = null;
            this.capitalPopulation = -1;
        }
    }

    public void resetCapital() {
        capitalName = null;
        capitalPopulation = POPULATION_UNKNOWN;
    }


    public float getDensity() {
        int density = population / square;
        return density;
    }


    public int getCapitalPopulation() {
        return capitalPopulation;
    }


    public void print() {
        System.out.print(name + ", square: " + square);
        if (population > 0) {
            System.out.print(", population " + population);
        }
        System.out.println(", density: " + getDensity());


        if (capitalName != null) {
            System.out.print(" Capital is " + capitalName
                    + " with population ");
            if (capitalPopulation != POPULATION_UNKNOWN)
                System.out.println(capitalPopulation);
            else
                System.out.println("unknown");
        }
    }


    public static void printAll(Country[] countries) {
        for (Country c : countries) {
            c.print();
            System.out.println();
        }
    }


}


