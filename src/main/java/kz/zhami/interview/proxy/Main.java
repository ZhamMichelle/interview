package kz.zhami.interview.proxy;

import kz.zhami.interview.proxy.bean.Customer;
import kz.zhami.interview.proxy.bean.IWaiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Image image = new ProxyImage("sample.jpg");
//        image.display();
//        image.display();

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        IWaiter jhon = context.getBean("jhon", IWaiter.class);
//        Customer andrew = context.getBean("andrew", Customer.class);
//        Customer julia = context.getBean("julia", Customer.class);
//        Customer nina = context.getBean("nina", Customer.class);
//
//        for (int i = 0; i < 3; i++) {
//            new Thread(() -> andrew.placeOrder(jhon));
//            new Thread(() -> julia.placeOrder(jhon));
//            new Thread(() -> nina.placeOrder(jhon));
//        }
        System.out.println("END");
    }

    interface Image {
        void display();
    }

    static class RealImage implements Image {
        private String filename;

        public RealImage(String filename) {
            this.filename = filename;
            loadFromDisk();
        }

        private void loadFromDisk() {
            System.out.println("Loading image" + filename);
        }

        @Override
        public void display() {
            System.out.println("Dicplayong image: " + filename);
        }
    }

    static class ProxyImage implements Image {
        private String filename;
        private RealImage realImage;

        public ProxyImage(String filename) {
            this.filename = filename;
        }

        @Override
        public void display() {
            if (realImage == null) {
                realImage = new RealImage(filename);
            }
            realImage.display();
        }
    }
}
