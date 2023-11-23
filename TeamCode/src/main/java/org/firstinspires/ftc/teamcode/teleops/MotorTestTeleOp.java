package org.firstinspires.ftc.teamcode.teleops;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.subsystems.MecanumDrive;

@TeleOp
public class MotorTestTeleOp extends LinearOpMode
{
    @Override
    public void runOpMode() throws InterruptedException
    {
        //motors
        DcMotor testMotor  = hardwareMap.dcMotor.get("test");

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive())
        {
            double testPower = -gamepad1.left_stick_y;

            testMotor.setPower(testPower);
        }
    }
}