plugins {
    `mikbot-plugin`
    `mikbot-module`
}

group = "dev.schlaubi.mikbot"
version = "1.1.0"

dependencies {
    plugin(projects.game.gameApi)
    optionalPlugin(projects.core.gdpr)
}