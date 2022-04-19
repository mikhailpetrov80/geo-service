package geoServiceImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class TestGeoServiceByCoordinates {

    @Test
    public void testGeoServiceByCoordinates() {
        GeoService geoService = new GeoServiceImpl();
        RuntimeException thrown = Assertions.assertThrows(RuntimeException.class,
                () -> geoService.byCoordinates(55.7522, 37.6156),
                "Not implemented");

        Assertions.assertEquals("Not implemented", thrown.getMessage());
    }
}
