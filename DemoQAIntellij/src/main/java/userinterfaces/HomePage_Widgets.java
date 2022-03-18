package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://demoqa.com/")
public class HomePage_Widgets extends PageObject
{

    //DEFINICIONES DE WIDGETS
    private static String targetElementName;
    // INGRESAR A WIDGETS
    public static final Target CLICK_WELEMENTS =
            Target.the("SELECCIONAR WIDGETS")
                    .located(By.xpath("//*[@class='left-pannel']/div/div[4]"));
    public static final Target BTN_DATEPICKER =
            Target.the("SELECCIONAR DATE PICKER")
                    .located(By.xpath("//span[contains(text(),'Date Picker')]"));
    // INGRESAR DATOS DE DATE
    public static final Target Sel_Date=
            Target.the("SELECCIONAR LA CASILLA DE DATE")
                    .locatedBy("#datePickerMonthYearInput");
    // DATE AND TIME PENDIENTE
    public static final Target Seld_DateAndTime =
            Target.the("SELECCIONAR DATE AND TIME")
                    .located(By.xpath("//input[@id='dateAndTimePickerInput']"));
}