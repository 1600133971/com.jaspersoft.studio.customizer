package com.jaspersoft.studio.customizer;

import java.awt.Color;
import java.awt.RadialGradientPaint;
import java.awt.geom.Point2D;

import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.Plot;

import net.sf.jasperreports.engine.JRAbstractChartCustomizer;
import net.sf.jasperreports.engine.JRChart;
import net.sf.jasperreports.engine.JRChartCustomizer;

// https://helicaltech.com/fixed-series-color-in-jasper-jfree-charts/
public class PiePlotSectionPaint extends JRAbstractChartCustomizer implements JRChartCustomizer {

	@Override
	public void customize(JFreeChart chart, JRChart jasperChart) {
		Plot plot = chart.getPlot();
		if (plot instanceof PiePlot) {
			PiePlot piePlot = (PiePlot)plot;
			//piePlot.setSectionPaint("seies1", new Color(63, 156, 53));
			//piePlot.setSectionPaint("seies2", new Color(0, 152, 219));
			//piePlot.setSectionPaint("seies3", new Color(140, 24, 154));
			//piePlot.setSectionPaint("seies4", new Color(233, 131, 0));
			
			piePlot.setSectionPaint("English", createGradientPaint(new Color(200, 200, 255), Color.BLUE));
			piePlot.setSectionPaint("SocialStudies", createGradientPaint(new Color(255, 200, 200), Color.RED));
			piePlot.setSectionPaint("Maths", createGradientPaint(new Color(200, 255, 200), Color.GREEN));
			piePlot.setSectionPaint("Hindi", createGradientPaint(new Color(200, 255, 200), Color.YELLOW));
			piePlot.setSectionPaint("Scince", createGradientPaint(new Color(0, 255, 200), Color.CYAN));
		}
	}

	RadialGradientPaint createGradientPaint(Color c1, Color c2) {
		Point2D center = new Point2D.Float(0, 0);
		float radius = 200;
		float[] dist = {0.0f, 1.0f};
		return new RadialGradientPaint(center, radius, dist, new Color[] {c1, c2});
	}

}
