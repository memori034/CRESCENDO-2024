// Copyright (c) 2024 FRC 3256
// https://github.com/Team3256
//
// Use of this source code is governed by a 
// license that can be found in the LICENSE file at
// the root directory of this project.

package frc.robot.subsystems.pivotintake.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.pivotintake.PivotIntake;

public class PivotIntakeSlamAndVoltage extends SequentialCommandGroup {
  private final PivotIntake pivot;

  // position: 0 is ground, 1 is shooter
  public PivotIntakeSlamAndVoltage(PivotIntake pivot) {
    this.pivot = pivot;
    addRequirements(pivot);

    addCommands(
        new PivotIntakeSetAngle(pivot, 0).withTimeout(0.75),
        new PivotIntakeSlam(pivot, 0),
        new PivotIntakeStaticBrake(pivot));
  }
}
