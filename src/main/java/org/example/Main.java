import ru.netology.services.freranceCalcService;

public class Main {
    public static void main(String[] args) {
        freranceCalcService service = new freranceCalcService();
        System.out.println(service.calculate(100_000, 60_000, 150_000));

    }


}