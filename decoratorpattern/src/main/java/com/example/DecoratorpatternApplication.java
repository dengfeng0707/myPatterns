package com.example;

import com.example.service.logisticFee.AddLogisticFee;
import com.example.service.logisticFee.BaseDataInfo;
import com.example.service.logisticFee.DecoratorFee;
import com.example.service.logisticFee.SubtractLogisticFee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@SpringBootApplication
public class DecoratorpatternApplication implements CommandLineRunner {

    @Autowired
    @Qualifier(value = "LocalLogisticFee")
    private BaseDataInfo localLogisticFee;

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DecoratorpatternApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setWebApplicationType(WebApplicationType.NONE);
        application.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
//        SchoolReport sr = new FouthGradeSchoolReport();
//        sr= new HighScoreDecorator(sr);
//        sr = new SortDecorator(sr);
//        sr.report();
//        sr.sign("张三");

//        IStar freakStar = new FreakStar();
//        freakStar = new HotAir(freakStar);
//        freakStar = new Deny(freakStar);
//        System.out.println("===看一看虚假明星的形象===");
//        freakStar.act();

//        VirtualVehicle virtualVehicle = new ConcreteVirtualVehicle();
//        virtualVehicle = new VirtualVehiclePlusOfPrice(virtualVehicle, 10d, 20d, "234567890");
//        VehicleInfo vehicleInfo = virtualVehicle.generateVehicle("123456789");

//        Img img = new MyImg();
//        img = new ImgOfColor(img);
//        img.ImgDescription();
//
//        String str = "";

//        AbsSkillPackage absSkillPackage = new NormalSkill();
//        absSkillPackage = new FlySkill(absSkillPackage);
//        absSkillPackage = new DefenseSkill(absSkillPackage);
//        absSkillPackage.getSkillPackage();

        /**
         * 通过聚合属性的方式,为对象追加功能,实现的继承的功能，却比继承更加的灵活
         * 装饰者父类继承的抽象类是为了实现继承的优点
         * 有继承的优点而又解耦合
         */
        DecoratorFee decoratorFee = new AddLogisticFee(this.localLogisticFee);
        decoratorFee = new SubtractLogisticFee(decoratorFee);
        decoratorFee.process("计算物流费用");
    }
}
