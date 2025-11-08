/**
 * Copyright (c) Bill Tsui 2025. All rights reserved.
 * Licensed under the GPLv3 License.
 * <p>
 * {@code @Author:}       Bill Tsui
 * {@code @Date:}         Nov 06 2025 19:01
 * {@code @Description:}
 */

package mosfet.onjava21.fundamental.oop;

import java.lang.annotation.*;



@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface MyAnnotations {
    MyAnnotation[] value();
}
