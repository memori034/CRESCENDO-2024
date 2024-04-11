// Copyright (c) 2024 FRC 3256
// https://github.com/Team3256
//
// Use of this source code is governed by a 
// license that can be found in the LICENSE file at
// the root directory of this project.

package frc.robot.subsystems.swerve.commands;

import frc.robot.helpers.DebugCommandBase;
import frc.robot.subsystems.swerve.SwerveDrive;

public class ForceResetModulePositions extends DebugCommandBase {
  SwerveDrive swerveDrive;

  public ForceResetModulePositions(SwerveDrive swerveDrive) {
    this.swerveDrive = swerveDrive;
  }

  @Override
  public void initialize() {
    super.initialize();
    swerveDrive.resetModulesToAbsolute();
  }

  @Override
  public boolean isFinished() {
    return true;
  }
}
