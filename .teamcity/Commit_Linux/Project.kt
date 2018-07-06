package Commit_Linux

import Commit_Linux.buildTypes.Commit_Eclipse42Build
import Commit_Linux.buildTypes.Commit_Eclipse47Build
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("Commit_Linux")
    name = "Commit Builds Linux"

    buildType(Commit_Eclipse47Build)
    buildType(Commit_Eclipse42Build)
})