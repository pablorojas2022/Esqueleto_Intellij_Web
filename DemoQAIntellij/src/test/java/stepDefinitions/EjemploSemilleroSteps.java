package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.Home_Alerts;
import task.Home_Elements;
import task.Home_Widgets;
import userinterfaces.HomePage_Elements;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.HomePage_Alerts.FINAL_PROCESS;

public class EjemploSemilleroSteps {

    @Managed()
    // CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor=Actor.named("Global");
    //INSTANCIAR LA CLASE HOMEPAGE
    private HomePage_Elements homePage_elements=new HomePage_Elements();
    private List<String> datos;

    @Dado("que queremos ingresar a demoqa")
    public void queQueremosIngresarAdemoqa()
    {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        driver.manage().window().maximize();
        actor.can(BrowseTheWeb.with(driver));

        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(homePage_elements));


    }
	
    @Cuando("^vamos a elements a la opcion web table a adicionar y a eliminar un usuario y se escriba los datos (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*) en la pagina$")
    public void vamos_a_elements_a_la_opcion_web_table_a_adicionar_y_a_eliminar_un_usuario_y_se_escriba_los_datos_en_la_pagina(String firstName , String lastName, String email, String age, String salary,
                                                                                                                             String department, String eliminado, String txtSelectDate, String txtDateTime, String name)
	{

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
       actor.wasAbleTo(
	           Home_Elements.conDatos(firstName, lastName, email, age, salary, department, eliminado),
               Home_Widgets.conDatos(txtSelectDate, txtDateTime),
               Home_Alerts.conDatos(name));
    }

    @Entonces("^el ve su usuario creado$")
    public void el_ve_su_usuario_creado()
    {
       actor.should(seeThat(the(FINAL_PROCESS),isPresent()));
    }

    @Cuando("^vamos a elements a la opcion web table a adicionar y a eliminar un usuario y se escriba los datos por medio de una lista$")
    public void vamos_a_elements_a_la_opcion_web_table_a_adicionar_y_a_eliminar_un_usuario_y_se_escriba_los_datos_por_medio_de_una_lista(DataTable datos) {

        //EL ACTOR ES CAPAZ DE HACER TABLETOOLS Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
                Home_Elements.conDatos(datos.cell(0,0), datos.cell(0,1), datos.cell(0,2), datos.cell(0,3), datos.cell(0,4), datos.cell(0,5), datos.cell(0,6)),
                Home_Widgets.conDatos(datos.cell(0,7), datos.cell(0,8)),
                Home_Alerts.conDatos(datos.cell(0,9)));
    }
}
