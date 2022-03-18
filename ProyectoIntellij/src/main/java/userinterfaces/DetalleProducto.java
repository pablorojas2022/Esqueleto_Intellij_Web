package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class DetalleProducto extends PageObject
{
    public static final Target AGREGAR_AL_CARRITO = Target.the("AGREGAR EL PRODUCTO").located(By.xpath("(//span[normalize-space()='Agregar al carrito'])[1]"));
    public static final Target VALIDACION_FINAL = Target.the("VALIDACION DEL FINAL").located(By.xpath("//div[@class='andes-card andes-card--flat andes-card--default center-card__body center-card__body--reduced center-card__body--centered andes-card--padding-default']"));
}
