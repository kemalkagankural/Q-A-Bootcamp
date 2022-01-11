package appium.stepsdefinitions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.WithTimeout;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class FavoritoFilmes extends BaseScreen{


    @AndroidFindBy(className = "android.widget.TextView")
    private List<MobileElement> favoritos_elements;


    public void swipeForFavoritos(){
        swipeFromLeftToRigth();
    }

    public String getDefaultMessage(){
       return favoritos_elements.get(3).getText();
    }

    public Boolean isFavoritoScreenDisplayed(){
        return favoritos_elements.get(2).isSelected();
    }


}
