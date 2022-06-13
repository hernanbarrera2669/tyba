package com.tyba.stepdefinitions;

import com.tyba.enums.CabeceraTabla;
import com.tyba.models.DatosPersonales;
import com.tyba.tasks.DatosRegistro;
import io.cucumber.java.DataTableType;
import io.cucumber.java.es.Cuando;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AdvantageStepDefinitions {
    @DataTableType
    public DatosPersonales datosRegistro(Map<String, String> datosRegistro) {
        return new DatosPersonales(
                datosRegistro.get(CabeceraTabla.USER_NAME.getValue()),
                datosRegistro.get(CabeceraTabla.EMAIL.getValue()),
                datosRegistro.get(CabeceraTabla.PASSWORD.getValue()),
                datosRegistro.get(CabeceraTabla.CONFIRM_PASSWORD.getValue()),
                datosRegistro.get(CabeceraTabla.NAME.getValue()),
                datosRegistro.get(CabeceraTabla.LAST_NAME.getValue()),
                datosRegistro.get(CabeceraTabla.CITY.getValue()),
                datosRegistro.get(CabeceraTabla.COUNTRY.getValue()));

    }

    @Cuando("ingrese a la opcion usuario para crear nueva cuenta con los datos$")
    public void datosRegistro(List<DatosPersonales> datosRegistroUsuario) {
        String username = datosRegistroUsuario.get(0).getUsername();
        String email = datosRegistroUsuario.get(0).getEmail();
        String password = datosRegistroUsuario.get(0).getPassword();
        String confirm_password = datosRegistroUsuario.get(0).getConfirm_password();
        String name = datosRegistroUsuario.get(0).getName();
        String last_name = datosRegistroUsuario.get(0).getLast_name();
        String country = datosRegistroUsuario.get(0).getCountry();
        String city = datosRegistroUsuario.get(0).getCity();
        theActorInTheSpotlight().attemptsTo(DatosRegistro.ingresarDatosUsuario(username, email, password, confirm_password, name,
                last_name, country, city));
    }


}
