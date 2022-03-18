package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetalleProducto.*;

public class AgregarProducto  implements Task
{
    // CREAR NUESTRO CONSTRUCTOR

      public AgregarProducto()
      {

      }

    // METODO QUE HEREDA EL OBJECTO ACTOR DE LA CLASE EJEMPLOSSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs (T actor)
    {
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                Click.on(AGREGAR_AL_CARRITO), //SELECCIONA IR A LA CESTA
                TiempoEspera.unMomento(2)
        );
    }

    public static AgregarProducto cantidad()
    {
        //RETONAR LA INSTANCIACION DE LA CLASE BUSCAR PRODUCTO Y SU DESCRIPCION
        return instrumented(AgregarProducto.class);
    }
}
