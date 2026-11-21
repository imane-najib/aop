package Spring_AOP.service;

import Spring_AOP.aspects.Log;
import Spring_AOP.aspects.SecuredByAspect;
import org.springframework.stereotype.Service;

@Service
public class IMetierImpl implements IMetier {
    @Override
    @Log
    @SecuredByAspect(roles={"USER","ADMIN"})
    public void process() {
        System.out.println("Business Process ......");
    }

    @Override
    @Log
    @SecuredByAspect(roles={"ADMIN"})
    public double compute() {
        double data=78;
        System.out.println("Business computing and returning");
        return data;
    }
}
