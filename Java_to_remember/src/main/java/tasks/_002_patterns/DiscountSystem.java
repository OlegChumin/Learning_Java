package tasks._002_patterns;

/**
 * Задача 3: Разработка системы расчета скидок
 * Описание:
 * Разработайте систему расчета скидок для интернет-магазина. Система должна поддерживать различные типы скидок
 * (процентные, фиксированные суммы, скидки за количество покупок и т.д.).
 *
 * Требования:
 *
 * Создайте интерфейс для расчета скидок.
 * Реализуйте несколько классов для различных типов скидок.
 * Система должна поддерживать возможность комбинирования различных типов скидок.
 * Добавьте возможность легко добавлять новые типы скидок в будущем.
 * Примененные паттерны:
 * Задача 3: Strategy и Decorator.
 */

// Discount interface
interface Discount {
    double apply(double price);
}

// Concrete discount classes
class PercentageDiscount implements Discount {
    private double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double apply(double price) {
        return price - (price * percentage / 100);
    }
}

class FixedAmountDiscount implements Discount {
    private double amount;

    public FixedAmountDiscount(double amount) {
        this.amount = amount;
    }

    @Override
    public double apply(double price) {
        return price - amount;
    }
}

class QuantityDiscount implements Discount {
    private int threshold;
    private double discount;

    public QuantityDiscount(int threshold, double discount) {
        this.threshold = threshold;
        this.discount = discount;
    }

    @Override
    public double apply(double price) {
        return price >= threshold ? price - discount : price;
    }
}

// Decorator for combining discounts
class DiscountDecorator implements Discount {
    private Discount baseDiscount;
    private Discount additionalDiscount;

    public DiscountDecorator(Discount baseDiscount, Discount additionalDiscount) {
        this.baseDiscount = baseDiscount;
        this.additionalDiscount = additionalDiscount;
    }

    @Override
    public double apply(double price) {
        double discountedPrice = baseDiscount.apply(price);
        return additionalDiscount.apply(discountedPrice);
    }
}

// Main class to demonstrate the solution
public class DiscountSystem {
    public static void main(String[] args) {
        Discount percentageDiscount = new PercentageDiscount(10);
        Discount fixedAmountDiscount = new FixedAmountDiscount(5);
        Discount quantityDiscount = new QuantityDiscount(50, 10);

        double price = 100;

        System.out.println("Original price: $" + price);
        System.out.println("Price after percentage discount: $" + percentageDiscount.apply(price));
        System.out.println("Price after fixed amount discount: $" + fixedAmountDiscount.apply(price));
        System.out.println("Price after quantity discount: $" + quantityDiscount.apply(price));

        Discount combinedDiscount = new DiscountDecorator(new PercentageDiscount(10), new FixedAmountDiscount(5));
        System.out.println("Price after combined discount: $" + combinedDiscount.apply(price));
    }
}
