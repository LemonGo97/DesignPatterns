package cn.lemongo97.pattern.bridge;

public abstract class Corp {

    private final Product product;

    public Corp(Product product) {
        this.product = product;
    }

    public void makeMoney() {
        this.product.beProduced();
        this.product.beSelled();
    }
}
