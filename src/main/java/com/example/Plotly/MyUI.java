package com.example.Plotly;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import org.kopi.plotly.PlotlyChart;
import org.kopi.plotly.PlotlyFactory;
import org.kopi.plotly.configuration.DataConfiguration;
import org.kopi.plotly.configuration.LayoutConfiguration;
import org.kopi.plotly.data.dataseries.CoupleOfData;
import org.kopi.plotly.data.features.Colors;
import org.kopi.plotly.data.types.PieData;
import org.kopi.plotly.exceptions.DataMismatch;
import org.kopi.plotly.layout.LayoutWithoutAxis;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.annotations.Widgetset;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.shared.ui.colorpicker.Color;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("mytheme")
@Widgetset("com.example.Plotly.MyAppWidgetset")
public class MyUI extends UI {

  @Override
  protected void init(VaadinRequest vaadinRequest) {
    //**pie**//
    final VerticalLayout layout = new VerticalLayout();

    layout.setMargin(true);
    layout.setSpacing(true);
    PieData Pie = new PieData("fruit-pie", new CoupleOfData());
    try {
      Pie.getData().addData("banans", 10);
      Pie.getData().addData("apples", 13);
      Pie.getData().addData("oranges", 16);
      Pie.getData().addData("kiwis", 8);
    } catch (DataMismatch e) {
      e.printStackTrace();
    }
    
    List <Color> colors = new ArrayList<Color>();
    colors.add(Colors.ALICEBLUE);
    colors.add(Colors.ANTIQUEWHITE);
    colors.add(Colors.BEIGE);
    colors.add(Colors.AQUAMARINE);
    Pie.setColors(colors);
    
    PieData Pie2 = new PieData("fruit-pie", new CoupleOfData());
    try {
      Pie2.getData().addData("banans", 10);
      Pie2.getData().addData("apples", 13);
      Pie2.getData().addData("oranges", 16);
      Pie2.getData().addData("kiwis", 8);
    } catch (DataMismatch e) {
      e.printStackTrace();
    }
    Pie2.setColors(colors);
    PieData Pie3 = new PieData("fruit-pie", new CoupleOfData());
    try {
      Pie3.getData().addData("banans", 10);
      Pie3.getData().addData("apples", 13);
      Pie3.getData().addData("oranges", 16);
      Pie3.getData().addData("kiwis", 8);
    } catch (DataMismatch e) {
      e.printStackTrace();
    }
    PieData Pie4 = new PieData("fruit-pie", new CoupleOfData());
    try {
      Pie4.getData().addData("banans", 10);
      Pie4.getData().addData("apples", 13);
      Pie4.getData().addData("oranges", 16);
      Pie4.getData().addData("kiwis", 8);
    } catch (DataMismatch e) {
      e.printStackTrace();
    }
    
    PieData Pie5 = new PieData("fruit-pie", new CoupleOfData());
    try {
      Pie5.getData().addData("banans", 10);
      Pie5.getData().addData("apples", 13);
      Pie5.getData().addData("oranges", 16);
      Pie5.getData().addData("kiwis", 8);
    } catch (DataMismatch e) {
      e.printStackTrace();
    }
    PieData Pie6 = new PieData("fruit-pie", new CoupleOfData());
    try {
      Pie6.getData().addData("banans", 10);
      Pie6.getData().addData("apples", 13);
      Pie6.getData().addData("oranges", 16);
      Pie6.getData().addData("kiwis", 8);
    } catch (DataMismatch e) {
      e.printStackTrace();
    }
    
    DataConfiguration dataPie = new DataConfiguration();
    dataPie.addDataConfiguration(Pie);
    dataPie.addDataConfiguration(Pie2);
    dataPie.addDataConfiguration(Pie3);
    dataPie.addDataConfiguration(Pie4);
    dataPie.addDataConfiguration(Pie5);
    dataPie.addDataConfiguration(Pie6);
    
    
    LayoutWithoutAxis layoutwithoutAxis = new LayoutWithoutAxis();
    layoutwithoutAxis.setLayoutTitle("My fruits");
    layoutwithoutAxis.setBackgroundColor(Colors.LIGHTPINK);
    LayoutConfiguration  boxPie = new LayoutConfiguration(layoutwithoutAxis);
    
    PlotlyChart PieChart = PlotlyFactory.renderChart(dataPie,boxPie);
    
    layout.addComponent(PieChart);
    setContent(layout);
;

  }

  @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
  @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
  public static class MyUIServlet extends VaadinServlet {
  }
}
