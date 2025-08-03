package com.jaspersoft.studio.customizer;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.*;

// https://mdahlman.wordpress.com/2010/08/18/chart-customizers-1/
public class UpperMargin extends JRAbstractChartCustomizer implements JRChartCustomizer {

	@Override
	public void customize(JFreeChart chart, JRChart jasperChart) {
		if (PropertyUtils.hasProperty(jasperChart, "UpperMargin")) {
			// This customizer works only with Category Plots (like Line Charts and Bar Charts).
			// It silently ignores all other chart types.
			Plot plot = chart.getPlot();
			if (plot instanceof CategoryPlot) {
				CategoryPlot categoryPlot = (CategoryPlot)plot;
				ValueAxis valueAxis = categoryPlot.getRangeAxis();
				
				// The default upper margin is 5%.
				// This is nearly always no good if labels are displayed.
				// We need to calculate the height needed for the top label
				// and then set the upper margin appropriately.
				// Instead of doing that, I hard-code the margin to 40% for this test.
				valueAxis.setUpperMargin(
					PropertyUtils.getDoubleProperty(jasperChart, "UpperMargin", 0.40));
			}
		}
	}

}
