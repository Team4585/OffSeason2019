package frc.robot.biblioteca;
import frc.robot.biblioteca.analogInput;
import edu.wpi.first.wpilibj.Joystick;

public class joystickAxis extends analogInput {
    private int m_axisNumber;
    private Joystick m_controller;
    public joystickAxis(int number, Joystick j) {
        super();
        m_axisNumber = number;
        m_controller = j;
    }
    @Override
    public void gatherInfo() {
        setValue(m_controller.getRawAxis(m_axisNumber));
    };
}