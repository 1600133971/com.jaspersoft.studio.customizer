package com.jaspersoft.studio.customizer;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.renderer.category.BarRenderer;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

public class ItemMargin extends JRAbstractChartCustomizer implements JRChartCustomizer {

	@Override
	public void customize(JFreeChart chart, JRChart jasperChart) {
		if (PropertyUtils.hasProperty(jasperChart, "ItemMargin")) {
			Plot plot = chart.getPlot();
			if (plot instanceof CategoryPlot) {
				CategoryPlot categoryPlot = (CategoryPlot)plot;
				BarRenderer render = (BarRenderer) categoryPlot.getRenderer();
				render.setItemMargin(
					PropertyUtils.getDoubleProperty(jasperChart, "ItemMargin", 0.2));
			}
		}
	}

}
