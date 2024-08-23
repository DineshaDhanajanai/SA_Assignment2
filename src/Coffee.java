public class Coffee extends Beverages {
    @Override
    void addCondiments() {
        super.addCondiments();
        System.out.println("Adding sugar and milk");
    }

    @Override
    void brew() {
        super.brew();
        System.out.println("Dripping coffee through the filter");
    }

    @Override
    void addExtras() {
        super.addExtras();
        System.out.println("Adding vanilla syrup");
    }
}
