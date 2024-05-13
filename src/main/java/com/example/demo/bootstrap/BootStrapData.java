package com.example.demo.bootstrap;

import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

       /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Shop");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        if (productRepository.count()==0){
            //There are no products
            Product BMW= new Product("BMW",100200.0,15);
            Product Toyota= new Product("Toyota",10500.0,20);
            Product Honda= new Product("Honda",50000.0,50);
            Product Acura= new Product("Acura",65000.0,100);
            Product Ford= new Product("Ford",80000.0,30);

            productRepository.save(BMW);
            productRepository.save(Toyota);
            productRepository.save(Honda);
            productRepository.save(Acura);
            productRepository.save(Ford);
        }


        if (outsourcedPartRepository.count()==0){
            //There are no out sourced parts

            OutsourcedPart out_radiator= new OutsourcedPart();
            out_radiator.setCompanyName("Company 1");
            out_radiator.setName("radiator");
            out_radiator.setInv(5);
            out_radiator.setPrice(20.0);
            out_radiator.setId(100L);

            OutsourcedPart out_battery= new OutsourcedPart();
            out_battery.setCompanyName("Company 2");
            out_battery.setName("battery");
            out_battery.setInv(5);
            out_battery.setPrice(20.0);
            out_battery.setId(100L);

            OutsourcedPart out_door= new OutsourcedPart();
            out_door.setCompanyName("Company 3");
            out_door.setName("door");
            out_door.setInv(5);
            out_door.setPrice(20.0);
            out_door.setId(100L);

            OutsourcedPart out_engine= new OutsourcedPart();
            out_engine.setCompanyName("COmpany 4");
            out_engine.setName("engine");
            out_engine.setInv(5);
            out_engine.setPrice(20.0);
            out_engine.setId(100L);

            OutsourcedPart out_transmission= new OutsourcedPart();
            out_transmission.setCompanyName("COmpany 5");
            out_transmission.setName("transmission");
            out_transmission.setInv(5);
            out_transmission.setPrice(20.0);
            out_transmission.setId(100L);


            outsourcedPartRepository.save(out_radiator);
            outsourcedPartRepository.save(out_door);
            outsourcedPartRepository.save(out_engine);
            outsourcedPartRepository.save(out_transmission);
            outsourcedPartRepository.save(out_battery);

        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
