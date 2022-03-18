package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.AgregarProducto;
import task.BuscarProducto;
import userinterfaces.HomePage;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;
import static net.serenitybdd.screenplay.questions.WebElementQuestion.the;
import static userinterfaces.DetalleProducto.VALIDACION_FINAL;

public class EjemploSemilleroSteps {

    @Managed()
    // CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor=Actor.named("Global");
    //INSTANCIAR LA CLASE HOMEPAGE
    private HomePage homePage=new HomePage();
    private List<String> datos;

    @Dado("que un cliente accede a la web de compras")
    public void queUnClienteAccederAlaWebDeComprar()
    {
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        driver.manage().window().maximize();
        actor.can(BrowseTheWeb.with(driver));

        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn(homePage));


    }

    @Cuando("^el agrego unos (.*) al carrito$")
    public void elAgregoUnProductoAlCarrito(String descripcion)
    {
        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion),
                AgregarProducto.cantidad());
    }

    @Entonces("^el valida la compra$")
    public void elValidaLaCompra()
    {
        actor.should(seeThat(the(VALIDACION_FINAL),isPresent()));
    }

    @Cuando("el agrega producto al carrito por medio de una lista")
    public void el_agrega_producto_al_carrito_por_medio_de_una_lista(List<String> datos) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(datos.get(0)),
                AgregarProducto.cantidad());
    }

}
