import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public abstract class BaseForm {

    private String FormName;
    private BaseElement uniqueElement;

    Logger log = (Logger) LogManager.getLogger(BaseForm.class);

    BaseForm(BaseElement uniqueElement, String FormName) {
        this.uniqueElement = uniqueElement;
        this.FormName = FormName;
    }


    //Is element displayed
    public boolean isDisplayed() {
        log.info("Check uniqueElement isDisplayed");
        return uniqueElement.isDisplayed();
    }

    public void waitUntilLoaded(){
        log.info("waitUntilLoaded");

    }


}
