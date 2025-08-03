package com.jaspersoft.studio.customizer;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.*;

// https://mdahlman.wordpress.com/2010/08/18/chart-customizers-1/
public class PieLabelsInvisible extends JRAbstractChartCustomizer implements JRChartCustomizer {

	@Override
	public void customize(JFreeChart chart, JRChart jasperChart) {
		// This customizer works only with Pie Charts.
		// It silently ignores all other chart types.
		Plot plot = chart.getPlot();
		if (plot instanceof PiePlot) {
			PiePlot piePlot = (PiePlot)plot;
			piePlot.setLabelGenerator(null);
			// Example of hard-coding the label font
			//piePlot.setLabelFont(new Font("Verdana",Font.PLAIN,8));
		}
	}

}
