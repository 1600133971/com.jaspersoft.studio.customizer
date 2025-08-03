package com.jaspersoft.studio.customizer;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.Plot;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

public class CategoryLabelLines extends JRAbstractChartCustomizer implements JRChartCustomizer {

	@Override
	public void customize(JFreeChart chart, JRChart jasperChart) {
		if (PropertyUtils.hasProperty(jasperChart, "CategoryLabelLines")) {
			Plot plot = chart.getPlot();
			if (plot instanceof CategoryPlot) {
				CategoryPlot categoryPlot = (CategoryPlot)plot;
				CategoryAxis axis = categoryPlot.getDomainAxis();
				axis.setMaximumCategoryLabelLines(
					PropertyUtils.getIntegerProperty(jasperChart, "CategoryLabelLines", 1));
				axis.setMaximumCategoryLabelWidthRatio(1.0f);
			}
		}
	}

}
