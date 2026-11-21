package Spring_AOP.service;

import Spring_AOP.aspects.Log;
import org.springframework.stereotype.Service;

@Service
public class IMetierImpl implements IMetier {
    @Override
    @Log
    public void process() {
        System.out.println("Business Process ......");
    }

    @Override
    @Log
    public double compute() {
        double data=78;
        System.out.println("Business computing and returning");
        return data;
    }
}
