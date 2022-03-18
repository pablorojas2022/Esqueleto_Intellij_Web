package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage_Alerts.*;

public class Home_Alerts implements Task
{
    // CREAR VARIABLES
    private String name;

    //CREAR NUESTRO CONSTRUCTOR
    public Home_Alerts (String name)
    {
       this.name = name;
    }
    // METODO QUE HEREDA EL OBJECTO ACTOR DE LA CLASE EJEMPLOSSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs (T actor)
    {
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // ACCEDE A ALERTAS
                Scroll.to(CLICKFRAME),
                Click.on(CLICKFRAME),
                Scroll.to(CLICKALERTS),
                Click.on(CLICKALERTS),
                TiempoEspera.unMomento(1),
                // CLICK1
                Click.on(BTN_1),
                TiempoEspera.unMomento(1));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // CLICK2
                TiempoEspera.unMomento(1),
                Click.on(BTN_2),
                TiempoEspera.unMomento(7));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // CLICK3
                TiempoEspera.unMomento(1),
                Click.on(BTN_3),
                TiempoEspera.unMomento(1));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // CLICK3
                TiempoEspera.unMomento(1),
                Click.on(BTN_3),
                TiempoEspera.unMomento(1));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                // CLICK4
                TiempoEspera.unMomento(1),
                Click.on(BTN_4),
                TiempoEspera.unMomento(5));
                Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();
                alert.sendKeys(name);
                alert.accept();
        actor.attemptsTo(

                TiempoEspera.unMomento(5));
    }
    public static Home_Alerts conDatos (String name)
    {
        return instrumented(Home_Alerts.class,name);
    }
}
