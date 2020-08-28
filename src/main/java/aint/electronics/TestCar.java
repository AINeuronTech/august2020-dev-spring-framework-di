package aint.electronics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCar {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("carBean.xml");
        Toyota toyota = (Toyota)context.getBean("toyota");
        toyota.driveCar();
    }
}
