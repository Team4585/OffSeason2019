package frc.robot.biblioteca;
import frc.robot.biblioteca.analogInput;
import edu.wpi.first.wpilibj.Joystick;

public class joystickButton extends digitalInput {
    private int m_buttonNumber;
    private Joystick m_controller;
    public joystickButton(int number, Joystick j) {
        super(false);
        m_buttonNumber = number;
        m_controller = j;
    }
    @Override
    public void gatherInfo() {
        setValue(m_controller.getRawButton(m_buttonNumber));
    };
}