public class Tea extends Beverages {
    @Override
    void addCondiments() {
        super.addCondiments();
        System.out.println("Adding lemon");
    }

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addExtras() {
        super.addExtras();
    }
}
