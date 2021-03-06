package javax.xml.bind.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation class is used to support the XSD 1.1 'assert'  
 * element in XML Schema files generated by JAXB RI.
 * 
 * @author Waldemar Hummer (hummer@infosys.tuwien.ac.at)
 * @since JAXB-Facets version 1.0.5
 */
@Target(value = { ElementType.TYPE })
@Retention(value = RetentionPolicy.RUNTIME)
@Documented
public @interface Assert {

    String id() default "";

    String test();

    String xpathDefaultNamespace() default "";

    Attribute[] attributes() default {};

    Annotation[] annotation() default {};

}