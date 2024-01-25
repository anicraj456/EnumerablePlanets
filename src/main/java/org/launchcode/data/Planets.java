package org.launchcode.data;

public enum Planets {
    // list the planets here.
    // Mercury, Venus, Earth, Mars, Jupiter,
    // Saturn, Uranus, Neptune
    // Don't forget to capitalization convention and enum
    MERCURY("Mercury", 88,1516),
    VENUS("Venus",225,3760),
    EARTH("Earth",365,3959),
    MARS("Mars",687,2106),
    JUPITER("Jupiter",4333,43441),
    SATURN("Saturn",10759,36184),
    URANUS("Uranus",30687,15759),
    NEPTUNE("Neptune",60200,15299);

    private final String name;
    private final double yearLength;
    private final double planetSize;

    Planets(String name, double yearLength, double planetSize) {
        this.name = name;
        this.yearLength = yearLength;
        this.planetSize = planetSize;
    }

    public String getName() {
        return name;
    }

    public double getYearLength() {
        return yearLength;
    }
    // syntax to separate value and end the list

    public double getPlanetSize() {
        return planetSize;
    }
}
