package Spring_AOP.service;

import org.springframework.stereotype.Service;

@Service
public class IMetierImpl implements IMetier {
    @Override
    public void process() {
        System.out.println("Business Process ......");
    }

    @Override
    public double compute() {
        double data=78;
        System.out.println("Business computing and returning");

        return data;
    }
}
