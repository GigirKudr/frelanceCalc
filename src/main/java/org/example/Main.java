import ru.netology.services.FreranceCalcService;

public class Main {
    public static void main(String[] args) {
        FreranceCalcService service = new FreranceCalcService();
        System.out.println(service.calculate(10_000, 3_000, 20_000));

    }


}