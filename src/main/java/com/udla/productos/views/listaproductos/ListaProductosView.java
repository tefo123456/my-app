package com.udla.productos.views.listaproductos;

import com.udla.productos.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Lista Productos")
@Route(value = "my-view2", layout = MainLayout.class)
@Uses(Icon.class)
public class ListaProductosView extends Composite<VerticalLayout> {

    public ListaProductosView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
