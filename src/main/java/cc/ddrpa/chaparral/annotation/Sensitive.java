package cc.ddrpa.chaparral.annotation;

import cc.ddrpa.chaparral.DesensitizeSerializer;
import cc.ddrpa.chaparral.desensitizer.IDesensitizer;
import cc.ddrpa.chaparral.enums.DesensitizeStrategy;
import com.fasterxml.jackson.annotation.JacksonAnnotationsInside;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@JacksonAnnotationsInside
@JsonSerialize(using = DesensitizeSerializer.class)
public @interface Sensitive {
    DesensitizeStrategy strategy() default DesensitizeStrategy.NULLING_OUT;

    Class<? extends IDesensitizer> using() default IDesensitizer.class;
}
