package ingredient;

public enum Measure {
    GRAM("g."),
    KILOGRAM("kg."),
    LITER("l."),
    PIECE("p.");    //штуки

    final String name;

    Measure(String name) {
        this.name = name;
    }
}
