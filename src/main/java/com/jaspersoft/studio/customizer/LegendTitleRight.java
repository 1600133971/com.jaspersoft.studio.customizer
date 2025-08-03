package com.jaspersoft.studio.customizer;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.title.LegendTitle;
import org.jfree.chart.title.Title;
import org.jfree.ui.HorizontalAlignment;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

public class LegendTitleRight extends JRAbstractChartCustomizer implements JRChartCustomizer {

	@Override
	public void customize(JFreeChart chart, JRChart jasperChart) {
		for (int i = 0; i < chart.getSubtitleCount(); i++) {
			Title title = chart.getSubtitle(i);
			if (title instanceof LegendTitle) {
				title.setHorizontalAlignment(HorizontalAlignment.RIGHT);
			}
		}
	}

}
