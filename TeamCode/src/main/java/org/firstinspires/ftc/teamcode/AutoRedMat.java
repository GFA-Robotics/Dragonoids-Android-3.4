package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

/**
 * Created by Dragonoids on 2/27/2017.
 */
@Autonomous(name="Auto Red Mat", group="Red")
public class AutoRedMat extends DragonoidsAuto{

    @Override
    public void runOpMode() throws InterruptedException {
        super.runOpMode();

        while (opModeIsActive()) {

            liftGlyph();
            int key = photoSense();
            knock(true);
            forward(-.9,.3);
            turn(-90);
            chooseGlyph(key, true);
            releaseGlyph();
            multiGlyph(key,true);
            break;
        }
    }
}

