package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://demoqa.com")
public class HomePage_Alerts extends PageObject {

    //DEFINICIONES DE WIDGETS
    private static String targetElementName;
    // INGRESAR A ALERTAS
    public static final Target CLICKFRAME =
            Target.the("SELECCIONAR LA CASILLA DE FRAMES Y ALERTAS")
                    .located(By.xpath("//*[@class='left-pannel']/div/div[3]"));
    public static final Target CLICKALERTS =
            Target.the("SELECCIONAR LA OPCION DE ALERTS")
                    .located(By.xpath("//span[normalize-space()='Alerts']"));
    // INGRESAR BOTONES
    public static final Target BTN_1 =
            Target.the("SELECCIONAR PRIMER BOTON")
                    .located(By.xpath("//button[@id='alertButton']"));
    public static final Target BTN_2 =
            Target.the("SELECCIONAR SEGUNDO BOTON")
                    .located(By.xpath("//button[@id='timerAlertButton']"));
    public static final Target BTN_3 =
            Target.the("SELECCIONAR TERCER BOTON")
                    .located(By.xpath("//button[@id='confirmButton']"));
    public static final Target BTN_4 =
            Target.the("SELECCIONAR CUARTO BOTON")
                    .located(By.xpath("//button[@id='promtButton']"));
    public static final Target FINAL_PROCESS =
            Target.the("DAR FIN AL PROCESO DE AUTOMATIZACION")
                    .located(By.xpath("//span[@id='promptResult']"));
}
