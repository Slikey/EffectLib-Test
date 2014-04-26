package de.slikey.effectlib.test.command;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.ImageLocationEffect;
import de.slikey.effectlib.util.ParticleEffect;

public final class ImageCommand extends CommandBase {

	private final JavaPlugin plugin;

	public ImageCommand(JavaPlugin plugin, EffectManager em) {
		super(em);
		this.plugin = plugin;
	}

	@Override
	protected void effect(final Player player) {
		try {
			File file = new File(plugin.getDataFolder().getAbsolutePath() + "/batman.png");
			ImageLocationEffect effect = new ImageLocationEffect(em, player.getEyeLocation(), file);
			effect.visibleRange = 32;
			effect.start();
		} catch (Exception e) {
			Bukkit.broadcastMessage("Image not found.");
		}
	}
}
