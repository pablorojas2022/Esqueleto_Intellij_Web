package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class HomePage extends PageObject
{

    private static String targetElementName;
    //BUSCAR PRODUCTO
    public static final Target INPUT_TXT_BUSQUEDA = Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").located(By.xpath("//input[@class = 'nav-search-input']"));
    public static final Target CERRAR_COOKIES =Target.the("CERRAR LAS COOKIES").located(By.xpath("//button[normalize-space()='Entendido']"));
    public static final Target BUTTON_CERRAR_UBICACION =Target.the("CERRAR LA UBICACION").located(By.xpath("//button[@class='andes-tooltip-button-close']"));
    public static final Target LINK_SELECCIONAR_PRODUCTO =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").locatedBy("(//img[@alt='Tapabocas Mascarilla Kn95 X 10 - Unidad a $993'])[1]");
    public static final Target COLOR_PRODUCTO =Target.the("SELECCIONAR EL COLOR DEL PRODUCTO").located(By.xpath("(//img[@alt='Negro'])[1]"));

}