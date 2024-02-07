package filosofia.java.p184.enum_test;

public class Tour {
    Country country;
    Money money;
    int days;
    int price;

    public Tour(Country country, int days) {
        this.country = country;
        this.money = moneyOfCountry(country.ordinal());
        this.days = days;
        this.price = countCost(country, days);
        System.out.println("Поездка в " + this.country + " на " +
                this.days + " ночей стоит " +  this.price + " " +  this.money   );
    }

    public int countCost(Country country, int days) {
        switch (country) {
            case RUSSIA:
                return days * 1570;
            case EUROPEAN_UNION:
                return days * 42;
            case USA:
                return days * 30;
            case JAPAN:
                return days * 93;
            case SWEDEN:
                return days * 80;
            case GREAT_BRITAIN:
                return days * 120;
            default:
                return 0;
        }
    }

    public Money moneyOfCountry(int a) {
        switch (a) {
            case 0:
                return Money.RUBLE;
            case 1:
                return Money.EURO;
            case 2:
                return Money.DOLLAR;
            case 3:
                return Money.YEN;
            case 4:
                return Money.CROWN;
            case 5:
                return Money.POUND;
            default:
                return null;
        }
    }

}