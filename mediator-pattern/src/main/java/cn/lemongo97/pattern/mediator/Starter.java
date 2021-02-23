package cn.lemongo97.pattern.mediator;

public class Starter {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        System.out.println("------------采购人员采购电脑-----------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(100);

        System.out.println("------------销售人员销售电脑-----------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        System.out.println("------------库管人员清库处理-----------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }

}
