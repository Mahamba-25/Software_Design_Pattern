import Observer.*;
import State.*;
import Strategy.*;
import Template_Method.*;
import Visitor.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        // Observer
        NewsPublisherImpl publisher = new NewsPublisherImpl();

        Observer smartphone = new NewsSubscriberSmartphone();
        Observer laptop = new NewsSubscriberLaptop();
        Observer tablet = new NewsSubscriberTablet();

        publisher.subscribe(smartphone);
        publisher.subscribe(laptop);
        publisher.subscribe(tablet);

        publisher.publishNews("Sport", "Team Spirit wins The International 2021!");
        publisher.publishNews("Science", "New images of blackhole has been shot!");


        // State
        System.out.println();
        Player player = new Player();
        player.play();
        player.pause();
        player.stop();


        // Strategy
        System.out.println();
        Order order = new Order();
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Card Payment Total: " + order.calculateTotal(1000));
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Wallet Payment Total: " + order.calculateTotal(1000));
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Cash on Delivery Total: " + order.calculateTotal(1000));


        // Template Method
        System.out.println();
        QualityCheck foodCheck = new FoodQualityCheck();
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Checking food quality:");
        foodCheck.performCheck();
        System.out.println("\nChecking electronics quality:");
        electronicsCheck.performCheck();


        // Visitor
        System.out.println();
        File textFile = new TextFile("document.txt");
        File executableFile = new ExecutableFile("program.exe");
        Visitor antivirus = new AntivirusVisitor();
        Visitor reportGenerator = new ReportVisitor();
        textFile.accept(antivirus);
        executableFile.accept(antivirus);
        textFile.accept(reportGenerator);
        executableFile.accept(reportGenerator);
    }
}