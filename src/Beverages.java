abstract public class Beverages {
    boolean wantsExtras;
    final void finalTemplateMethod() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();

        if (wantsExtras) {
            addExtras();
        }
    }

    void addCondiments() {
    }

    void brew() {

    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }
    void boilWater() {
        System.out.println("Boiling water");
    }

    void addExtras() {

    }

    void setWantsExtras(boolean wantsExtras) {
        this.wantsExtras = wantsExtras;
    }

}
