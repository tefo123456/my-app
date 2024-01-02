package com.udla.productos.views.nuevoproductos;

import com.udla.productos.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Nuevo Productos")
@Route(value = "my-view", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
@Uses(Icon.class)
public class NuevoProductosView extends Composite<VerticalLayout> {

    public NuevoProductosView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        TextField textField3 = new TextField();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        HorizontalLayout layoutRow3 = new HorizontalLayout();
        HorizontalLayout layoutRow4 = new HorizontalLayout();
        TextField textField4 = new TextField();
        TextField textField5 = new TextField();
        TextField textField6 = new TextField();
        HorizontalLayout layoutRow5 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.setHeight("min-content");
        textField.setLabel("Codigo");
        textField.setWidth("min-content");
        textField2.setLabel("Precio");
        textField2.setWidth("min-content");
        textField3.setLabel("Cantidad");
        textField3.setWidth("min-content");
        layoutRow2.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.setHeight("min-content");
        layoutRow3.setHeightFull();
        layoutRow2.setFlexGrow(1.0, layoutRow3);
        layoutRow3.addClassName(Gap.MEDIUM);
        layoutRow3.setWidth("100%");
        layoutRow3.setHeight("min-content");
        layoutRow4.setHeightFull();
        layoutRow3.setFlexGrow(1.0, layoutRow4);
        layoutRow4.addClassName(Gap.MEDIUM);
        layoutRow4.setWidth("100%");
        layoutRow4.setHeight("min-content");
        textField4.setLabel("Peso");
        textField4.setWidth("min-content");
        textField5.setLabel("nombre");
        textField5.setWidth("min-content");
        textField6.setLabel("Fecha Caducidad");
        textField6.setWidth("min-content");
        layoutRow5.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow5);
        layoutRow5.addClassName(Gap.MEDIUM);
        layoutRow5.setWidth("100%");
        layoutRow5.setHeight("min-content");
        buttonPrimary.setText("Guardar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancelar");
        buttonSecondary.setWidth("min-content");
        getContent().add(layoutRow);
        layoutRow.add(textField);
        layoutRow.add(textField2);
        layoutRow.add(textField3);
        getContent().add(layoutRow2);
        layoutRow2.add(layoutRow3);
        layoutRow3.add(layoutRow4);
        layoutRow4.add(textField4);
        layoutRow4.add(textField5);
        layoutRow4.add(textField6);
        getContent().add(layoutRow5);
        layoutRow5.add(buttonPrimary);
        layoutRow5.add(buttonSecondary);
    }
}
