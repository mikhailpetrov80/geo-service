package geoServiceImpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;

public class TestGeoServiceImpl {

    @Test
    public void testGeoServiceImpl() {
        Location location = new Location("Moscow", Country.RUSSIA, null, 0);
        String ip = "172.0.32.11";
        GeoService geoService = new GeoServiceImpl();

        Assertions.assertEquals(location.getCountry(), geoService.byIp(ip).getCountry());
    }
}
