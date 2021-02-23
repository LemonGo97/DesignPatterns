package cn.lemongo97.pattern.mediator;

public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... objects) {
        switch (str) {
            case "purchase.buy":
                this.byComputer((Integer) objects[0]);
                break;
            case "sale.sell":
                this.sellComputer((Integer) objects[0]);
                break;
            case "sale.offsell":
                this.offSell();
                break;
            case "stock.clear":
                this.clearStock();
                break;
        }

    }

    private void byComputer(int number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购IBM电脑: " + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number/2;
            System.out.println("采购IBM电脑: " + buyNumber + "台");
        }
    }

    private void sellComputer(int number) {
        if (super.stock.getStockNumber()<number){
            super.purchase.buyIBMComputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell() {
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

}
