package com.jaspersoft.studio.customizer;

import java.awt.Color;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.data.category.CategoryDataset;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

// https://helicaltech.com/fixed-series-color-in-jasper-jfree-charts/
public class StackedBarSectionPaint extends JRAbstractChartCustomizer implements JRChartCustomizer {

	@Override
	public void customize(JFreeChart chart, JRChart jasperChart) {
		CategoryItemRenderer renderer = chart.getCategoryPlot().getRenderer();
		CategoryDataset catDS = chart.getCategoryPlot().getDataset();
		Color seriesColor = null;
		for (int i = 0; i < catDS.getRowCount(); i++) {
			if (catDS.getRowKey(i).toString().equalsIgnoreCase("series1")) {
				seriesColor = new Color(255, 175, 175);
			} else if (catDS.getRowKey(i).toString().equalsIgnoreCase("series2")) {
				seriesColor = new Color(166, 25, 46);
			} else if (catDS.getRowKey(i).toString().equalsIgnoreCase("series3")) {
				seriesColor = new Color(63, 156, 53);
			} else if (catDS.getRowKey(i).toString().equalsIgnoreCase("series4")) {
				seriesColor = new Color(16, 24, 32);
			}
			renderer.setSeriesPaint(catDS.getRowIndex(catDS.getRowKey(i)), seriesColor);
		}
	}

}
