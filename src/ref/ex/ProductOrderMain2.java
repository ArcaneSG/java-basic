package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] orders = {
                createProductOrder("두부", 2000, 2)
                , createProductOrder("감자", 5000, 1)
                ,createProductOrder("콜라", 1500, 2)
        };

        printProductOrder(orders);
        int totalAmount = getTotalAmount(orders);

        System.out.println("totalAmount = " + totalAmount);
    }

    static ProductOrder createProductOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printProductOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }
}
