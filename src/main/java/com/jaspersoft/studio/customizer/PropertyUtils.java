package com.jaspersoft.studio.customizer;

import net.sf.jasperreports.engine.JRChart;

public final class PropertyUtils {
    private PropertyUtils() { }

    static boolean hasProperty(JRChart jasperChart, String propertyName) {
        return jasperChart.hasProperties() 
            && jasperChart.getPropertiesMap().containsProperty(propertyName);
    }

    static Boolean getBooleanProperty(JRChart jasperChart, String propertyName, Boolean defaultValue) {
        try {
            return hasProperty(jasperChart, propertyName) 
                ? Boolean.valueOf(jasperChart.getPropertiesMap().getProperty(propertyName)) 
                : defaultValue;
        } catch (Exception e) {
            return defaultValue;
        }
    }

    static Integer getIntegerProperty(JRChart jasperChart, String propertyName, Integer defaultValue) {
        try {
            return hasProperty(jasperChart, propertyName) 
                ? Integer.valueOf(jasperChart.getPropertiesMap().getProperty(propertyName)) 
                : defaultValue;
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    static Float getFloatProperty(JRChart jasperChart, String propertyName, Float defaultValue) {
        try {
            return hasProperty(jasperChart, propertyName) 
                ? Float.valueOf(jasperChart.getPropertiesMap().getProperty(propertyName)) 
                : defaultValue;
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

    static Double getDoubleProperty(JRChart jasperChart, String propertyName, Double defaultValue) {
        try {
            return hasProperty(jasperChart, propertyName) 
                ? Double.valueOf(jasperChart.getPropertiesMap().getProperty(propertyName)) 
                : defaultValue;
        } catch (NumberFormatException e) {
            return defaultValue;
        }
    }

}
