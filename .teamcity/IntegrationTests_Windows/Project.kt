package IntegrationTests_Windows

import IntegrationTests_Windows.buildTypes.IntegrationTests_Windows_Eclipse44Build
import IntegrationTests_Windows.buildTypes.IntegrationTests_Windows_Eclipse47IntegrationTestsWindows
import jetbrains.buildServer.configs.kotlin.v2018_1.Project

object Project : Project({
    id("IntegrationTests_Windows")
    name = "Integration Tests Windows"

    buildType(IntegrationTests_Windows_Eclipse44Build)
    buildType(IntegrationTests_Windows_Eclipse47IntegrationTestsWindows)
})