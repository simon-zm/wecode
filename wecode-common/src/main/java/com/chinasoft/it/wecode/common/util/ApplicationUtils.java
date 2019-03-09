package com.chinasoft.it.wecode.common.util;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(false)
public class ApplicationUtils implements ApplicationContextAware {

    private static ApplicationContext ac;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ApplicationUtils.ac = applicationContext;
    }

    public static ApplicationContext getApplicationContext() {
        return ac;
    }

    public static <T> T getBean(Class<T> clz) {
        return ac.getBean(clz);
    }

    public static <T> T getBeanOfNullable(Class<T> clz) {
        try {
            return ac.getBean(clz);
        } catch (BeansException e) {
            return null;
        }
    }

    /**
     * 获取类型Bean集合
     * @param clz
     * @param <T>
     * @return
     */
    public static <T> Collection<T> getBeansOfType(Class<T> clz) {
        return ac.getBeansOfType(clz).values();
    }

    public static <T> T getBean(Class<T> clz, String name) {
        return ac.getBean(clz, name);
    }

    public static Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annotationType) throws BeansException {
        return ac.getBeansWithAnnotation(annotationType);
    }
}
