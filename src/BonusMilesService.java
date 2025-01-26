public class BonusMilesService {
    public int calculate(int price) {
        int miles = 20;// 1 миля за каждые 20 рублей

        int result;
        if (price > 20 ) {
            result = 1;
        } else {
            result = 0;
        }
        return price / miles;
    }
}
