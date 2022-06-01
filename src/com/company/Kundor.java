package com.company;

public enum Kundor {
    ДУЙШОМБУ("Дуйшомбу"),
    ШЕЙШЕМБИ("Шейшемби"),
    ШАРШЕМБИ("Шаршемби"),
    БЕЙШЕМБИ("Бейшемби"),
    ЖУМА("Жума"),
    ИШЕМБИ("Ишемби"),
    ЖЕКШЕМБИ("Жекшемби");

    private String name;

    Kundor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
