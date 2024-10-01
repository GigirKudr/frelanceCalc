import ru.netology.services.FreranceCalcService;

public class Main {
    public static void main(String[] args) {
        FreranceCalcService service = new FreranceCalcService();
        System.out.println(service.calculate(100_000, 60_000, 150_000));

    }


}