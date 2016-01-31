package net.tbscg.myshop.dao.model;

import java.math.BigDecimal;

/**
 * Created by Mela on 2015-12-08.
 */
public class License extends Product  {//licencje możemy sprzedawać, jest to plik tekstowy który wysyłamy komus-czyli np licencja na TS

    public License(String name, BigDecimal price, String description) {
        super(name, price, description);
    }


}
