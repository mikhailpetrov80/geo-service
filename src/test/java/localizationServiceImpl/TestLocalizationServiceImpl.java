package localizationServiceImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class TestLocalizationServiceImpl {

    @Test
    public void testLocalizationServiceImpl() {
        Country country = Country.RUSSIA;
        String expected = "Добро пожаловать";
        LocalizationService loc = new LocalizationServiceImpl();

        Assertions.assertEquals(expected, loc.locale(country));
    }
}
