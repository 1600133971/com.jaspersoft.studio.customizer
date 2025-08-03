package com.jaspersoft.studio.customizer;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

public class IntegerTickUnits extends JRAbstractChartCustomizer implements JRChartCustomizer {

	@Override
	public void customize(JFreeChart chart, JRChart jasperChart) {
		Plot plot = chart.getPlot();
		if (plot instanceof CategoryPlot) {
			CategoryPlot categoryPlot = (CategoryPlot)plot;
			NumberAxis rangeAxis = (NumberAxis) categoryPlot.getRangeAxis();
			rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
		}
	}

}
