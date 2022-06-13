package com.tyba.enums;

public enum CabeceraTabla {

    USER_NAME ("username"),
    EMAIL ("email"),
    PASSWORD("password"),
    CONFIRM_PASSWORD("confirm_password"),
    NAME("name"),
    LAST_NAME("last_name"),
    COUNTRY("country"),
    CITY("city");

    private String value;

    CabeceraTabla(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
