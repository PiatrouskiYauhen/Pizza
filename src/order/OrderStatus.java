package order;

public enum OrderStatus {
    NEW("New"),
    COMPLETED("Completed");

    final String name;

    OrderStatus(String name) {
        this.name = name;
    }
}