package mainpack.part1;

import mainpack.part1.Country;

public class Main {
    public static void main(String[] args) {
        Country[] contries = new Country[]{
                new Country("Russia", 17_100_000, 146_700_000, "Moscow", 12_600_000),
                new Country("Finland", 338_000, 5_500_000, "Helsinki", 655_000),
                new Country("France", 643_800, 67_800_000, "Paris", 21000000),
                new Country("Andorra", 467, 85_400, "Andorra la Vella", 22_600),
                new Country("Singapore", 725, 5_700_000)
        };

         Country.printAll(contries);
    }
}
