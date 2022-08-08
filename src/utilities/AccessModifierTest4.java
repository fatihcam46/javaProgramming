package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierTest4 extends ProtectedAccessModifier {
    public static void main(String[] args) {

//it is only difference between default and protected
 //       System.out.println(AccessModifierTest4.name1);//it cannot//default is not visible outside the package
        System.out.println(AccessModifierTest4.name2);//protected static String name2//protected is  visible outside the package

    //    AccessModifierTest4.method1();//it cannot
        AccessModifierTest4.method2();//it is possible
    }
}
