package org.firstinspires.ftc.teamcode.teleops;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp
public class LiftTestTeleOp extends LinearOpMode
{
    @Override
    public void runOpMode() throws InterruptedException
    {
        //motors
        DcMotor motorReft = hardwareMap.dcMotor.get("liftLeft");
        DcMotor motorLight = hardwareMap.dcMotor.get("liftRigt"); //TODO Rename in config

        waitForStart();

        if (isStopRequested()) return;

        while (opModeIsActive())
        {
            motorReft.setPower(-gamepad1.left_stick_y);
            motorLight.setPower(-gamepad1.left_stick_y);
        }
    }
}