package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Scroll;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage.*;

public class BuscarProducto implements Task
{
    // CREAR VARIABLE
    private  String descripcion;

    //CREAR NUESTRO CONSTRUCTOR
    public BuscarProducto (String descripcion)
    {
             this.descripcion=descripcion;

    }

    //METODO QUE HEREDA AL OBJETO ACTOR DE LA CLASE EJEMPLOSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs(@NotNull T actor)
    {
              //EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                Click.on(CERRAR_COOKIES),
                Enter.theValue(descripcion).into(INPUT_TXT_BUSQUEDA), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                Hit.the(Keys.ENTER).into(INPUT_TXT_BUSQUEDA), // REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(10),
                Click.on(BUTTON_CERRAR_UBICACION),
                TiempoEspera.unMomento(2),
                Scroll.to(LINK_SELECCIONAR_PRODUCTO),
                TiempoEspera.unMomento(2),
                Click.on(LINK_SELECCIONAR_PRODUCTO), // SELECCIONA PRODUCTO A AGREGAR
                TiempoEspera.unMomento(2),
                Click.on(COLOR_PRODUCTO),
                TiempoEspera.unMomento(2)
        );
    }
    public static BuscarProducto conDescripcion (String descripcion)
    {
        //RERTORNA LA INSTANCIACION DE LA CLASE BUSCAR PRODUCTO
        return instrumented(BuscarProducto.class,descripcion);
    }
}
