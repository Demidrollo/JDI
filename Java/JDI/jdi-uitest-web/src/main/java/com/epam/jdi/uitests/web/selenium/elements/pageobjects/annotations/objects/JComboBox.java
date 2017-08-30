package com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.objects;

import com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.JFindBy;
import org.openqa.selenium.support.FindBy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface JComboBox {
    FindBy root() default @FindBy();
    FindBy value() default @FindBy();
    FindBy list() default @FindBy();
    FindBy expand() default @FindBy();
    FindBy labelLocator() default @FindBy();

    JFindBy jRoot() default @JFindBy();
    JFindBy jValue() default @JFindBy();
    JFindBy jList() default @JFindBy();
    JFindBy jExpand() default @JFindBy();
    JFindBy jLabelLocator() default @JFindBy();
}