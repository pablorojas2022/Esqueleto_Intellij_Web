package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage_Widgets.*;

public class Home_Widgets implements Task
{

    // CREAR VARIABLES
    private String txtSelectDate;
    private String txtDateTime;

    //CREAR NUESTRO CONSTRUCTOR
    public Home_Widgets (String txtSelectDate, String txtDateTime)
    {
        this.txtSelectDate = txtSelectDate;
        this.txtDateTime = txtDateTime;
    }

    // METODO QUE HEREDA EL OBJECTO ACTOR DE LA CLASE EJEMPLOSSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs (T actor)
    {
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                //INGRESAR A WIDGETS
                (Scroll.to(CLICK_WELEMENTS)),
                TiempoEspera.unMomento(2),
                Click.on(CLICK_WELEMENTS),
                TiempoEspera.unMomento(3),
                Click.on(BTN_DATEPICKER),
                // SELECCION FECHA
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Hit.the(Keys.BACK_SPACE).keyIn(Sel_Date),
                Enter.theValue(txtSelectDate).into(Sel_Date), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(2),
                Hit.the(Keys.ENTER).into(Sel_Date),
                // SELECCION DE FECHA Y HORA
                TiempoEspera.unMomento(3),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Hit.the(Keys.BACK_SPACE).keyIn(Seld_DateAndTime),
                Enter.theValue(txtDateTime).into(Seld_DateAndTime), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(2),
                Hit.the(Keys.ENTER).into(Seld_DateAndTime),
                TiempoEspera.unMomento(3)
        );
    }

    public static Home_Widgets conDatos (String txtSelectDate, String txtDateTime)
    {
        return instrumented(Home_Widgets.class,txtSelectDate,txtDateTime);
    }
}
