package org.example.enums;

public enum Plan {
    BASIC("BASIC", 100),
    STANDARD("STANDARD", 200),
    ADVANCED("ADVANCED", 300);

    private String name;
    private int price; // int olarak değiştirildi

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}