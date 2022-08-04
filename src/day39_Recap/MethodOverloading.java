package day39_Recap;

public class MethodOverloading {
    private void method1(){

    }
//parameter must be different.name must be same.is performed within class
    private int method1(int a){
        return a;
    }
}
/*
Method Overriding: giving different implementations to the method
					MUST happen in the child class
					return-type, method name, parameter MUST be same
					Access modifier need to be same or more visible
							public > protected > default
					Method we can not override: private, static, final
					ONLY the instance methods (not final & not private) can be overriden
					@Overriden annotation must be applicable
 */