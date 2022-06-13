package com.tyba.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

import static com.tyba.userinterfaces.IngresoUsuarioNuevo.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class DatosRegistro implements Task {
    private String username;
    private String email;
    private String password;
    private String confirm_password;
    private String name;
    private String last_name;
    private String country;
    private String city;

    protected DatosRegistro(
            String username,
            String email,
            String password,
            String confirm_password,
            String name,
            String last_name,
            String country,
            String city) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.confirm_password = confirm_password;
        this.name = name;
        this.last_name = last_name;
        this.country = country;
        this.city = city;

    }

    public static DatosRegistro ingresarDatosUsuario(
            String username,
            String email,
            String password,
            String confirm_password,
            String name,
            String last_name,
            String country,
            String city) {
        return Tasks.instrumented(
                DatosRegistro.class, username, email, password, confirm_password, name, last_name, country, city);
    }

    @Step("{0} Se ingresan los datos de usuario")
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_USER),
                Click.on(BTN_CREATEACCOUNT), Enter.theValue(username).into(TXT_USERNAME),
                Enter.theValue(email).into(TXT_EMAIL),
                Enter.theValue(password).into(TXT_PASSWORD),
                Enter.theValue(confirm_password).into(TXT_CONFIRM_PASSWORD),
                Enter.theValue(name).into(TXT_NAME),
                Enter.theValue(last_name).into(TXT_LASTNAME),
                Click.on(LST_COUNTRY),
                SelectFromOptions.byVisibleText(country).from(LST_COUNTRY),
                Enter.theValue(city).into(TXT_CIUDAD));


    }
}
