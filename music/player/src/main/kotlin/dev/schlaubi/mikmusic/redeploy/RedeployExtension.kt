package dev.schlaubi.mikmusic.redeploy

import dev.kordex.core.ExtensibleBot
import dev.kordex.core.koin.KordExKoinComponent
import dev.schlaubi.mikbot.core.redeploy_hook.api.RedeployExtensionPoint
import dev.schlaubi.mikmusic.core.MusicModule
import org.koin.core.component.inject
import org.pf4j.Extension

@Extension
class RedeployExtension : RedeployExtensionPoint, KordExKoinComponent {
    val bot by inject<ExtensibleBot>()
    override suspend fun beforeRedeploy() {
        val musicModule = bot.findExtension<MusicModule>() ?: return

        musicModule.savePlayerStates()
        musicModule.disconnect()
    }
}
