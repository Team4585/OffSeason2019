package frc.robot.biblioteca;
import frc.robot.biblioteca.roboBaseClass;

class analogInput extends roboBaseClass {
    private double m_currentValue;
    private double m_maxValue = 1;
    private double m_minValue = -1;
    public analogInput() {
        super();
        m_maxValue = 1;
        m_minValue = -1;
    }
    public analogInput(double max, double min) {
        super();
        m_maxValue = max;
        m_minValue = min;
    }
    public double getValue() {
        return(m_currentValue);
    }
    public double getMax() {
        return(m_maxValue);
    }
    public double getMin() {
        return(m_minValue);
    }
    protected void setValue(double value) {
        if (value < m_minValue) {
            m_currentValue = m_minValue;
        } else if (value > m_maxValue) {
            m_currentValue = m_maxValue;
        } else {
            m_currentValue = value;
        }
    }
    public void setMax(double max) {
        m_maxValue = max;
    }
    public void setMin(double min) {
        m_minValue = min;
    }
}