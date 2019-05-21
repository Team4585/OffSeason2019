package frc.robot.biblioteca;
import frc.robot.biblioteca.digitalOutput;
import edu.wpi.first.wpilibj.AnalogOutput;

public class linearActuator extends analogOutput {
    private int m_port;
    private AnalogOutput m_l;
    public linearActuator(int port) {
        super(2, 1);
        m_port = port;
        m_l = new AnalogOutput(port);
    }
    @Override
    public void doActions() {
        m_l.setVoltage(getValue());
    }
}