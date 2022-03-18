package task;

import interactions.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePage_Elements.*;

public class Home_Elements implements Task
{
    // CREAR VARIABLES
    private String firstName;
    private String lastName;
    private String email;
    private String age;
    private String salary;
    private String department;
    private String eliminado;

      //CREAR NUESTRO CONSTRUCTOR
      public Home_Elements (String firstName, String lastName, String email, String age, String salary, String department, String eliminado)
      {
          this.firstName = firstName;
          this.lastName = lastName;
          this.email = email;
          this.age = age;
          this.salary = salary;
          this.department = department;
          this.eliminado = eliminado;
      }

    // METODO QUE HEREDA EL OBJECTO ACTOR DE LA CLASE EJEMPLOSSEMILLEROSTEPS
    @Override
    public <T extends Actor> void performAs (T actor)
    {
        // EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPISTO
        actor.attemptsTo(
                //INGRESAR A ELEMENTS
                TiempoEspera.unMomento(10),
                Scroll.to(CLICK_ELEMENTS),
                Click.on(CLICK_ELEMENTS),
                //INGRESAR A LA OPCION WEB TABLE
                TiempoEspera.unMomento(1),
                Scroll.to(SELECCIONAR_WEBTABLES),
                Click.on(SELECCIONAR_WEBTABLES),
                //ADICIONAR UN USUARIO
                TiempoEspera.unMomento(1),
                Click.on(BOTON_AGREGAR),
                TiempoEspera.unMomento(1),
                // Registration Form
                Click.on(CasillaFirstName),
                TiempoEspera.unMomento(10),
                Enter.theValue(firstName).into(CasillaFirstName), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(1),
                Enter.theValue(lastName).into(CasillaLastName), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(1),
                Enter.theValue(email).into(CasillaEmail), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(1),
                Enter.theValue(age).into(CasillaAge), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(1),
                Enter.theValue(salary).into(CasillaSalary), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(1),
                Enter.theValue(department).into(CasillaDepartament), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(1),
                Click.on(BTN_SUBMIT),
                TiempoEspera.unMomento(1),
                //ELIMINAR UN USUARIO
                TiempoEspera.unMomento(5),
                Enter.theValue(eliminado).into(CASILLA_BUSCAR), //RECIBIR UN VALOR, DILIGENCIA CAMPO BUSQUEDA
                TiempoEspera.unMomento(1),
                Click.on(ELEMINAR_REGISTRO),
                TiempoEspera.unMomento(5)
        );
    }

    public static Home_Elements conDatos (String firstName, String lastName, String email, String age, String salary, String department, String eliminado)
    {
        return instrumented(Home_Elements.class,firstName,lastName,email,age,salary,department,eliminado);
    }
}
