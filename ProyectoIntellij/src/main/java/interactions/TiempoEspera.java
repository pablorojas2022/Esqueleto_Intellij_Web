package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import org.awaitility.Awaitility;
import utils.UtiliTime;
import java.util.concurrent.TimeUnit;

public class TiempoEspera implements Interaction
{
    private final int milisegundos;

    //CREAR EL CONSTRUCTOR
    public TiempoEspera(int milisegundos)
    {
        this.milisegundos = milisegundos*1000;
    }

    public static TiempoEspera unMomento(int miliseguntos)
    {
        return Tasks.instrumented(TiempoEspera.class, miliseguntos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try
        {
            Awaitility.await().forever().pollInterval(milisegundos,
                    TimeUnit.MILLISECONDS).until(UtiliTime.condicionExitosa());
        }
        catch (Exception e)
        {
            e.getMessage();
        }
    }
}
